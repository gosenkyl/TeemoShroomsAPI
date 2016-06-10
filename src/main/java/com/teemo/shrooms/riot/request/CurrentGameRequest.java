package com.teemo.shrooms.riot.request;

import com.teemo.shrooms.riot.RiotServerRequest;
import org.springframework.stereotype.Component;

@Component
public class CurrentGameRequest extends RiotServerRequest{

    public CurrentGameRequest(){
        super("observer-mode/rest/consumer/getSpectatorGameInfo/NA1");
    }

    public String getCurrentGame(String summonerId) {
        String endPoint = summonerId;
        return request(endPoint);
    }

}
