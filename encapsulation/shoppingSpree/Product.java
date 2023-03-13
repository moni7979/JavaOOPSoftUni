package encapsulation.shoppingSpree;

public class Product {

    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    public void setName(String name) {
        Validator.validateName(name);
        this.name = name;
    }

    public void setCost(double cost) {
        Validator.validateMoney(cost);
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }



}
