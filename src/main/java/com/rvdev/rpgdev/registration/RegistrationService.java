package com.rvdev.rpgdev.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rvdev.rpgdev.AdminRegistration;

@Service
public class RegistrationService {
	
	
	
	@Autowired RegistrationRepo registrationRep;
	

	public String AdminRegistrationService(RegistrationDTo adminRegistrationDTO) {
		// TODO Auto-generated method stub
		AdminRegistration adminRegistration=new AdminRegistration();
		adminRegistration.setCompanyName(adminRegistrationDTO.getCompanyName());		
		adminRegistration.setAddress(adminRegistrationDTO.getAddress());
		adminRegistration.setMobileNumber(adminRegistrationDTO.getMobileNumber());
		adminRegistration.setEmail(adminRegistrationDTO.getEmail());
	
		registrationRep.save(adminRegistration);		
		return "200" ;
	}

}
