package test;
import Aplication.Model.Customer;
import Aplication.Model.Technician;


public class Test_technician_customer {
    String technician_nome = "Tecnico";
    String customer_nome = "Cliente";
    int technicianID = 0;
    int customerID = 0;

    public void compare_customer(){
        Customer cliente = new Customer();
        cliente.setId(customerID);
        cliente.setName(customer_nome);
        assert cliente.getId() == customerID && cliente.getName() == customer_nome: "ERRO! Valores diferentes";
    }
    public void compare_technician(){
        Technician technician = new Technician(technicianID, technician_nome);
        assert technician.getId() == technicianID && technician.getName() == technician_nome: "ERRO! Valores diferentes";
    }

}


