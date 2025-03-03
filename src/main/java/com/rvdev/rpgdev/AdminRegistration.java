package com.rvdev.rpgdev;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter @Entity(name = "AdminRegistration")

public class AdminRegistration  extends BaseEntity{

	
	
	@Column(name = "Company_name")
    private String companyName;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

   
	
	
}
