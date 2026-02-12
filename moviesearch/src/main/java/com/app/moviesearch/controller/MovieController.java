package com.app.moviesearch.controller;

import com.app.moviesearch.model.Movie;
import com.app.moviesearch.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {

    @GetMapping("/showForm")
    public String showForm(Model m) {
        Movie movie = new Movie();
        m.addAttribute("movie", movie);
        return "movie";
    }

    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("movie") Movie movie, Model m) {
        MovieService movieService = new MovieService();
        m.addAttribute("result", movieService.getMovieByTitle(movie.getTitle()));
        return "processForm";

    }


}
