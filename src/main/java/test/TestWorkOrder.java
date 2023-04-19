package test;

import Aplication.DAO.WorkOrderDao.WorkOrderDAO;
import Aplication.Model.WorkOrder;

public class TestWorkOrder {
    public void testWk(){
        WorkOrder wk1 = new WorkOrder(0, "andamento",0.0, 0.0, 0, 0,"Pix");
        WorkOrder wk2 = new WorkOrder(0, "andamento",0.0, 0.0, 0, 0,"Pix");
        assertEquals(wk1, wk2);
    }


}


}
