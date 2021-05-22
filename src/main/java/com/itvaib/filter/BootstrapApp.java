package com.itvaib.filter;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.itvaib.filter.entity.Employee;
import com.itvaib.filter.repository.EmploeeRepo;

@Configuration
public class BootstrapApp implements CommandLineRunner {

	@Autowired
	private EmploeeRepo emploeeRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Employee employee = new Employee();
		employee.setName("abc");
		employee.setSalary(10300);
		employee.setBloodGroup("A");
		employee.setHobbies(Arrays.asList("chess"));
		
		Employee employee1 = new Employee();
		employee1.setName("abc");
		employee1.setSalary(1000);
		employee1.setBloodGroup("B");
		employee1.setHobbies(Arrays.asList("chess"));
		
		Employee employee2 = new Employee();
		employee2.setName("xyz");
		employee2.setSalary(15000);
		employee2.setBloodGroup("O");
		employee2.setHobbies(Arrays.asList("cricket"));
		
		Employee employee3 = new Employee();
		employee3.setName("apple");
		employee3.setSalary(10300);
		employee3.setBloodGroup("AB");
		employee3.setHobbies(Arrays.asList("chess", "cricket"));
		
		Employee employee4 = new Employee();
		employee4.setName("orange");
		employee4.setSalary(34500);
		employee4.setBloodGroup("AB");
		employee4.setHobbies(Arrays.asList("board"));
		
		emploeeRepo.save(employee);
		emploeeRepo.save(employee1);
		emploeeRepo.save(employee2);
		emploeeRepo.save(employee3);
		emploeeRepo.save(employee4);
		
	}

}
