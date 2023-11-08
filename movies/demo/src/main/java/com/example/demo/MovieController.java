package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class MovieController {

    public static void main(String[] args) {
        SpringApplication.run(MovieController.class, args);
      }

    @GetMapping("/movies")
    public List<String> getMovies() {
        List<String> movies = new ArrayList<>();
        movies.add("Interestelar ");
        movies.add("La La Land");
        movies.add("Gravedad");
        return movies;
    }
}
