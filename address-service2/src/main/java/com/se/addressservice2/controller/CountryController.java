package com.se.addressservice2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.addressservice2.entity.Country;
import com.se.addressservice2.repository.CountryRepository;

@RestController
public class CountryController {

	@Autowired
	CountryRepository countryRepository;
	
	@RequestMapping(path="countries")
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}
}
