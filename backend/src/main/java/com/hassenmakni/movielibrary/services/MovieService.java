package com.hassenmakni.movielibrary.services;

import java.util.List;

import com.hassenmakni.movielibrary.Movie;

public interface MovieService {
	
 void addMovie(Movie m); 
 
 void removeMovie(Movie m); 
 
 void updateMovie(Movie m); 
 
 List<Movie> getMoviesList();

}
