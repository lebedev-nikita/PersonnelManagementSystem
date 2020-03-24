package com.tests;

import com.hibernate.entity.EmpPos;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmpPosTest
{
    EmpPos tmpEmpPos;

    @Before
    public void initEmpPos()
    {
        tmpEmpPos = new EmpPos(1, 2, "01.02.2003", "01.03.2010", 40000);
    }

    @Test
    public void test_setEmployeeId_getEmployeeId()
    {
        tmpEmpPos.setEmployeeId(10);
        assertEquals(10, tmpEmpPos.getEmployeeId());
        tmpEmpPos.setEmployeeId(8);
        assertEquals(8, tmpEmpPos.getEmployeeId());
    }

    @Test
    public void test_setPositionId_getPositionId()
    {
        tmpEmpPos.setPositionId(10);
        assertEquals(10, tmpEmpPos.getPositionId());
        tmpEmpPos.setPositionId(8);
        assertEquals(8, tmpEmpPos.getPositionId());
    }

    @Test
    public void test_setStartDate_getStartDate()
    {
        tmpEmpPos.setStartDate("02.04.1999");
        assertEquals("02.04.1999", tmpEmpPos.getStartDate());
        tmpEmpPos.setStartDate("20.05.2004");
        assertEquals("20.05.2004", tmpEmpPos.getStartDate());
    }

    @Test
    public void test_setFinishDate_getFinishDate()
    {
        tmpEmpPos.setFinishDate("02.04.1999");
        assertEquals("02.04.1999", tmpEmpPos.getFinishDate());
        tmpEmpPos.setFinishDate("20.05.2004");
        assertEquals("20.05.2004", tmpEmpPos.getFinishDate());
    }

    @Test
    public void test_toString()
    {
        tmpEmpPos.setEmployeeId(10);
        assertEquals("DivPos [employeeId=10, positionId=2, startDate=01.02.2003, finishDate=01.03.2010, salary=40000]", tmpEmpPos.toString());
        tmpEmpPos.setEmployeeId(9);
        assertEquals("DivPos [employeeId=9, positionId=2, startDate=01.02.2003, finishDate=01.03.2010, salary=40000]", tmpEmpPos.toString());
    }
}
