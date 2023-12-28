package com.mb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mb.Entity.Address;

public interface AddRepo extends JpaRepository<Address, Integer>{

}
