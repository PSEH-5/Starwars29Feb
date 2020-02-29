package com.starwar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.starwar.domain.SearchResultDTO;

@Component
public class VehicleService {

	@Value("${urls.vehicles.all}")
	String vehicleUrl;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public List<SearchResultDTO> fetchDetail(String name) {
		List<SearchResultDTO>  searchResultDTOs = new ArrayList<SearchResultDTO>();		
		ResponseEntity<String> response
		  = restTemplate.getForEntity(vehicleUrl, String.class);
		
		System.out.println("========="+response.getBody());
		
		
		return searchResultDTOs;
		
	}
	
	
	
	
}
