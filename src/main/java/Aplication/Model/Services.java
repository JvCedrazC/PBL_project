package Aplication.Model;

public abstract class Services {
    Double price;
    Double cost;

    //price getters and setters
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    //cost getters and setters
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
}
