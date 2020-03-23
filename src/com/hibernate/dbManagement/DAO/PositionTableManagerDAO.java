package com.hibernate.dbManagement.DAO;

import java.util.List;

import com.hibernate.entity.Position;

public interface PositionTableManagerDAO
{	
	public List<Position> hqlRequest(String query);
	
	public Position getById(int id);
	
	public void save(Position position);
	
	public void update(Position position);
	
	public void delete(Position position);
	
	
	public List<Position> listByDivisionId(int divId);
	
	public List<Position> listByName(String name);
}
