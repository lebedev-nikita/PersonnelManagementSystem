package com.hibernate.dbManagement.DAO;

import java.util.List;

import com.hibernate.entity.Employee;

public interface EmployeeTableManagerDAO
{	
	public List<Employee> hqlRequest(String query);
	
	public Employee getById(int id);
	
	public void save(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Employee employee);
	

	public List<Employee> listByNameSurname(String name, String surname);
}
