package Aplication.DAO.WorkOrderDao;
import Aplication.Model.Customer;
import Aplication.Model.WorkOrder;
import Aplication.DAO.CRUD;

public interface WorkOrderDAO extends CRUD<WorkOrder>{
    public WorkOrder create(WorkOrder workOrder);
    public WorkOrder findByCustomer(Customer customer);
    
}
