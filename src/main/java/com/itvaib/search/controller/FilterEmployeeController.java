package com.itvaib.search.controller;

import java.util.List;

import org.hibernate.annotations.Where;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itvaib.search.SearchCriteria;
import com.itvaib.search.entity.Employee;
import com.itvaib.search.repository.EmploeeRepo;
import com.itvaib.search.service.FilterService;
import com.itvaib.search.service.FilterSpecification;

@RestController
@RequestMapping("employee")
public class FilterEmployeeController {
	
	@Autowired
	private EmploeeRepo emploeeRepo;
	
	@Autowired
	private FilterService filterService;

    @PostMapping(value = "/filter")
    public List<Employee> search(@RequestBody List<SearchCriteria> searchCriteria) {
//    	
    	FilterSpecification<Employee> spec1 = new FilterSpecification(new SearchCriteria("salary", ">", "10000"));
//    	FilterSpecification spec1 = null;
    	FilterSpecification<Employee> spec2 = new FilterSpecification(new SearchCriteria("name", ":", "abc"));
//    	for(SearchCriteria criteria : searchCriteria) {
//    		Specification.where(spec1)
//    	}
    	System.out.print(searchCriteria);
    	return filterService.searchResult(searchCriteria);
    	
//        return emploeeRepo.findAll(Specification.where(spec1).and(spec2));
    }

}
