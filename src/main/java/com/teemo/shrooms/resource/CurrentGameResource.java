package com.teemo.shrooms.resource;

import com.teemo.shrooms.riot.dto.currentgame.CurrentGameInfo;
import com.teemo.shrooms.riot.request.CurrentGameRequest;
import com.teemo.shrooms.util.CustomObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/riot/current-games")
@CrossOrigin
public class CurrentGameResource {

    @Autowired
    private CustomObjectMapper objectMapper;

    @Autowired
    private CurrentGameRequest currentGameRequest;

    @RequestMapping(value = "{summonerId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public CurrentGameInfo getAllChampions(@PathVariable String summonerId){
        try {
            String result = currentGameRequest.getCurrentGame(summonerId);

            if("BAD_URL_FORMAT".equals(result) || "NO_CONNECTION".equals(result) || "CANT_READ".equals(result)){
                System.out.println("No Current Game?!?");
                CurrentGameInfo dummy = new CurrentGameInfo();
                dummy.setGameId(-1);
                return dummy;
            }

            return objectMapper.readValue(result, CurrentGameInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
