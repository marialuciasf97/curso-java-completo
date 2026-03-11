package services;

import java.util.ArrayList;
import java.util.List;

import entities.Employee;

public class EmployeeService {

	private List<Employee> employees = new ArrayList<>();
	
	public List<Employee> getEmployees() {
		return List.copyOf(employees); // Immutable list.
	}
	
	public boolean addEmployee(Employee employee) {
		if (findById(employee.getId()) != null) {
			return false;
		}
		employees.add(employee);
		return true;
	}
	
	public Employee findById(Integer id) {
		Employee emp = employees.stream()
				.filter(x -> x.getId().equals(id))
				.findFirst().orElse(null);
		return emp;
	}
	
	//metodo findById (imperativo)
//	public Employee findById(Integer id) {
//		for (Employee emp : employees) {
//			if (emp.getId().equals(id)) {
//				return emp;
//			}
//		}
//		return null;
//	}
	
	public boolean increaseSalary(Integer id, double percentage) {
		Employee emp = findById(id);
		if (emp == null) {
			return false;
		}
		emp.increaseSalary(percentage);
		return true;
	}
	
}
