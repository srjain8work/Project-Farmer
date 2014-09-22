package com.farmerservices;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmerservices.domain.FarmerProfile;

@RestController
public class FarmerService {

   @RequestMapping("/registration")
    public String registration(@RequestParam(value="mobile_number") String mobile_number,
    		@RequestParam(value="name") String name,
    		@RequestParam(value="age") String age) {
    	return "Registration Successful";
    }
	
/*	 @RequestMapping("/registration")
	    public String registration(@RequestBody FarmerProfile profile) {
	    	return "Registration Successful";
	    }
*/    
    @RequestMapping("/lookup")
    public FarmerProfile lookup(@RequestParam(value="mobile_number") String mobile_number) {
    	FarmerProfile profile = new FarmerProfile();
    	profile.setAge(21);
    	profile.setMobile_number(new Double("9158014747"));
    	return profile;
    }
}