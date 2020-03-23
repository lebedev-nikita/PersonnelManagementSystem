package com.tests;

import org.junit.Test;
import static org.junit.Assert.*;

import com.hibernate.dbManagement.DivisionTableManager;
import com.hibernate.entity.Division;


public class TestDivisionTableManager {

	@Test
	public void test_hqlRequest() {
		// TODO
		DivisionTableManager dtm = new DivisionTableManager();
		
		for (Division div : dtm.hqlRequest("from Division")) {
			System.out.println(div);
		}
		
		assertEquals(1,1);
	}

}
