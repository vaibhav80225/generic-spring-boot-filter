package com.itvaib.filter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.itvaib.filter.entity.Employee;

@Repository
public interface EmploeeRepo extends JpaRepository<Employee, Integer>, JpaSpecificationExecutor<Employee> {

}
