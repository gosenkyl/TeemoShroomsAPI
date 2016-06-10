package com.teemo.shrooms.util;

import com.teemo.shrooms.riot.dto.staticdata.Champion;
import com.teemo.shrooms.riot.dto.staticdata.ChampionList;
import com.teemo.shrooms.riot.request.LolStaticDataRequest;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class ChampionListCache {

    @Autowired
    private CustomObjectMapper objectMapper;

    @Autowired
    private LolStaticDataRequest lolStaticDataRequest;

    private volatile ChampionList championList;
    private volatile Map<String, Champion> championMap;
    private volatile Date cacheTime;

    private static final Object lock = new Object();

    private static final int HOURS = 24;
    private static final long HOUR_IN_MILLISECONDS = 3600000;

    @PostConstruct
    public void init(){
        championList = new ChampionList();
        championMap = new HashMap<>();
        cacheChampions();
    }

    private boolean shouldRecache(){
        if(cacheTime == null || new Date().getTime() > cacheTime.getTime() + (HOURS * HOUR_IN_MILLISECONDS)){
            return true;
        }
        return false;
    }

    public Champion getChampion(String id){
        if(shouldRecache()){
            cacheChampions();
        }
        return championMap.get(id);
    }

    public ChampionList getChampionList(){
        if(shouldRecache()){
            cacheChampions();
        }
        return championList;
    }

    private void cacheChampions(){
        synchronized (lock) {

            championList.getChampions().clear();
            championMap.clear();

            try {
                Map<String, String> params = new HashMap<>();
                params.put("champData", "all");
                String results = lolStaticDataRequest.getAllChampions(params);

                JSONObject obj = new JSONObject(results);
                JSONObject data = obj.getJSONObject("data");

                Iterator<String> keys = data.keys();
                List<Champion> champions = new ArrayList<>();
                while(keys.hasNext()) {
                    String key = keys.next();
                    JSONObject val = (JSONObject) data.get(key);

                    Champion champion = objectMapper.readValue(val.toString(), Champion.class);

                    champions.add(champion);
                    championMap.put(String.valueOf(champion.getId()), champion);
                }

                championList.setChampions(champions);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        cacheTime = new Date();
    }

}
