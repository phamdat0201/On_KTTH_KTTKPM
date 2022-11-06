package com.se.addressservice2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.se.addressservice2.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
