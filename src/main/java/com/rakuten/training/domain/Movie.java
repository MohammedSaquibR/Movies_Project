package com.rakuten.training.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
		@Id
		@Column(name="movie_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY )
		int id;
		@Column(name="poster")
		String poster;
		@Column(name="name")
		String name;
		@Column(name="numSongs")
		int numSongs;
		@Column(name="numFights")
		int numFight;
		@Column(name="genre")
		String genre;
		
		public Movie() {
		}

		public Movie(String poster, String name, int numSongs, int numFight, String genre) {
			super();
			this.poster = poster;
			this.name = name;
			this.numSongs = numSongs;
			this.numFight = numFight;
			this.genre = genre;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPoster() {
			return poster;
		}

		public void setPoster(String poster) {
			this.poster = poster;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getNumSongs() {
			return numSongs;
		}

		public void setNumSongs(int numSongs) {
			this.numSongs = numSongs;
		}

		public int getNumFight() {
			return numFight;
		}

		public void setNumFight(int numFight) {
			this.numFight = numFight;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}
		
		
		
}
