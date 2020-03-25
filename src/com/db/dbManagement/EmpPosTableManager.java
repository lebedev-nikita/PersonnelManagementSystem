package com.db.dbManagement;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.db.dbManagement.DAO.EmpPosTableManagerDAO;
import com.hibernate.entity.EmpPos;

public class EmpPosTableManager implements  EmpPosTableManagerDAO
{
	private static SessionFactory sessionFactory = null;
	
	public EmpPosTableManager() 
	{
		if (sessionFactory == null) 
		{
			sessionFactory = new Configuration()
					   		 .configure("hibernate.cfg.xml")
					   		 .addAnnotatedClass(EmpPos.class)
					   		 .buildSessionFactory();
		}
	}

	@Override
	public List<EmpPos> hqlRequest(String query) 
	{
		System.out.println("Starting 'hqlRequest'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		List<EmpPos> listDivPos = session.createQuery(query).list();
		
		
		session.getTransaction().commit();
		System.out.println("Finished 'hqlRequest'");
		session.close();
		
		return listDivPos;
	}

	@Override
	public void save(EmpPos empPos) 
	{
		System.out.println("Starting 'save'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		session.save(empPos);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Finished 'save'!");
	}

	@Override
	public void update(EmpPos empPos) 
	{
		System.out.println("Starting 'update'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		session.update(empPos);
			
		session.getTransaction().commit();
		session.close();
		System.out.println("Finished 'update'");	
	}

	@Override
	public void delete(EmpPos empPos) 
	{
		System.out.println("Starting 'delete'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		System.out.println(79);
		session.delete(empPos);
		System.out.println(81);

		session.getTransaction().commit();
		System.out.println(84);
		session.close();
		System.out.println(86);
		System.out.println("Finished 'delete'");
	}

	// unchecked

	@Override
	public List<EmpPos> listByEmpId(int empId) 
	{
		System.out.println("Starting 'listByEmpId'");

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		List<EmpPos> listEmpPos = session.createQuery("from EmpPos where employeeId=" + empId).list();

		session.getTransaction().commit();
		
		System.out.println("Finished 'listByEmpId'");
		session.close();
		
		return listEmpPos;
	}
	
	@Override
	public List<EmpPos> listByPosId(int posId) 
	{
		System.out.println("Starting 'listByEmpId'");

		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		List<EmpPos> listEmpPos = session.createQuery("from EmpPos where positionId=" + posId).list();
		
		session.getTransaction().commit();
		
		System.out.println("Finished 'listByEmpId'");
		session.close();
		
		return listEmpPos;
	}
}
