package com.rakuten.training.dal;

import java.util.List;

import com.rakuten.training.domain.Movie;

public interface MovieDAO {
	public Movie save(Movie toBeSaved);
	public Movie findById(int id);
	public List<Movie> findAll();
	public void deleteById(int id);
	public List<Movie> findByGenre(String genre);
	public int findByNumSongsGreaterThan(int num);
	public List<Movie> findByNameLike(String name);
}
