package com.app.moviesearch.model;

public class Movie {
    private String title;
    private String description;
    private double rating;
    private String posterURI;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getPosterURI() {
        return posterURI;
    }

    public void setPosterURI(String posterURI) {
        this.posterURI = posterURI;
    }

    @Override
    public String toString() {
        return "Title " + title + '\n' +  ", Plot: " + description + '\n' +  "imdbRating rating:    " + rating;
    }
}
