/*
Extra Credit Assignment - Kyle Williams - 11/07/2021 - ITEC 3150 SECTION 03
 */

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
          Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
          primaryStage.setScene(new Scene(root));
          primaryStage.setTitle("Order Calculator");
          primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
