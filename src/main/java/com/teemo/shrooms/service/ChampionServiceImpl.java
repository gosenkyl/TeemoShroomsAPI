package com.teemo.shrooms.service;

import com.teemo.shrooms.dso.Champion;
import com.teemo.shrooms.repository.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChampionServiceImpl extends BaseServiceImpl<Champion, ChampionRepository> implements ChampionService{

    @Autowired
    public ChampionServiceImpl(ChampionRepository repository){
        super(repository);
    }
}
