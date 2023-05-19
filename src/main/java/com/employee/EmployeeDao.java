package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepository empRepo;

	public String addEmployee(List<Employee> e) {
		empRepo.saveAll(e);
		return "Successfully saved";
	}

	public String addEmployee(Employee e) {
		empRepo.save(e);
		return "Successfully saved";
	}

	public List<Employee> getEmpUrl() {
		return empRepo.findAll();
	}

	public String deleteId(int id) {
		empRepo.deleteById(id);
		return "SuccessfullyDeleted";
	}

	public String updateEmp(Employee id) {
		empRepo.save(id);
		return "Successfully Updated";
	}

	public List<Employee> getByAll() {
		return empRepo.findAll();
	}

	public List<Employee> getByName(String name) {
		return empRepo.getByName(name);

	}

	public List<Employee> getByGender(String gender) {
		return empRepo.getByGender(gender);
	}

	public List<Employee> getByAge() {
		return empRepo.getByAge();
	}

	public List<String> getEmpNameBySal(int salary) {
		return empRepo.getNameBySalary(salary);
	}

	public List<Employee> getEmpSalaryInc() {
		return empRepo.getSalaryInc();
	}

	public Employee getById(int id) throws EmployeeNotFoundException {

		return empRepo.findById(id).orElseThrow(() -> new EmployeeNotFoundException());
	}
	public List<Employee> getEmployeeName(String name) throws EmployeeNameNotFound {
		return empRepo.getByName(name);
	}
	public List<Employee> getAge(int age) throws EmployeeAgeNotFoundException{
		return empRepo.getByAge1(age);
	}

//	public List<Employee> getSalary(int salary) throws EmployeeSalaryNotFoundException {
//		if (empRepo.getBySalary(salary).isEmpty() == true) {
//			throw new EmployeeSalaryNotFoundException();
//		} else {
//			return empRepo.getBySalary(salary);
//		}
	


	
	





}
