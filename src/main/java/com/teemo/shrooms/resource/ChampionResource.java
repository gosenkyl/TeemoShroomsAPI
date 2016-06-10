package com.teemo.shrooms.resource;

import com.teemo.shrooms.riot.dto.ChampionList;
import com.teemo.shrooms.riot.request.ChampionRequest;
import com.teemo.shrooms.util.CustomObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/riot/champions")
@CrossOrigin
public class ChampionResource {

    @Autowired
    private CustomObjectMapper objectMapper;

    @Autowired
    private ChampionRequest championRequest;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ChampionList getAllChampions(){
        try {
            String results = championRequest.getAllChampions();
            return objectMapper.readValue(results, ChampionList.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
