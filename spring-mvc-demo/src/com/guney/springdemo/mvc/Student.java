package com.guney.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	private String firstName;
	private String lastName;

	private String country;

	private LinkedHashMap<String, String> countryOptions;

	private String favoriteLanguage;

	private String operatingSystem;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		countryOptions = new LinkedHashMap<>();

		countryOptions.put("TR", "Türkiye");
		countryOptions.put("IT", "Italy");
		countryOptions.put("DE", "Germany");
		countryOptions.put("SP", "Spain");
		countryOptions.put("USA", "America");
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
