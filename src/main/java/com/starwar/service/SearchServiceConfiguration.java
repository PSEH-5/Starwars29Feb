package com.starwar.service;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.starwar.domain.SearchCriteria;
import com.starwar.domain.SearchCriterias;

@Configuration
public class SearchServiceConfiguration {

	@Bean
	public SearchCriterias searchCriteria () {
		SearchCriterias scs = new SearchCriterias();
		SearchCriteria planet = new SearchCriteria();
		SearchCriteria spaceShip = new SearchCriteria();
		SearchCriteria people = new SearchCriteria();
		SearchCriteria vehicle = new SearchCriteria();
		SearchCriteria film = new SearchCriteria();
		SearchCriteria species = new SearchCriteria();
		
		planet.setId(1);
		planet.setType("Planet");
		
		spaceShip.setId(2);
		spaceShip.setType("SpaceShip");
		
		people.setId(3);
		people.setType("people");
		
		vehicle.setId(4);
		vehicle.setType("vehicle");
		
		film.setId(5);
		film.setType("film");
		
		species.setId(6);
		species.setType("species");
		
		
		scs.getSc().add(species);
		scs.getSc().add(vehicle);
		scs.getSc().add(people);
		scs.getSc().add(spaceShip);
		scs.getSc().add(planet);
		scs.getSc().add(film);
		return scs;
		
		
	}
	
	@Bean
	public RestTemplate getRestTemplate() {

		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}
