package com.rapp.vaccinatedpeople.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rapp.vaccinatedpeople.model.AllUsers;
import com.rapp.vaccinatedpeople.model.VaccinatedUsers;
import com.rapp.vaccinatedpeople.repository.AllUsersRepository;
import com.rapp.vaccinatedpeople.repository.VaccinatedUsersRepository;


@Service
@Transactional
public class VaccinatedService {
	
	@Autowired
    private AllUsersRepository allUsersRepository;
	
	@Autowired
    private VaccinatedUsersRepository vaccinatedUsersRepository;
	
	public List<VaccinatedUsers> getListOfVaccinatedUsers(Integer zipcode) {
		List<VaccinatedUsers> result = new ArrayList<VaccinatedUsers>();
		result.addAll(vaccinatedUsersRepository.findByZipcode(zipcode));
		return result;
	}
	
	public List<AllUsers> getAllUsers(List<Integer> zipcode){
		List<AllUsers> finalResult = new ArrayList<AllUsers>();
		for(int i=0 ; i<zipcode.size(); i++) {
			Integer singleZipcode = zipcode.get(i);
			List<VaccinatedUsers> vaccinatedUsers = getListOfVaccinatedUsers(singleZipcode);
			List<AllUsers> result = allUsersRepository.findByZipcode(singleZipcode);
			for(int j=0; j< vaccinatedUsers.size(); j++ ){
				for (int k=0; k< result.size(); k++) {
			if(vaccinatedUsers.get(j).getId() != result.get(k).getId()) {
				finalResult.add(result.get(k));
			}	
		}
		
	}
}
		return finalResult;
		
	}
	
	public List<VaccinatedUsers>  getVaccinatedUsers(int zipcode){
		return null;
		
	}

}
