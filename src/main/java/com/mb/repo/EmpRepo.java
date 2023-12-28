package com.mb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mb.Entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>{

}
