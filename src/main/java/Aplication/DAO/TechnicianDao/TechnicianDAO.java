package Aplication.DAO.TechnicianDao;

import Aplication.Model.Customer;
import Aplication.Model.Technician;
import Aplication.DAO.CRUD;

public interface TechnicianDAO extends CRUD<Technician> {
    public Technician create(Technician technician);
}
