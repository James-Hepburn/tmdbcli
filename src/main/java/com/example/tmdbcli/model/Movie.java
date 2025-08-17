package com.example.tmdbcli.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String title;
    private String releaseDate;
    private double voteAverage;
    private int voteCount;
    private String overview;
}
