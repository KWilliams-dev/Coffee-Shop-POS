package sample;

import java.util.ArrayList;

public class Coffee {

    String coffeeType;
    double price;

    public Coffee(String coffeeType, double price) {
        this.coffeeType = coffeeType;
        this.price = price;
    }

    public Coffee() {

    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeType='" + coffeeType + '\'' +
                ", price=" + price +
                '}';
    }
}
