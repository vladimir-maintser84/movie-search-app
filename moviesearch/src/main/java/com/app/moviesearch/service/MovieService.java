package com.app.moviesearch.service;

import com.app.moviesearch.model.Movie;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;


public class MovieService {
    public Movie getMovieByTitle(String title) {
        String URI = "https://www.omdbapi.com/?t=" + title + "&apikey=84fb5c06"; // you can get apikey from ombdAPI website
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(URI, String.class);
        JSONObject JSONresponse = new JSONObject(response);
        Movie resultMovie = new Movie();
        resultMovie.setTitle(JSONresponse.getString("Title"));
        resultMovie.setDescription(String.valueOf(JSONresponse.getString("Plot")));
        resultMovie.setRating(JSONresponse.getDouble("imdbRating"));
        resultMovie.setPosterURI(JSONresponse.getString("Poster"));
        return resultMovie;
    }
}
