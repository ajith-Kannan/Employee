package com.employee;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query (value = "select*from employee where name like ?",nativeQuery = true)
		public List<Employee> getByName(String name);
	
	@Query (value = "select*from employee where gender like ?",nativeQuery = true)
	public List<Employee> getByGender(String gender);
	
	@Query (value = "select*from employee where age >= 22 and  age <= 30",nativeQuery = true)
	public List<Employee> getByAge();
	@Query (value = "select*from employee where age == ?",nativeQuery = true)
	public List<Employee> getByAge1(int age);
	
	
	@Query (value = "select name from employee where salary = ?",nativeQuery = true)
	public List<String> getNameBySalary(int salary);
	
	@Query (value = "select*from employee where age >= 25 and age =<30 ",nativeQuery = true)
	public List<Employee> getSalaryInc();
    @Query (value = "select * from employee where salary = ?",nativeQuery = true)
	public String getBySalary(int salary);


}
