package com.starwar.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PeopleService {

	@Value("${urls.vehicles.all}")
	String vehicleApi;
	
	
	
}
