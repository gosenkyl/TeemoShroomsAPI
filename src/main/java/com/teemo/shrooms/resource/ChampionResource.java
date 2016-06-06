package com.teemo.shrooms.resource;


import com.teemo.shrooms.dso.Champion;
import com.teemo.shrooms.service.ChampionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/champions")
@CrossOrigin
public class ChampionResource {

    @Autowired
    private ChampionService championService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Champion> getAllChampions(){
        return championService.getAll();
    }

    @RequestMapping(value = "/{championId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Champion getChampionById(@PathVariable String championId){
        return championService.findById(championId);
    }

}
