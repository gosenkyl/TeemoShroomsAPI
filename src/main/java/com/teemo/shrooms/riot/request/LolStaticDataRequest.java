package com.teemo.shrooms.riot.request;

import com.teemo.shrooms.riot.RiotServerRequest;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class LolStaticDataRequest extends RiotServerRequest {

    public LolStaticDataRequest(){
        super("api/lol/static-data", "1.2", "na");
    }

    public String getAllChampions() throws Exception {
        String endPoint = "champion";
        Map<String, String> params = new HashMap<>();
        params.put("champData", "all");
        return request(endPoint, params);
    }

    public String getChampionById(String id) throws Exception {
        String endPoint = "champion/" + id;
        Map<String, String> params = new HashMap<>();
        params.put("champData", "all");
        return request(endPoint, params);
    }

}
