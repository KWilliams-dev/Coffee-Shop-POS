package sample;

public class Toppings {

    String topping;
    double price;

    public Toppings(String topping, double price) {
        this.topping = topping;
        this.price = price;
    }

    public Toppings() {

    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double cost) {
        this.price = cost;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "topping='" + topping + '\'' +
                ", cost=" + price +
                '}';
    }
}
