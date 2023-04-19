package Aplication.DAO;

import Aplication.DAO.CustomerDao.CustomerDAO;
import Aplication.DAO.CustomerDao.CustomerDaoList;
import Aplication.DAO.TechnicianDao.TechnicianDAO;
import Aplication.DAO.TechnicianDao.TechnicianDaoList;
import Aplication.DAO.WorkOrderDao.WorkOrderDAO;
import Aplication.DAO.WorkOrderDao.WorkOrderDaoList;

public class Dao{
    public static CustomerDAO customerDao;
    public static TechnicianDAO technicianDao;
    public static WorkOrderDAO workOrderDAO;
    public static CustomerDAO getCustomer(){
        if (customerDao == null){
            customerDao = new CustomerDaoList();
        }
        return customerDao;
    }
    public static TechnicianDAO getTechnicianDao(){
        if (technicianDao == null){
            technicianDao = new TechnicianDaoList();
        }
        return technicianDao;
    }
    public static WorkOrderDAO workOrderDao(){
        if (workOrderDAO == null){
            workOrderDAO = new WorkOrderDaoList();
        }
        return workOrderDAO;
    }

}
