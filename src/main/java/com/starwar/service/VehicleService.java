package com.starwar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.starwar.client.RestClientChacheable;
import com.starwar.domain.SearchResultDTO;
import com.starwar.domain.SearchResults;

@Component
public class VehicleService {

	@Autowired
	RestClientChacheable client;
	
	public SearchResults fetchDetail(String name) {
		SearchResults  searchResults =this.filterName(name);		
		return searchResults;		
	}	
	
	public SearchResults filterName(String name) {
		SearchResults  searchResults = client.fetchAllVehicle();		
		SearchResults  searchResultsFinal = new SearchResults();
		List<SearchResultDTO> results  = new ArrayList<SearchResultDTO>();
		searchResultsFinal.setResults(results);
		for(SearchResultDTO sc : searchResults.getResults()) {
			if(sc.getName().equalsIgnoreCase(name)) {
				results.add(sc);
			}
		}
		return searchResultsFinal;
		
	}
		
	
	
	
	
}
