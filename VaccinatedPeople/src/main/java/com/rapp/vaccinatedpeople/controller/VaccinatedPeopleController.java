package com.rapp.vaccinatedpeople.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rapp.vaccinatedpeople.model.AllUsers;
import com.rapp.vaccinatedpeople.service.VaccinatedService;


@RestController
@RequestMapping("/listofnonvaccinationpeople")
public class VaccinatedPeopleController {
	
	@Autowired
   VaccinatedService userService;
	private List<Integer>  listOfZipcodes = new ArrayList<Integer>();
	
	@GetMapping("/byzipcode")
	public List<AllUsers> getListOfVaccinatedPeople(@RequestParam("zipcode") int zipcode) {
		listOfZipcodes.add(zipcode);
		for(int i = 1; i<=5; i++) {
			listOfZipcodes.add(zipcode+i);
		}
		for(int i =1; i<5; i++) {
			listOfZipcodes.add(zipcode-i);
		}
		System.out.println("zipcodes : " + listOfZipcodes);
		List<AllUsers> user = userService.getAllUsers(listOfZipcodes);
        return user;
	}

}
