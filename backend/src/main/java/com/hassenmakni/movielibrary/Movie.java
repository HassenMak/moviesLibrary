package com.hassenmakni.movielibrary;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "title", "director", "releaseDate", "type" })
public class Movie {

	@JsonProperty("title")
	private String title;
	@JsonProperty("director")
	private String director;
	@JsonProperty("releaseDate")
	private String releaseDate;
	@JsonProperty("type")
	private String type;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("director")
	public String getDirector() {
		return director;
	}

	@JsonProperty("director")
	public void setDirector(String director) {
		this.director = director;
	}

	@JsonProperty("releaseDate")
	public String getReleaseDate() {
		return releaseDate;
	}

	@JsonProperty("releaseDate")
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}