package com.starwar.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchCriterias implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<SearchCriteria> sc = new ArrayList<SearchCriteria>();
	public List<SearchCriteria> getSc() {
		return sc;
	}
	public void setSc(List<SearchCriteria> sc) {
		this.sc = sc;
	}
	@Override
	public String toString() {
		return "[sc=" + sc + "]";
	}
	

}
