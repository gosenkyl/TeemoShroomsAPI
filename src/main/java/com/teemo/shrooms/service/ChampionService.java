package com.teemo.shrooms.service;

import com.teemo.shrooms.dso.Champion;
import com.teemo.shrooms.repository.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.common.collect.Lists;

import java.util.List;

@Service
public class ChampionService {

    @Autowired
    private ChampionRepository championRepository;

    public Champion findById(String id){
        return championRepository.findOne(id);
    }

    public List<Champion> getAll(){
        return Lists.newArrayList(championRepository.findAll());
    }


}
