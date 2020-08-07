package de.blackrose01;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import de.blackrose01.model.TimeToBeat;
import de.blackrose01.test.EndpointPublic;

public class App {
    public static void main( String[] args ) {
        String apiKey = "";
        String baseUrl = "https://api-v3.igdb.com";
        Parameters p = new Parameters();

        p.addFields("*");

        IgdbWrapper wrapper = new IgdbWrapper(apiKey, baseUrl);
        TimeToBeat[] g = wrapper.sendRequest(EndpointPublic.Time_to_Beat, p, TimeToBeat[].class);

        JsonParser parser = new JsonParser();
        JsonObject json = parser.parse(g[0].toString()).getAsJsonObject();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(json);
        System.out.println(prettyJson);
    }
}
