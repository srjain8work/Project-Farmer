package farmerservices;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import com.farmerservices.FarmerService;
import com.farmerservices.Main;
import com.farmerservices.domain.FarmerProfile;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Main.class)
@IntegrationTest
public class FarmerServiceTest {
	
	RestTemplate restTemplate = new TestRestTemplate();
	
	@Test
	public void RegistrationTest(){
		FarmerProfile profile = new FarmerProfile();
		profile.setMobile_number(new Double("9158014747"));
		profile.setName("Farmer-1");
				
		String text = restTemplate.postForObject("http://localhost:8080/registration?mobile_number=9158014747&name=sourabh&age=21", profile, String.class);
		Assert.assertEquals(text, "Registration Successful");
	}
	
}
