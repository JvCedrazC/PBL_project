package Aplication.DAO.TechnicianDao;

import Aplication.Model.Technician;
import Aplication.DAO.CRUD;

public interface TechnicianDAO extends CRUD<Technician> {
    public Technician create(Technician technician);
    public Technician findByName(String name);
}
