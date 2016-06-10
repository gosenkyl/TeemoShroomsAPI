package com.teemo.shrooms.riot;

import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Map;

public abstract class RiotServerRequest {

    /*private static final String API_URL_1_1 = "https://{env}.api.pvp.net/api/lol/{region}/v1.2/";
    private static final String API_URL_2_1 = "https://{env}.api.pvp.net/api/{region}/v2.1/";*/

    public enum SUMMONER_OPTIONS {MASTERIES, RUNES, ID}
    public enum STATS_OPTIONS  {SUMMARY,RANKED}

    private static final String SCHEME = "https";
    private static final String ENV = "na";
    private static final String HOST = "api.pvp.net";

    private static final String API_KEY = "5cce8c73-53e1-4ba5-ae3a-82e55cf3d299";

    private String path;

    private String url = "";

    public RiotServerRequest(String path){
        this.path = path;

        this.url = SCHEME + "://" + ENV + "." + HOST + "/" + this.path;
    }

    protected String request(String endPoint) {
        return request(endPoint, null);
    }

    protected String request(String endPoint, Map<String, String> params) {
        URL request;
        URLConnection api;
        String output;

        try {
            request = new URL(formatURL(endPoint, params));
            System.out.println("URL is: " + request.getPath());
        } catch(Exception e){
            return "BAD_URL_FORMAT";
        }

        try {
            api = request.openConnection();
        } catch(Exception e){
            return "NO_CONNECTION";
        }

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(api.getInputStream()));
            output = IOUtils.toString(in);
        } catch(Exception e){
            return "CANT_READ";
        }

        System.out.println("Output: \n" + output);
        return output;
    }

    private String formatURL(String endPoint, Map<String, String> params){
        String url = this.url + "/" + endPoint + "?api_key=" + API_KEY;

        if(params != null && params.size() > 0) {
            Iterator it = params.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> param = (Map.Entry) it.next();
                url += "&" + param.getKey() + "=" + param.getValue();
            }
        }

        return url;
    }

}