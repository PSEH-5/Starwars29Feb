package com.starwar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.starwar.domain.SearchCriterias;
import com.starwar.domain.SearchResults;
import com.starwar.service.VehicleService;

@RestController
@RequestMapping("/api")
public class StarWarController {
	
	@Autowired
	SearchCriterias scs;
	
	@Autowired
	VehicleService vehicleService;
	
	@GetMapping
	public String pingPong() {
		return "Server is up";
	}
	
	@GetMapping(value="test")
	public String pingPongTest() {
		return "planetApi";
	}
	@GetMapping(value = "/searchCriteria")
	public SearchCriterias searchOptions() {
		return scs;
	}
	
	
	@GetMapping(value="search")
	public SearchResults fetchResult(@RequestParam(value ="type") String type, @RequestParam(value="name") String name) {
		SearchResults searchResults =  new SearchResults();
		System.out.println(type +" ################"+name);
		System.out.println(SEARCH_TYPE.VEHICLES.name());
		if(type.equalsIgnoreCase(SEARCH_TYPE.VEHICLES.name())) {
			searchResults = vehicleService.fetchDetail(name);
			searchResults.setName(name);
			searchResults.setType(type);
		}
		
		return searchResults;
		
	}
	
	

}

enum SEARCH_TYPE {
	PLANET,
	VEHICLES;
	
}