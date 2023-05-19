package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
public class EmployeeSerivce {

	@Autowired
	EmployeeDao empDao;

	public String addEmployee(List<Employee> e) {

		return empDao.addEmployee(e);
	}

	public String addEmployee(Employee e) {

		return empDao.addEmployee(e);
	}

//	public Employee getEmpById(int id) throws EmployeeNotFoundException {
//
//		return empDao.getEmpById(id);
//	}

	public List<Employee> getEmpUrl() {
		return empDao.getEmpUrl();
	}

	public String deleteId(int id) {

		return empDao.deleteId(id);
	}

	public String updateEmp(Employee id) {

		return empDao.updateEmp(id);
	}

	public List<Employee> getByGender(String gender) {
		List<Employee> allEmployess = empDao.getByAll();

		return allEmployess.stream().filter(x -> x.getGender().equals(gender)).collect(Collectors.toList());
	}

	public List<Employee> getEmpBySalary(int salary1, int salary2) {
		List<Employee> allEmployees = empDao.getByAll();

		return allEmployees.stream().filter(x -> x.getSalary() > salary1 && x.getSalary() < salary2).toList();
	}

	public List<Employee> getEmpByName(String name) {
		List<Employee> allEmployees = empDao.getByAll();

		return allEmployees.stream().filter(x -> x.getName().equals(name)).collect(Collectors.toList());
	}

	public List<Employee> getEmpByAge(int age) {
		List<Employee> allEmployees = empDao.getByAll();

		return allEmployees.stream().filter(x -> x.getAge() == age).toList();
	}

	public List<Employee> getEmpName(String name) {
		return empDao.getByName(name);

	}

	public List<Employee> getEmpGender(String gender) {
		return empDao.getByGender(gender);
	}

	public List<Employee> getEmpAge() {

		return empDao.getByAge();
	}

	public List<String> getEmpNameBySal(int salary) {

		return empDao.getEmpNameBySal(salary);
	}

	public List<Employee> getEmpSalaryInc() {
		List<Employee> e = empDao.getEmpSalaryInc();
		for (Employee x : e) {
			x.setSalary(x.getSalary() + x.getSalary() * 10 / 100);

		}

		return e;
	}
//

	public Employee getById(int id) throws EmployeeNotFoundException {

		return empDao.getById(id);
	}

	public List<Employee> getEmployeeName(String name) throws EmployeeNameNotFound {

		if (empDao.getByName(name).isEmpty() == true) {
			throw new EmployeeNameNotFound();
		} else {
			return empDao.getByName(name);

		}

	}

	public List<Employee> getAge(int age) throws EmployeeAgeNotFoundException {

		if (empDao.getAge(age).isEmpty() == true) {
			throw new EmployeeAgeNotFoundException();
		} else {
			return empDao.getAge(age);
		}
	}

//	public List<Employee> getSalary(int salary) throws EmployeeSalaryNotFoundException {
//		return empDao.getSalary(salary);
//
//	}

}
