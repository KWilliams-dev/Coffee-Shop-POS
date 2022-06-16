package sample;

import java.text.NumberFormat;

public class Total {

    double subTotal;
    double tax;
    double completeTotal;

    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public Total() {

    }

    public String getTotal() {
        String subTotal2 = formatter.format(this.subTotal);
        return subTotal2;
    }

    public String getTax() {
        tax = (subTotal * .07);
        String tax2 = formatter.format(this.tax);
        return tax2;
    }

    public String getCompleteTotal(){
        completeTotal = tax + subTotal;
        String completeTotal2 = formatter.format(completeTotal);
        return completeTotal2;
    }

    public void addToTotal(double price){
        subTotal += price;
    }

    @Override
    public String toString() {
        return String.valueOf(this.subTotal);
    }
}
