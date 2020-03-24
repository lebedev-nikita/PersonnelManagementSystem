package com.hibernate.dbManagement;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.dbManagement.DAO.EmployeeTableManagerDAO;
import com.hibernate.entity.Division;
import com.hibernate.entity.Employee;

public class EmployeeTableManager implements EmployeeTableManagerDAO
{
	private static SessionFactory sessionFactory = null;
	
	public EmployeeTableManager() 
	{
		if (sessionFactory == null) 
		{
			sessionFactory = new Configuration()
					   		 .configure("hibernate.cfg.xml")
					   		 .addAnnotatedClass(Employee.class)
					   		 .buildSessionFactory();
		}
	}

	@Override
	public List<Employee> hqlRequest(String query) 
	{
		System.out.println("Starting 'hqlRequest'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		List<Employee> listEmployees = session.createQuery(query).list();
		
		
		session.getTransaction().commit();
		System.out.println("Finished 'hqlRequest'");
		session.close();
		
		return listEmployees;
	}

	@Override
	public Employee getById(int id) 
	{
		System.out.println("Starting 'getById'");

		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		Employee myEmployee = session.get(Employee.class, id);
		session.getTransaction().commit();
		
		System.out.println("Finished 'getById'");
		session.close();
		
		return myEmployee;
	}

	@Override
	public int save(Employee employee)
	{
		System.out.println("Starting 'save'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		int id = (int) session.save(employee);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Done!");

		return id;
	}

	@Override
	public void update(Employee employee) 
	{
		System.out.println("Starting 'update'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		session.update(employee);
			
		session.getTransaction().commit();
		session.close();
		System.out.println("Finished 'update'");			
	}

	@Override
	public void delete(Employee employee) 
	{
		System.out.println("Starting 'delete'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		session.delete(employee);
		
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Finished 'delete'");	
		
	}

	
	// unchecked
	
	@Override
	public List<Employee> listByNameSurname(String name, String surname) 
	{
		System.out.println("Starting 'listByNameSurname'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		List<Employee> listEmployees = session.createQuery("from Employee where name like '%" + name +
														   "%' and surname like '%" + surname + "%'").list();
		
		session.getTransaction().commit();
		System.out.println("Finished 'listByNameSurname'");
		session.close();
		
		return listEmployees;
	}

}
