package com.db.dbManagement.DAO;

import java.util.List;

import com.hibernate.entity.EmpPos;

public interface EmpPosTableManagerDAO
{	
	public List<EmpPos> hqlRequest(String query);
	
	public void save(EmpPos empPos);
	
	public void update(EmpPos empPos);
	
	public void delete(EmpPos empPos);
	
	
	public List<EmpPos> listByEmpId(int empId);
	
	public List<EmpPos> listByPosId(int posId);
}
