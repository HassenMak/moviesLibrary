package com.hassenmakni.movielibrary.services;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hassenmakni.movielibrary.Movie;

@Service
public class MovieServiceImpl implements MovieService{
	
	public List<Movie> moviesList;
	
//	@PostConstruct
//	public void onInit() {
//		ObjectMapper objectMapper = new ObjectMapper();
//		try {
//			ClassLoader classLoader = getClass().getClassLoader();
//			File file = new File(classLoader.getResource("bdd.json").getFile());
//			
//			List<Movie> listMovies = objectMapper.readValue(file, new TypeReference<List<Movie>>(){});
//			this.moviesList = listMovies;
//			
//		} catch (JsonParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	@Override
	public List<Movie> getMoviesList() {
		return moviesList;
	}

	@Override
	public void addMovie(Movie m) {
		// TODO Auto-generated method stub 
		
	}

	@Override
	public void removeMovie(Movie m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMovie(Movie m) {
		// TODO Auto-generated method stub
		
	}
	
	

}
