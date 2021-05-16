package com.itvaib.search.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itvaib.search.entity.FilterKeyMaster;

@Repository
public interface FilterKeyMasterRepo extends JpaRepository<FilterKeyMaster, Integer> {

}
