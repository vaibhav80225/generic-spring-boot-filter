package com.itvaib.filter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itvaib.filter.entity.FilterKeyMaster;

@Repository
public interface FilterKeyMasterRepo extends JpaRepository<FilterKeyMaster, Integer> {

}
