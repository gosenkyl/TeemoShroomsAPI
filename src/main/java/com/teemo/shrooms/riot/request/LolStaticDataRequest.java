package com.teemo.shrooms.riot.request;

import com.teemo.shrooms.riot.RiotServerRequest;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class LolStaticDataRequest extends RiotServerRequest {

    public LolStaticDataRequest(){
        super("api/lol/static-data", "1.2", "na");
    }

    /*
     *  champData = all, allytips, altimages, blurb, enemytips, image, info, lore, partype, passive, recommended, skins, spells, stats, tags
     */
    public String getAllChampions(Map<String, String> params) throws Exception {
        String endPoint = "champion";
        return request(endPoint, params);
    }

    public String getChampionById(String id, Map<String, String> params) throws Exception {
        String endPoint = "champion/" + id;
        return request(endPoint, params);
    }

}
