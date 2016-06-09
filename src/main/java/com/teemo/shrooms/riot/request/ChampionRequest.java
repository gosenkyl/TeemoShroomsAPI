package com.teemo.shrooms.riot.request;

import com.teemo.shrooms.riot.RiotServerRequest;
import org.springframework.stereotype.Component;

@Component
public class ChampionRequest extends RiotServerRequest {

    public ChampionRequest(){
        super("1.2", "na");
    }

    public String getAllChampions() throws Exception {
        String endPoint = "champion";
        return request(endPoint);
    }

}
