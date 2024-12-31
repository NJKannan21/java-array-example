package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>  {
 
	private double rating;
	private String name;
	private int year;
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Movie(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	
	@Override
	public int compareTo(Movie o) {
				
		return this.year - o.year;
	}
	
	
	public static void main(String args[])
	{
		ArrayList<Movie> movies=new ArrayList<Movie>();
		movies.add(new Movie(8.3,"Forces Awakens",2015));
		movies.add(new Movie(8.7,"Star Wars",1977));
		movies.add(new Movie(8.8,"Empire Strikes Back",1980));
		movies.add(new Movie(8.4,"Return of the Jedi",1983));
		
		for(Movie movie:movies)
		{
			System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
		}
		
		Collections.sort(movies);
		System.out.println("===========================================================");
		
		for(Movie movie:movies)
		{
			System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
		}
	}
	
	
	
}
