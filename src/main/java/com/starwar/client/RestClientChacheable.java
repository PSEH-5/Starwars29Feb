package com.starwar.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.starwar.domain.SearchResults;

@Component
public class RestClientChacheable {
	
	@Value("${urls.vehicles.all}")
	String vehicleUrl;
	
	@Autowired
	RestTemplate restTemplate;
	

	@Cacheable("vehicles")
	public SearchResults fetchAllVehicle() {
		SearchResults searchResults = new SearchResults();
		Gson g = new Gson();
		ResponseEntity<String> response = restTemplate.getForEntity(vehicleUrl, String.class);
		if (response.getStatusCodeValue() == 200) {
			searchResults = g.fromJson(response.getBody(), SearchResults.class);
		}
		return searchResults;
	}
	


}
