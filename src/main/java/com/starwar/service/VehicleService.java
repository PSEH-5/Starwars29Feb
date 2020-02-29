package com.starwar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.starwar.domain.SearchResultDTO;
import com.starwar.domain.SearchResults;

@Component
public class VehicleService {

	@Value("${urls.vehicles.all}")
	String vehicleUrl;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public SearchResults fetchDetail(String name) {
		SearchResults  searchResults =this.filterName(name);		
		return searchResults;		
	}
	
	
	public SearchResults filterName(String name) {
		SearchResults  searchResults = this.fetchAll();		
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
	
	@Cacheable("vehicles")
	public SearchResults fetchAll() {
		SearchResults searchResults = new SearchResults();
		Gson g = new Gson();
		ResponseEntity<String> response = restTemplate.getForEntity(vehicleUrl, String.class);
		if (response.getStatusCodeValue() == 200) {
			searchResults = g.fromJson(response.getBody(), SearchResults.class);
		}
		return searchResults;
	}
	
	
	
	
	
	
}
