package com.hassenmakni.movielibrary.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.hassenmakni.movielibrary.services.MovieService;

@RestController()
@RequestMapping("/api")
public class BackendController {

	private static final Logger LOG = LoggerFactory.getLogger(BackendController.class);

	// This is temporary because I have a beug when I try to retrieve the file bdd.json in resources
	public static final String MOVIES = "[\n" + 
			"  {\n" + 
			"    \"title\":\"Ocean's 8\",\n" + 
			"    \"director\":\"Gary Ross\",\n" + 
			"    \"releaseDate\":\"13/06/2018\",\n" + 
			"    \"type\":\"action\"\n" + 
			"  },\n" + 
			"  {\n" + 
			"    \"title\":\"Solo: A Star Wars Story\",\n" + 
			"    \"director\":\"Ron Howard\",\n" + 
			"    \"releaseDate\":\"23/05/2018\",\n" + 
			"    \"type\":\"Sci-Fi\"\n" + 
			"  },\n" + 
			"  {\n" + 
			"    \"title\":\"Deadpool 2\",\n" + 
			"    \"director\":\"David Leitch\",\n" + 
			"    \"releaseDate\":\"16/05/2018\",\n" + 
			"    \"type\":\"Comedy\"\n" + 
			"  },\n" + 
			"  {\n" + 
			"    \"title\":\"Avengers: Infinite War\",\n" + 
			"    \"director\":\"Anthony Russo, Joe Russo\",\n" + 
			"    \"releaseDate\":\"25/04/2018\",\n" + 
			"    \"type\":\"action\"\n" + 
			"  },\n" + 
			"  {\n" + 
			"    \"title\":\"The First Purge\",\n" + 
			"    \"director\":\"Gerard McMurray\",\n" + 
			"    \"releaseDate\":\"04/07/2018\",\n" + 
			"    \"type\":\"Horror\"\n" + 
			"  },\n" + 
			"  {\n" + 
			"    \"title\":\"Mission: Impossible - Fallout\",\n" + 
			"    \"director\":\"Christopher McQuarrie\",\n" + 
			"    \"releaseDate\":\"01/08/2018\",\n" + 
			"    \"type\":\"Thriller\"\n" + 
			"  },\n" + 
			"  {\n" + 
			"    \"title\":\"The Mummy\",\n" + 
			"    \"director\":\"Christopher McQuarrie\",\n" + 
			"    \"releaseDate\":\"14/06/2017\",\n" + 
			"    \"type\":\"Fantasy\"\n" + 
			"  },\n" + 
			"  {\n" + 
			"    \"title\":\"Hunger Games\",\n" + 
			"    \"director\":\"Gary Ross\",\n" + 
			"    \"releaseDate\":\"21/03/2012\",\n" + 
			"    \"type\":\"Thriller\"\n" + 
			"  },\n" + 
			"  {\n" + 
			"    \"title\":\"John Wick\",\n" + 
			"    \"director\":\"David Leitch\",\n" + 
			"    \"releaseDate\":\"29/10/2014\",\n" + 
			"    \"type\":\"Thriller\"\n" + 
			"  }\n" + 
			"]";
	
//	@Autowired
//	private MovieService movieService;

//	@Autowired
//	private UserRepository userRepository;

	@RequestMapping(path = "/movies")
	public @ResponseBody String sayHello() {
		LOG.info("GET called on /movies resource");
		
		// Here is what I wanted to return 
//		return movieService.getMoviesList().toString();
		 
		return MOVIES;
	}

//	@RequestMapping(path = "/user", method = RequestMethod.POST)
//	@ResponseStatus(HttpStatus.CREATED)
//	public @ResponseBody long addNewUser(@RequestParam String firstName, @RequestParam String lastName) {
//		User user = new User(firstName, lastName);
//		userRepository.save(user);
//
//		LOG.info(user.toString() + " successfully saved into DB");
//
//		return user.getId();
//	}

//	@GetMapping(path = "/user/{id}")
//	public @ResponseBody User getUserById(@PathVariable("id") long id) {
//		LOG.info("Reading user with id " + id + " from database.");
//		return userRepository.findById(id).get();
//	}

}
