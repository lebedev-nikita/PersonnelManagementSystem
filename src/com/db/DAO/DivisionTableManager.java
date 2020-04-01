package com.db.DAO;

import java.util.List;

import com.db.entity.Division;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DivisionTableManager
{

	private static SessionFactory sessionFactory = null;

	public DivisionTableManager()
	{
		if (sessionFactory == null)
		{
			sessionFactory = new Configuration()
					   		 .configure("hibernate.cfg.xml")
					   		 .addAnnotatedClass(Division.class)
					   		 .buildSessionFactory();
		}
	}

	// public List<Division> hqlRequest(String query)
	// {
	// 	System.out.println("Starting 'hqlRequest'");
	// 	Session session = sessionFactory.getCurrentSession();
	// 	session.beginTransaction();
	//
	// 	List<Division> listDivisions = session.createQuery(query).list();
	//
	// 	session.getTransaction().commit();
	// 	System.out.println("Finished 'hqlRequest'");
	// 	session.close();
	//
	// 	return listDivisions;
	// }

	public Division getById(int id)
	{
		System.out.println("Starting 'getDivisionById'");

		Session session = sessionFactory.getCurrentSession();

		session.beginTransaction();

		Division myDivision = session.get(Division.class, id);
		session.getTransaction().commit();

		System.out.println("Finished 'getById'");
		session.close();

		return myDivision;
	}

	public int save(Division division)
	{
		System.out.println("Starting 'save'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		int id = (int) session.save(division);

		session.getTransaction().commit();
		session.close();
		System.out.println("Done!");

		return id;
	}

	public void update(Division division)
	{
		System.out.println("Starting 'updateDivision'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		session.update(division);

		session.getTransaction().commit();
		session.close();
		System.out.println("Finished 'updateDivision'");
	}

	public void delete(Division division)
	{
		System.out.println("Starting 'deleteDivision'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		session.delete(division);


		session.getTransaction().commit();
		session.close();
		System.out.println("Finished 'deleteDivision'");

	}

	// unchecked

	public List<Division> listAllDivisions()
	{
		System.out.println("Starting 'listAllDivisions'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		List<Division> listDivisions = session.createQuery("from Division").list();

		session.getTransaction().commit();
		System.out.println("Finished 'listAllDivisions'");
		session.close();

		return listDivisions;
	}

	public List<Division> listByChiefId(int chiefId)
	{
		System.out.println("Starting 'listAllDivisions'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		List<Division> listDivisions = session.createQuery("from Division where chiefId=" + chiefId).list();

		session.getTransaction().commit();
		System.out.println("Finished 'listAllDivisions'");
		session.close();

		return listDivisions;
	}

	public List<Division> listByName(String name)
	{
		System.out.println("Starting 'listByName'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		List<Division> listDivisions = session.createQuery("from Division d where d.name like '%" + name + "%'").list();

		session.getTransaction().commit();
		System.out.println("Finished 'listByName'");
		session.close();

		return listDivisions;
	}

	public List<Division> listByHeadDivId(int headDivId)
	{
		System.out.println("Starting 'listByHeadDivId'");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		List<Division> listDivisions = session.createQuery("from Division where headDivId=" + headDivId).list();

		session.getTransaction().commit();
		System.out.println("Finished 'listByHeadDivId'");
		session.close();

		return listDivisions;
	}

}
