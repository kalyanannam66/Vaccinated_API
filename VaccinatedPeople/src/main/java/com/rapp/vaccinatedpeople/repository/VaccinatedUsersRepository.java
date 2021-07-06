package com.rapp.vaccinatedpeople.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapp.vaccinatedpeople.model.VaccinatedUsers;

public interface VaccinatedUsersRepository extends JpaRepository<VaccinatedUsers, Integer> {

	List<VaccinatedUsers> findByZipcode(Integer zipcode);
}
