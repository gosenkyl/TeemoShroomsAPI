package com.teemo.shrooms.resource;

import com.teemo.shrooms.riot.dto.staticdata.Champion;
import com.teemo.shrooms.riot.dto.staticdata.ChampionList;
import com.teemo.shrooms.util.ChampionListCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/lol-static-datas")
@CrossOrigin
public class LolStaticDataResource {

    @Autowired
    private ChampionListCache championListCache;

    @RequestMapping(value = "champions", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ChampionList getAllChampions(@RequestParam Map<String, String> params){
        return championListCache.getChampionList();
    }

    @RequestMapping(value = "champions/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Champion getChampionById(@PathVariable String id, @RequestParam Map<String, String> params){
        return championListCache.getChampion(id);
    }



}
