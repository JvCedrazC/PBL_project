package Aplication.DAO.CustomerDao;

import Aplication.DAO.CRUD;
import Aplication.Model.Customer;

public interface CustomerDAO extends CRUD<Customer>{
    public Customer create(Customer customer);
}
