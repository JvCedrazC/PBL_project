package Aplication.Model;

public class Component {
    int id;
    Double cost;
    Double price;
    String name;
    public Component(int id, Double cost, Double price, String name){
        setId(id);
        setCost(cost);
        setPrice(price);
        setName(name);
    }
    public void setId(int id){
        this.id = id;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}