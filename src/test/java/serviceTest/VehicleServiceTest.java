package serviceTest;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.starwar.client.RestClientChacheable;
import com.starwar.domain.SearchResultDTO;
import com.starwar.domain.SearchResults;
import com.starwar.service.VehicleService;

public class VehicleServiceTest {

	@Mock
	RestClientChacheable client;

	@InjectMocks
	VehicleService vehicleService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void fetchDetailTest() {

		String name = "Sand Crawler";
		String type = "Vehicle";
		SearchResults res = new SearchResults();
		List<SearchResultDTO> results = new ArrayList<SearchResultDTO>();
		SearchResultDTO sDTO = new SearchResultDTO();
		sDTO.setName(name);
		results.add(sDTO);
		res.setName(name);
		res.setResults(results);
		res.setType(type);

		Mockito.when(client.fetchAllVehicle()).thenReturn(res);

		SearchResults searchResults = vehicleService.filterName(name);
		assertTrue(searchResults.getResults().size() > 0);
	}

}
