package com.tests;

import org.junit.Test;
import static org.junit.Assert.*;

import com.hibernate.dbManagement.DivisionTableManager;
import com.hibernate.entity.Division;

public class TestDivision {

	@Test
	public void test_setId_getId()
	{
		Division tmpDiv = new Division("name", 0, 1);
		tmpDiv.setId(10);
		assertEquals(10, tmpDiv.getId());		
		tmpDiv.setId(8);
		assertEquals(8, tmpDiv.getId());
	}
	
	@Test
	public void test_setName_getName()
	{
		Division tmpDiv = new Division("name", 0, 1);
		tmpDiv.setName("SomeName1");
		assertEquals("SomeName1", tmpDiv.getName());		
		tmpDiv.setName("SomeName2");
		assertEquals("SomeName2", tmpDiv.getName());
	}
	
	@Test
	public void test_setHeadDivId_getHeadDivId()
	{
		Division tmpDiv = new Division("name", 0, 1);
		tmpDiv.setHeadDivId(10);
		assertEquals(10, tmpDiv.getHeadDivId());		
		tmpDiv.setHeadDivId(9);
		assertEquals(9, tmpDiv.getHeadDivId());
	}
	
	@Test
	public void test_setChiefId_getChiefId()
	{
		Division tmpDiv = new Division("name", 0, 1);
		tmpDiv.setChiefId(10);
		assertEquals(10, tmpDiv.getChiefId());		
		tmpDiv.setChiefId(9);
		assertEquals(9, tmpDiv.getChiefId());
	}
	
	@Test
	public void test_toString()
	{
		Division tmpDiv = new Division("name", 0, 1);
		tmpDiv.setId(10);
		assertEquals("Division [id=10, name=name, headDivId=0, chiefId=1]", tmpDiv.toString());
		tmpDiv.setId(9);
		assertEquals("Division [id=9, name=name, headDivId=0, chiefId=1]", tmpDiv.toString());
	}
}
