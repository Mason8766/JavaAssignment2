package com.example.javaassignment2;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {
    //creating a object based of the JsonAPI file.
    public static  RAWGResponse getGamesFromJSON(){
        Gson gson = new Gson();
        RAWGResponse results = null;

        try(
                FileReader fileReader = new FileReader("jsonAPI.json");
                JsonReader jsonReader = new JsonReader(fileReader);
        )
        {
            results = gson.fromJson(jsonReader, RAWGResponse.class);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return results;
    }
    public static RAWGResponse getMoviesFromAPI(String searchText) throws IOException, InterruptedException {// throws IOException, InterruptedException
        RAWGResponse result = null;

        //what game the user is looking for, currently not set up
        searchText = searchText.replace(" ", "%20");


        String uri = "https://rawg.io/api/games/metaaaal-gear?key=2fd12698875a4afb890387e20927f1ab";//url to call the json



        //writes the json to jsonAPI.json
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers
                .ofFile(Paths.get("jsonAPI.json")));



        return null;
    }
}
