package com.example.hw8.dao;

import com.example.hw8.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeDAO {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
