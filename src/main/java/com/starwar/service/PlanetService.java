package com.starwar.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlanetService {	

	@Value( "${urls.planet.all}" )
	String planetApi;
	
	

}
