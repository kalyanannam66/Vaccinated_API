package com.rapp.vaccinatedpeople.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rapp.vaccinatedpeople.model.AllUsers;

@Repository
public interface AllUsersRepository extends JpaRepository<AllUsers, Integer> {

	List<AllUsers> findByZipcode(Integer zipcode);
}
