package com.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class EmployeeController {

	@Autowired
	EmployeeSerivce empSer;
	RestTemplate rt;

	@PostMapping(value = "/addEmpList")
	public String addEmployee(@RequestBody List<Employee> e) {
		return empSer.addEmployee(e);
	}

	@PostMapping(value = "/addEmp")
	public String addEmployee1(@RequestBody Employee e) {
		return empSer.addEmployee(e);
	}

//	@GetMapping(value = "/getEmpById/{id}")
//	public Employee getEmpById(@PathVariable int id) throws EmployeeNotFoundException {
//		return empSer.getEmpById(id);
//	}

	@GetMapping(value = "/getEmpUrl")
	public List<Employee> getEmpUrl() {
		return empSer.getEmpUrl();
	}

	@DeleteMapping(value = "/deleteId/{id}")
	public String deleteId(@PathVariable int id) {
		return empSer.deleteId(id);
	}

	@PutMapping(value = "/updateEmp/{id}")
	public String updateEmp(@RequestBody Employee id) {
		return empSer.updateEmp(id);
	}

	@GetMapping(value = "/setEmpByGender/{gender}")
	public List<Employee> setByGender(@PathVariable String gender) {
		return empSer.getByGender(gender);
	}

	@GetMapping(value = "/getEmployeeBySalary/{salary1}/{salary2}")
	public List<Employee> getEmpBySalary(@PathVariable int salary1, @PathVariable int salary2) {
		return empSer.getEmpBySalary(salary1, salary2);
	}

	@GetMapping(value = "/getEmployeeByName/{name}")
	public List<Employee> getEmpByName(@PathVariable String name) {
		return empSer.getEmpByName(name);
	}

	@GetMapping(value = "/getEmployeeByAge/{age}")
	public List<Employee> getEmpByAge(@PathVariable int age) {
		return empSer.getEmpByAge(age);
	}

	@GetMapping(value = "/getEmployeeName/{name}")
	public List<Employee> getEmpName(@PathVariable String name) {
		return empSer.getEmpName(name);
	}

	@GetMapping(value = "/getEmployeeGender/{gender}")
	public List<Employee> getEmpGender(@PathVariable String gender) {
		return empSer.getEmpGender(gender);
	}

	@GetMapping(value = "/getEmployeeAge")
	public List<Employee> getEmpAge() {
		return empSer.getEmpAge();
	}

	@GetMapping(value = "/getEmployeeNameBySalary/{salary}")
	public List<String> getEmpNameBySal(@PathVariable int salary) {
		return empSer.getEmpNameBySal(salary);
	}

	@GetMapping(value = "/getEmployeeSalaryInc")
	public List<Employee> getEmpSalaryInc() {
		return empSer.getEmpSalaryInc();
	}
//

	@GetMapping(value = "/getEmpBy/{id}")
	public Employee getById(@PathVariable int id) throws EmployeeNotFoundException {
		return empSer.getById(id);
	}

	@GetMapping(value = "/getEmpByName/{name}")
	public List<Employee> getEmployeeName(@PathVariable String name) throws EmployeeNameNotFound {
		return empSer.getEmployeeName(name);
	}

	@GetMapping(value = "/getEmpAge/{age}")
	public List<Employee> getAge(@PathVariable int age) throws EmployeeAgeNotFoundException {
		return empSer.getAge(age);
	}

//	@GetMapping(path="/getBySalary/{salary}")
//	public List<Employee> getSalary(@PathVariable int salary) throws EmployeeSalaryNotFoundException{
//		return empSer.getSalary(salary);
//		
//	}

//	@GetMapping(value = "/getCar")
//	public List<Car> getCarDet() {
//
//		String url = "http://localhost:8080/getCarDet";
//		List<Car> response = rt.getForObject(url, HttpMethod.GET, null,
//				new ParameterizedTypeReference<List<Car>>() {
//				});;
//		List<Car> response1 = new ArrayList<>();
//		response1.addAll(response);
//		return response1;
//
//	}

}
