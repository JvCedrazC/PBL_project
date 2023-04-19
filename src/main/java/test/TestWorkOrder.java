package test;
//import org.junit.jupiter.api.Test;
import Aplication.DAO.WorkOrderDao.WorkOrderDAO;
import Aplication.DAO.WorkOrderDao.WorkOrderDaoList;
import Aplication.Model.WorkOrder;
//import static org.junit.jupiter.api.Assertions.*;

public class TestWorkOrder {
    public void testWk(){
        WorkOrder wk1 = new WorkOrder(0, "andamento",0.0, 0.0, 0, 0,"Pix");
        WorkOrder wk2 = new WorkOrder(0, "andamento",0.0, 0.0, 0, 0,"Pix");
        //assertEquals(wk1, wk2);
    }
    public void testCriarWkDao(){
        WorkOrderDAO dao = new WorkOrderDaoList();
        WorkOrder wk1 = new WorkOrder(0, null, null, null, 0, 0, "pix");
        dao.create(wk1);
        assert dao.findById(0).getPaymentmethod() == wk1.getPaymentmethod(): "Erro ao criar novo dao";

    }


}



