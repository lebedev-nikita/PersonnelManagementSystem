package com.tests;

import com.hibernate.dbManagement.DivisionTableManager;
import com.hibernate.entity.Division;

public class MyMain {

	public static void main(String[] args) 
	{
		DivisionTableManager tm = new DivisionTableManager();
		
		// Division tmpDivision = new Division("JIJA", 0, 1);
		// System.out.println(tmpDivision);
		// tm.storeDivision(tmpDivision);
		
//		for (Division div : tm.hqlRequest("from Division"))
//		{
//			System.out.println(div);
//		}
		System.out.println(123);
	}
}
