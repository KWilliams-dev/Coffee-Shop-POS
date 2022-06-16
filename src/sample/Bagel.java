package sample;

public class Bagel {

    String breadType;
    double price;

    public Bagel(String breadType, double price) {
        this.breadType = breadType;
        this.price = price;
    }

    public Bagel() {

    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return breadType;
    }
}
