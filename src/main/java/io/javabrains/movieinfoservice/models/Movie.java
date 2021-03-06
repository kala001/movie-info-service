package io.javabrains.movieinfoservice.models;

public class Movie {
	
	private String movieId;
	private String name;
	private String movieDescription;
	
	public Movie(String movieId, String name, String movieDescription) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.movieDescription = movieDescription;
	}
	
	public Movie() {
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	
	

}
