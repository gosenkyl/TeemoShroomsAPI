package com.teemo.shrooms.riot.request;

import com.teemo.shrooms.riot.RiotServerRequest;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ChampionRequest extends RiotServerRequest {

    public ChampionRequest(){
        super("api/lol/na/v1.2");
    }

    public String getAllChampions() {
        String endPoint = "champion";
        return request(endPoint);
    }

}
