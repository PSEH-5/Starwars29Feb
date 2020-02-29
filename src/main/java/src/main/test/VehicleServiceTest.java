package src.main.test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.starwar.client.RestClientChacheable;
import com.starwar.service.VehicleService;

public class VehicleServiceTest {
	
	  @Mock RestClientChacheable client;
	  
	  @InjectMocks VehicleService vehicleService;
	 
	 
	

}
