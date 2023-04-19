package Aplication.Model;
import java.util.List;
import java.util.Date;

    public class WorkOrder{
        private int id;
        private String status = "Em andamento";
        private Double price;
        private Double cost;
        private int customerId;
        private int technicianId;
        private String description;
        private String createdAT;
        private String finishedAT;
        private String paymentmethod = null;
        private List<Services> service;

        public WorkOrder(int id, String status, Double price, Double cost, int customerId, int technicianId ){
            setId(id);
            setStatus(status);
            setCost(cost);
            setPrice(price);
            setCustomer(customerId);
            setTechnician(technicianId);
        }

        //ID setter and getter
        public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }

        //Technician setter and getter
        public void setTechnician(int technician) {
            this.technicianId = technician;
        }
        public int getTechnician() {
            return technicianId;
        }

        //costumer getter and setter
        public void setCustomer(int costumer) {
            this.customerId = costumer;
        }
        public int getCustomer() {
            return customerId;
        }

        //Status getter and setter
        public void setStatus(String status) {
            this.status = status;
        }
        public String getStatus() {
            return status;
        }

        //Cost Getter and setter
        public void setCost(Double cost) {
            this.cost = cost;
        }
        public Double getCost() {
            return cost;
        }

        //Price Getter and Setter
        public void setPrice(Double price){
            this.price = price;
        }
        public Double getPrice() {
            return price;
        }

        //Descreption getters and setters
        public void setDescription(String description) {
            this.description = description;
        }
        public String getDescription() {
            return description;
        }

        //cratedAT getter and setter
        public void setCreatedAT(String createdAT) {
            this.createdAT = createdAT;
        }
        public String getCreatedAT() {
            return createdAT;
        }

        //finishedAT getter and setter
        public void setFinishedAT(String finishedAT) {
            this.finishedAT = finishedAT;
        }
        public String getFinishedAT() {
            return finishedAT;
        }

        //paymentmethod getter and setter
        public void setPaymentmethod(String paymentmethod) {
            this.paymentmethod = paymentmethod;
        }
        public String getPaymentmethod() {
            return paymentmethod;
        }

        //services getters and setters
        public List<Services> getService() {
            return service;
        }
        public void setService(List<Services> service) {
            this.service = service;
        }

        //class' methods
        public void addService(Services service){
            this.service.add(service);
            this.price = service.getPrice();
            this.cost = service.getCost();
        }
    }

