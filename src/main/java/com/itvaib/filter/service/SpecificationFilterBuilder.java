package com.itvaib.filter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.jpa.domain.Specification;

import com.itvaib.filter.entity.Employee;
import com.itvaib.filter.model.SearchCriteria;

public class SpecificationFilterBuilder<T> {
	
	 private final List<SearchCriteria> params;

	    public SpecificationFilterBuilder() {
	        params = new ArrayList<SearchCriteria>();
	    }

	    public SpecificationFilterBuilder with(String key, String operation, Object value) {
	        params.add(new SearchCriteria(key, operation, value));
	        return this;
	    }

	    public Specification build() {
	        if (params.size() == 0) {
	            return null;
	        }

	        List<Specification> specs = params.stream()
	          .map(FilterSpecification<T>::new)
	          .collect(Collectors.toList());
	        
	        Specification result = specs.get(0);

	        for (int i = 1; i < params.size(); i++) {
	        	System.out.println("Insidesearch");
	            result = params.get(i)
	              .isOrPredicate()
	                ? Specification.where(result)
	                  .or(specs.get(i))
	                : Specification.where(result)
	                  .and(specs.get(i));
	        }       
	        return result;
	    }

}
