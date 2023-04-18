package Aplication.DAO;

import Aplication.DAO.CustomerDao.CustomerDAO;
import Aplication.DAO.CustomerDao.CustomerDaoList;
import Aplication.DAO.TechnicianDao.TechnicianDAO;
public class Dao{
    public static CustomerDAO customerDao;
    public static TechnicianDAO technicianDao;
    public static CustomerDAO getCustomer(){
        if (customerDao == null){
            customerDao = new CustomerDaoList();
        }
        return customerDao;
    }

}
