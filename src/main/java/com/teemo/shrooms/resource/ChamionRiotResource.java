package com.teemo.shrooms.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.teemo.shrooms.riot.dto.ChampionList;
import com.teemo.shrooms.riot.request.ChampionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/riot/champions")
@CrossOrigin
public class ChamionRiotResource {

    @Autowired
    private ChampionRequest championRequest;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ChampionList getAllChampions(){
        try {
            String results = championRequest.getAllChampions();
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(results, ChampionList.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /*@RequestMapping(value = "{championId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Champion getChampionById(@PathVariable String championId){
        return championService.findById(championId);
    }*/
}
