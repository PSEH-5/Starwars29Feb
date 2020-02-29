package com.starwar.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class SearchResultDTO implements Serializable{	

	private static final long serialVersionUID = -2705085300512933333L;
	String name;
	ArrayList<String> films;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<String> getFilms() {
		return films;
	}
	public void setFilms(ArrayList<String> films) {
		this.films = films;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((films == null) ? 0 : films.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SearchResultDTO other = (SearchResultDTO) obj;
		if (films == null) {
			if (other.films != null)
				return false;
		} else if (!films.equals(other.films))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SearchResultDTO [name=" + name + ", films=" + films + "]";
	}
	}
