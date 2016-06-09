package com.teemo.shrooms.riot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;

import com.teemo.shrooms.riot.dto.ChampionList;
import com.teemo.shrooms.riot.dto.Summoner;

import java.io.IOException;

public class RiotAPI {

    private ObjectMapper mapper;
    private String region;
    private long ID;

    public RiotAPI (String region, long ID) {
        this.region = region;
        this.ID = ID;
        init();
    }

    private void init(){
        mapper = new ObjectMapper(); // create once, reuse
        mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
        mapper.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, true);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
        mapper.getSerializerProvider().setNullKeySerializer(new NullKeySerializer());
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public ChampionList getChampionList() throws Exception {
        return null;//mapper.readValue(RiotServerRequest.getAllChampions(region), ChampionList.class);
    }

    /*public RecentGames getRecentGames() throws Exception {
        return mapper.readValue(RiotServerRequest.getRecentGame(region, ID), RecentGames.class);
    }

    public Map<String, League> getLeague () throws Exception {
        return mapper.readValue(RiotServerRequest.getLeague(region, ID),
                new TypeReference<Map<String, League>>() { } );
    }

    public PlayerStatsSummaryList getSummaryStats () throws Exception {
        return mapper.readValue(RiotServerRequest.getStats(region, ID, RiotServerRequest.STATS_OPTIONS.SUMMARY), PlayerStatsSummaryList.class);
    }

    public RankedStats getRankedStats () throws Exception {
        return mapper.readValue(RiotServerRequest.getStats(region, ID, RiotServerRequest.STATS_OPTIONS.RANKED), RankedStats.class);
    }

    public RunePages getSummonersRunes () throws Exception {
        return mapper.readValue(RiotServerRequest.getSummoner(region, ID, RiotServerRequest.SUMMONER_OPTIONS.RUNES), RunePages.class);
    }

    public MasteryPages getSummonersMasteries () throws Exception {
        return mapper.readValue(RiotServerRequest.getSummoner(region, ID, RiotServerRequest.SUMMONER_OPTIONS.MASTERIES), MasteryPages.class);
    }

    public Summoner getSummonerByName (String name) throws Exception {
        return mapper.readValue(RiotServerRequest.getSummonerByName(region, name), Summoner.class);
    }

    /*public SummonerNameList getSummonerNameListByIDs (String nameIDs) throws Exception {
        return mapper.readValue(RiotServerRequest.getSummonerNameListByIDs(region, nameIDs), SummonerNameList.class);
    }

    public List<Team> getTeam () throws Exception {
        return mapper.readValue(RiotServerRequest.getTeam(region, ID),
                new TypeReference<List<Team>>() { } );
    }*/

    private class NullKeySerializer extends JsonSerializer<Object>{
        @Override
        public void serialize(Object nullKey, JsonGenerator jsonGenerator, SerializerProvider unused)
                throws IOException, JsonProcessingException
        {
            jsonGenerator.writeFieldName("");
        }
    }
}
