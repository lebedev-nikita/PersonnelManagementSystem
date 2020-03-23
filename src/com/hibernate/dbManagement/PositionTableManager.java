package com.hibernate.dbManagement;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.dbManagement.DAO.PositionTableManagerDAO;
import com.hibernate.entity.Division;
import com.hibernate.entity.Employee;
import com.hibernate.entity.Position;

public class PositionTableManager implements PositionTableManagerDAO
{
	private static SessionFactory sessionFactory = null;
	
	public PositionTableManager() 
	{
		if (sessionFactory == null) 
		{
			sessionFactory = new Configuration()
					   		 .configure("hibernate.cfg.xml")
					   		 .addAnnotatedClass(Position.class)
					   		 .buildSessionFactory();
		}
	}
	
	@Override
	public List<Position> hqlRequest(String query) 
	{
		System.out.println("Starting 'hqlRequest'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		List<Position> listPositions = session.createQuery(query).list();
		
		
		session.getTransaction().commit();
		System.out.println("Finished 'hqlRequest'");
		session.close();
		
		return listPositions;
	}

	@Override
	public Position getById(int id) 
	{
		System.out.println("Starting 'getById'");

		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		Position myPosition = session.get(Position.class, id);
		
		session.getTransaction().commit();
		
		System.out.println("Finished 'getById'");
		session.close();
		
		return myPosition;
	}

	@Override
	public void save(Position position) 
	{
		System.out.println("Starting 'save'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		session.save(position);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Done!");
	}

	@Override
	public void update(Position position) 
	{
		System.out.println("Starting 'update'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		session.update(position);
			
		session.getTransaction().commit();
		session.close();
		System.out.println("Finished 'update'");	
	}

	@Override
	public void delete(Position position) 
	{
		System.out.println("Starting 'delete'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		session.delete(position);
		
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Finished 'delete'");	
	}

	// unchecked
	
	@Override
	public List<Position> listByDivisionId(int divisionId) 
	{
		System.out.println("Starting 'listByDivisionId'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		List<Position> listPositions = session.createQuery("from Position where divisionId=" + divisionId).list();
		
		session.getTransaction().commit();
		System.out.println("Finished 'listByDivisionId'");
		session.close();
		
		return listPositions;
	}

	@Override
	public List<Position> listByName(String name) 
	{
		System.out.println("Starting 'listByName'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		List<Position> listPositions = session.createQuery("FROM Position WHERE name LIKE %" + name +"%").list();
		
		session.getTransaction().commit();
		System.out.println("Finished 'listByName'");
		session.close();
		
		return listPositions;
	}

}
