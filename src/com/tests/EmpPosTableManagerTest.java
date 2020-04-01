package com.tests;

import com.db.DAO.EmpPosTableManager;
import org.junit.Before;
import org.junit.Test;

public class EmpPosTableManagerTest
{
    EmpPosTableManager eptm;
    @Before
    public void init()
    {
        eptm = new EmpPosTableManager();
    }

    /* ====== */
    // @Test
    // public void test_save_delete_getById()
    // {
    //    int size1 = eptm.listByEmpId(1).size();
    //
    //     EmpPos tmpEmpPos1 = new EmpPos(1, 2, "2010-10-10", "2018-01-12", 40000);
    //     EmpPos tmpEmpPos2 = new EmpPos(1, 2, "2011-10-10", "2016-01-12", 60000);
    //     EmpPos tmpEmpPos3 = new EmpPos(1, 2, "2005-04-01", "2017-08-02", 71000);
    //     eptm.save(tmpEmpPos1);
    //     eptm.save(tmpEmpPos2);
    //     eptm.save(tmpEmpPos3);
    //
    //    int size2 = eptm.listByEmpId(1).size();
    //    assertTrue(size1 == size2 - 3);
    //
    //     eptm.delete(tmpEmpPos1);
    //     eptm.delete(tmpEmpPos2);
    //     eptm.delete(tmpEmpPos3);
    //     assertEquals(size1, eptm.listByEmpId(1).size());
    // }

    // @Test
    // public void test_update()
    // {
    //     EmpPos tmpEmpPos1 = new EmpPos(1, 2, "10.10.2010", "12.01.2018", 40000);
    //     EmpPos tmpEmpPos2 = new EmpPos(1, 2, "10-10-2011", "12-01-2016", 60000);
    //     eptm.save(tmpEmpPos1);
    //     eptm.save(tmpEmpPos2);
    //
    //     tmpEmpPos1.setName("Николай");
    //     tmpEmpPos2.setDivisionId(8);
    //     eptm.update(tmpEmpPos1);
    //     eptm.update(tmpEmpPos2);
    //
    //     EmpPos tmpEmpPos01 = eptm.getById(tmpEmpPos1.getId());
    //     EmpPos tmpEmpPos02 = eptm.getById(tmpEmpPos2.getId());
    //     assertEquals(tmpEmpPos1.toString(), tmpEmpPos01.toString());
    //     assertEquals(tmpEmpPos2.toString(), tmpEmpPos02.toString());
    //
    //     eptm.delete(tmpEmpPos1);
    //     eptm.delete(tmpEmpPos2);
    // }
    //
    // @Test
    // public void test_listByName()
    // {
    //     int size1 = eptm.listByName("ик").size();
    //     EmpPos tmpEmpPos1 = new EmpPos(1, 2, "10.10.2010", "12.01.2018", 40000);
    //     EmpPos tmpEmpPos2 = new EmpPos(1, 2, "10-10-2011", "12-01-2016", 60000);
    //     EmpPos tmpEmpPos3 = new EmpPos(2, 2, "01-04-2005", "02-08-2017", 71000);
    //     eptm.save(tmpEmpPos1);
    //     eptm.save(tmpEmpPos2);
    //     eptm.save(tmpEmpPos3);
    //
    //     int size2 = eptm.listByName("ик").size();
    //     assertTrue(size1 == size2 - 2);
    //
    //     eptm.delete(tmpEmpPos1);
    //     eptm.delete(tmpEmpPos2);
    //     eptm.delete(tmpEmpPos3);
    // }
    //
    // @Test
    // public void test_listByDivisionId()
    // {
    //     int size1 = eptm.listByDivisionId(1).size();
    //     EmpPos tmpEmpPos1 = new EmpPos(1, 2, "10.10.2010", "12.01.2018", 40000);
    //     EmpPos tmpEmpPos2 = new EmpPos(1, "Программист", "Программировать");
    //     EmpPos tmpEmpPos3 = new EmpPos(1, "Художник", "Рисовать");
    //     eptm.save(tmpEmpPos1);
    //     eptm.save(tmpEmpPos2);
    //     eptm.save(tmpEmpPos3);
    //
    //     int size2 = eptm.listByDivisionId(1).size();
    //     assertTrue(size1 == size2 - 3);
    //
    //     eptm.delete(tmpEmpPos1);
    //     eptm.delete(tmpEmpPos2);
    //     eptm.delete(tmpEmpPos3);
    // }
    /* ====== */

    // @Test
    // public void hqlRequest() {
    //     // TODO: delete this method
    // }

    // @Test
    // public void save() {
    // }
    //
    // @Test
    // public void update() {
    // }
    //
    // @Test
    // public void delete() {
    // }
    //
    // @Test
    // public void listByEmpId() {
    // }
    //
    // @Test
    // public void listByPosId() {
    // }
}
