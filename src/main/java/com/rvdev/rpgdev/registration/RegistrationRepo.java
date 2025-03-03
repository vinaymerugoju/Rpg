package com.rvdev.rpgdev.registration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rvdev.rpgdev.AdminRegistration;

@Repository
public interface RegistrationRepo extends JpaRepository<AdminRegistration,Long> {

}
