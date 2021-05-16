package com.itvaib.search.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.itvaib.search.entity.Employee;

@Repository
public interface EmploeeRepo extends JpaRepository<Employee, Integer>, JpaSpecificationExecutor<Employee> {

}
