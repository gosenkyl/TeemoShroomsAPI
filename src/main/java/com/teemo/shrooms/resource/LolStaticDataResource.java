package com.teemo.shrooms.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.teemo.shrooms.riot.dto.staticdata.Champion;
import com.teemo.shrooms.riot.dto.staticdata.ChampionList;
import com.teemo.shrooms.riot.request.LolStaticDataRequest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("api/lol-static-datas")
@CrossOrigin
public class LolStaticDataResource {

    @Autowired
    private LolStaticDataRequest lolStaticDataRequest;

    /*
     *  all, allytips, altimages, blurb, enemytips, image, info, lore, partype, passive, recommended, skins, spells, stats, tags
     */

    @RequestMapping(value = "champions", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ChampionList getAllChampions(){

        try {
            String results = lolStaticDataRequest.getAllChampions();
            ObjectMapper mapper = new ObjectMapper(); // create once, reuse
            mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
            mapper.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, true);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.getSerializerProvider().setNullKeySerializer(new NullKeySerializer());


            JSONObject obj = new JSONObject(results);
            JSONObject data = obj.getJSONObject("data");

            Iterator<String> keys = data.keys();
            List<Champion> champions = new ArrayList<>();
            while(keys.hasNext()) {
                String key = keys.next();
                JSONObject val = (JSONObject) data.get(key);

                champions.add(mapper.readValue(val.toString(), Champion.class));
            }

            ChampionList championList = new ChampionList();
            championList.setChampions(champions);

            return championList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "champions/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Champion getChampionById(@PathVariable String id){

        try {
            String results = lolStaticDataRequest.getChampionById(id);
            ObjectMapper mapper = new ObjectMapper(); // create once, reuse
            mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
            mapper.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, true);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.getSerializerProvider().setNullKeySerializer(new NullKeySerializer());

            return mapper.readValue(results, Champion.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private class NullKeySerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object nullKey, JsonGenerator jsonGenerator, SerializerProvider unused)
                throws IOException, JsonProcessingException
        {
            jsonGenerator.writeFieldName("");
        }
    }

}
