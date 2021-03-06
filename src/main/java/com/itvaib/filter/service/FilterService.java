package com.itvaib.filter.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.itvaib.filter.entity.Employee;
import com.itvaib.filter.model.SearchCriteria;
import com.itvaib.filter.repository.EmploeeRepo;
import com.itvaib.filter.repository.FilterKeyMasterRepo;

@Service
public class FilterService {
	
	@Autowired
	private EmploeeRepo emploeeRepo;
	@Autowired
	private FilterKeyMasterRepo filterKeyMasterRepo;
	
	public List<Employee> searchResult(List<SearchCriteria>searchCriterias){
		SpecificationFilterBuilder<Employee> builder = new SpecificationFilterBuilder<>();
		for(SearchCriteria searchCriteria : searchCriterias) {
			builder.with(searchCriteria.getKey(), searchCriteria.getOperation(), searchCriteria.getValue());
		}
		
		Specification<Employee> specification = builder.build();
		return emploeeRepo.findAll(specification);
		
		
	}

}
