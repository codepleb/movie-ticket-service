package com.zuehlke;

import com.zuehlke.movie.movieservice.MovieServiceAdapter;
import com.zuehlke.movie.rating.RatingAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MovieTicketServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieTicketServiceApplication.class, args);
    }

    @Bean
    public MovieServiceAdapter movieServiceAdapter(@Value("${movie.service.link}") String movieServiceLink) {
        return new MovieServiceAdapter(movieServiceLink);
    }

    @Bean
    public RatingAdapter ratingAdapter(@Value("${movie.rating.link}") String movieRatingLink) {
        return new RatingAdapter(movieRatingLink);
    }

}
