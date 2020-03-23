package com.hibernate.dbManagement.DAO;

import java.util.List;

import com.hibernate.entity.Division;

public interface DivisionTableManagerDAO
{	
	public List<Division> hqlRequest(String query);
	
	public Division getById(int id);
	
	public void save(Division division);
	
	public void update(Division division);
	
	public void delete(Division division);
	
	
	public List<Division> listAllDivisions();
	
	public List<Division> listByChiefId(int chiefId);
	
	public List<Division> listByName(String name);
	
	public List<Division> listByHeadDivId(int headDivId);
}
