package com.teemo.shrooms.riot.request;

import com.teemo.shrooms.riot.RiotServerRequest;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class LolStaticDataRequest extends RiotServerRequest {

    public LolStaticDataRequest(){
        super("api/lol/static-data/na/v1.2");
    }

    /*
     *  champData = all, allytips, altimages, blurb, enemytips, image, info, lore, partype, passive, recommended, skins, spells, stats, tags
     */
    public String getAllChampions(Map<String, String> params){
        String endPoint = "champion";
        return request(endPoint, params);
    }

    public String getChampionById(String id, Map<String, String> params) {
        String endPoint = "champion/" + id;
        return request(endPoint, params);
    }

}
