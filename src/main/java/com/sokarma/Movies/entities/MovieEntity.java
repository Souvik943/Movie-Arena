package com.sokarma.Movies.entities;

import com.sokarma.Movies.constants.Constants;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer movieId;

    @Column
    @NotBlank(message = Constants.provideMovieTile)
    private String movieTitle;

    @Column
    @NotBlank(message = Constants.provideMovieDirector)
    private String movieDirector;

    @Column
    @NotBlank(message = Constants.provideMovieStudio)
    private String movieStudio;

    @Column
    @NotBlank(message = Constants.provideMovieCast)
    private Set<String> movieCast;

    @Column
    @NotBlank(message = Constants.provideMovieReleaseYear)
    private Integer movieReleaseYear;

    @Column
    private String moviePoster;
}
