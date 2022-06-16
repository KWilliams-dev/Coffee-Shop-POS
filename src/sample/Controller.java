package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Total total = new Total();
    public Bagel bagel = new Bagel();
    public Coffee coffee = new Coffee();
    public Toppings toppings = new Toppings();

    @FXML
    private CheckBox bagelWhite;
    @FXML
    private CheckBox bagelWheat;
    @FXML
    private CheckBox creamCheese;
    @FXML
    private CheckBox butter;
    @FXML
    private CheckBox peachJelly;
    @FXML
    private CheckBox blueberryJam;
    @FXML
    private CheckBox none;
    @FXML
    private CheckBox regularCoffee;
    @FXML
    private CheckBox decafCoffee;
    @FXML
    private CheckBox cappuccino;
    @FXML
    private Button calculate;
    @FXML
    private Button close;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void checkEventWheatBagel(ActionEvent event) {
        if (bagelWheat.isSelected()) {
            bagel.setPrice(2.25);
            total.addToTotal(bagel.getPrice());
            System.out.println("Customer would like one wheat bagel for: $" + bagel.getPrice());
        }
    }
    public void checkEventWhiteBagel(ActionEvent event){

        if (bagelWhite.isSelected()) {
            bagel.setPrice(2.25);
            total.addToTotal(bagel.getPrice());
            System.out.println("Customer would like one white bagel for: $" + bagel.getPrice());
        }
    }
    public void checkEventCreamCheese(ActionEvent event) {
        if (creamCheese.isSelected()) {
            toppings.setPrice(0.25);
            total.addToTotal(toppings.getPrice());
            System.out.println("Customer would like to add cream cheese topping for: " + toppings.getPrice());
        }
    }
    public void checkEventButter (ActionEvent event) {
        if (butter.isSelected()) {
            toppings.setPrice(0.25);
            total.addToTotal(toppings.getPrice());
            System.out.println("Customer would like butter for: " + toppings.getPrice());
        }
    }
    public void checkEventPeachJelly (ActionEvent event) {
        if (peachJelly.isSelected()) {
            toppings.setPrice(0.25);
            total.addToTotal(toppings.getPrice());
            System.out.println("Customer would like peach jelly for: " + toppings.getPrice());
        }
    }
    public void checkEventBlueberryJam(ActionEvent event) {
        if (blueberryJam.isSelected()) {
            toppings.setPrice(0.25);
            total.addToTotal(toppings.getPrice());
            System.out.println("Customer would like blueberry jam for:  " + toppings.getPrice());
        }
    }
    public void checkEventNone(ActionEvent event) {
        if (none.isSelected()) {
            coffee.setPrice(0.00);
            total.addToTotal(coffee.getPrice());
            System.out.println("Customer doesn't want any coffee" + coffee.getPrice());
        }
    }
    public void checkEventRegularCoffee(ActionEvent event) {
        if (regularCoffee.isSelected()) {
            coffee.setPrice(3.00);
            total.addToTotal(coffee.getPrice());
            System.out.println("Customer would like one regular coffee for:  " + coffee.getPrice());
        }
    }
    public void checkEventDecafCoffee(ActionEvent event) {
        if (decafCoffee.isSelected()) {
            coffee.setPrice(3.00);
            total.addToTotal(coffee.getPrice());
            System.out.println("Customer would like one decaf coffee for:  " + coffee.getPrice());
        }
    }
    public void checkEventCappuccino(ActionEvent event) {
        if (cappuccino.isSelected()) {
            coffee.setPrice(3.00);
            total.addToTotal(coffee.getPrice());
            System.out.println("Customer would like one cappuccino for: " + coffee.getPrice());
        }
    }

    public void handleButtonAction() {
        calculate.setOnAction(e -> displayTotal());
    }

    public void handleButtonAction2() {
        close.setOnAction(e -> closeWindow());
    }

    public void closeWindow(){
        System.exit(0);
    }

    private Stage displayTotal() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        Label subTotalLabel = new Label(String.valueOf(total.getTotal()));
        Label taxLabel = new Label(String.valueOf(total.getTax()));
        Label completeTotal = new Label(String.valueOf(total.getCompleteTotal()));

        pane.add(new Label("Subtotal: "),0,0);
        pane.add(subTotalLabel, 1,0);
        pane.add(new Label("Tax: "), 0,1);
        pane.add(taxLabel, 1,1);
        pane.add(new Label("Total: "), 0,2);
        pane.add(completeTotal,1,2);

        pane.setPadding(new Insets(100,100,100,100));

        Stage s = new Stage();
        s.setScene(new Scene(pane));
        s.show();

        return s;

    }
}
