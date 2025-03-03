package com.rvdev.rpgdev.registration;

import com.rvdev.rpgdev.AdminRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RegistrationController {

	@Autowired  RegistrationService registrationService;
   

    @PostMapping("/register")
    public String registerAdmin(@RequestBody RegistrationDTo  adminRegistration) {
        
        return registrationService.AdminRegistrationService(adminRegistration);
    }
}

	