package com.rakuten.training;

import java.util.List;

import org.springframework.context.ApplicationContext;

import com.rakuten.training.dal.MovieDAO;
import com.rakuten.training.domain.Movie;

public class TestCode {

	public static void testMovieDAO(ApplicationContext springContainer) {
		MovieDAO dao = springContainer.getBean(MovieDAO.class);
		
		Movie aProduct = new Movie("Bye","ENDGAME",6,80,"Many");
		Movie saved = dao.save(aProduct);
		System.out.println("Saved Product with id : "+saved.getId());
		List<Movie> f = dao.findAll();
		System.out.println(f.size());
		System.out.println(dao.findByNumSongsGreaterThan(2));
	}

}
