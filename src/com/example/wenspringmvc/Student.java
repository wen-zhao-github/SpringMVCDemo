package com.example.wenspringmvc;


import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private LinkedHashMap<String,String> countryOptions;
	private LinkedHashMap<String,String> favoriteLanguageOptions;
	private String[] operatingSystems;

	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Student(){
		//here populate the drop down list from this  hash map field
		countryOptions = new LinkedHashMap<> ();
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "German");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("US", "USA");
		//populate radio button with options
		favoriteLanguageOptions= new LinkedHashMap<>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("C++", "C++");
		favoriteLanguageOptions.put("PHP", "PHP");
		
	}
	//only getter is needed to pre populate the drop down items
	//when this country field needed, country's setter will be there
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

}
