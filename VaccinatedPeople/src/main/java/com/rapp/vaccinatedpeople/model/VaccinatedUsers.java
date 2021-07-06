package com.rapp.vaccinatedpeople.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccinated_users")
public class VaccinatedUsers {
	
	@Id
	private int id;
    private String first_name;
    private String last_name;
    private int age;
    private int zipcode;

    public VaccinatedUsers() {
    	
    }
    
    // constructor//
	public VaccinatedUsers(int id, String first_name, String last_name, int age, int zipcode) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.zipcode = zipcode;
	}

	
	//getters setters//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String lastName) {
		this.last_name = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}



}
