package com.se.addressservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.se.addressservice.entity.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
