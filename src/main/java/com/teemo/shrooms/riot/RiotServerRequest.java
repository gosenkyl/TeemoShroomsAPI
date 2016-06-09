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
    private static final String HOST = "api.pvp.net/api/lol";

    private static final String  API_KEY = "5cce8c73-53e1-4ba5-ae3a-82e55cf3d299";

    private String version;
    private String region;

    private String url = "";

    public RiotServerRequest(String version, String region){
        this.version = version;
        this.region = region;

        this.url = SCHEME + "://" + ENV + "." + HOST + "/" + this.region + "/v" + this.version;
    }

    protected String request(String endPoint) throws IOException, ParseException {
        return request(endPoint, null);
    }

    protected String request(String endPoint, Map<String, String> params) throws IOException, ParseException {
        URL request = new URL(formatURL(endPoint, params));
        System.out.println("URL is: " + request.getPath());
        URLConnection api = request.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(api.getInputStream()));
        String output = IOUtils.toString(in);
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

    /*public static String getRecentGame(String region, long id) throws Exception {
        String call = "game/by-summoner/" + id + "/recent";

        //add API URL to the call
        call = API_URL_1_1 + call;

        return request(region,call);
    }

    public static String getLeague(String region, long id) throws Exception {
        String call = "league/by-summoner/" + id;

        //add API URL to the call
        call = API_URL_2_1 + call;

        return request(region, call);
    }

    public static String getStats(String region,long id, STATS_OPTIONS options)  throws Exception {
        String call = "stats/by-summoner/"  + id + "/";
        switch (options) {
            case SUMMARY:
                call += "summary";
                break;
            case RANKED:
                call += "ranked";
                break;
            default:
                break;
        }
        //add API URL to the call
        call = API_URL_1_1 + call;

        return request(region,call);
    }

    public static String getSummoner(String region, long id, SUMMONER_OPTIONS option) throws Exception {
        String call = "summoner/" + id;
        switch (option) {
            case MASTERIES:
                call += "/masteries";
                break;
            case RUNES:
                call += "/runes";
                break;
            case ID:
                // just return because the strings should is already
                // built
                break;
            default:
                //do nothing
                break;
        }
        //add API URL to the call
        call = API_URL_1_1 + call;
        return request(region,call);
    }

    public static String getSummonerNameListByIDs (String region, String idList) throws Exception{
        String call = "summoner/" + idList + "/name";
        call = API_URL_1_1 + call;
        return request(region, call);
    }

    public static String getSummonerByName(String region, String name) throws Exception {
        String call = "summoner/by-name/" + name;

        //add API URL to the call
        call = API_URL_1_1 + call;
        System.out.println("Call: " + call);
        return request(region,call);
    }

    public static String getTeam(String region, long id) throws Exception {
        String call = "team/by-summoner/" + id;

        //add API URL to the call
        call = API_URL_2_1 + call;

        return request(region, call);
    }*/
}