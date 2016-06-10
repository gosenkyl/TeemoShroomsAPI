package com.teemo.shrooms.riot.dto.staticdata;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

public class ChampionList {

    @JsonDeserialize(contentAs=Champion.class)
    private List<Champion> champions;

    public List<Champion> getChampions (){
        return this.champions;
    }

    public void setChampions (List<Champion> champions) {
        this.champions = champions;
    }

}
