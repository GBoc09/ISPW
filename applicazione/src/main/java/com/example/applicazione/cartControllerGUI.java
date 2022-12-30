package com.example.applicazione;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class cartControllerGUI {

    @FXML
    private Button menu;

    @FXML
    private Button modCart;

    @FXML
    private Button rentNow;

    @FXML
    private Button search;

    @FXML
    private Button user;

    @FXML
    void menuButtonClicked(ActionEvent event) throws IOException {
        System.out.println("... showing menu ...");
        Stage stage = (Stage)menu.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("homeGUI.fxml"));
        primaryStage.setTitle("DIVERSWORLD");
        primaryStage.setScene(new Scene(root, 600, 333));
        primaryStage.show();
    }

    @FXML
    void modCart(ActionEvent event) {

    }

    @FXML
    void rentNow(ActionEvent event) {

    }

    @FXML
    void searchButtonClicked(ActionEvent event) {

    }

    @FXML
    void yourProfile(ActionEvent event) throws IOException {
        System.out.println("Welcome on your dashboard");
        Stage stage = (Stage)user.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("youGUI.fxml"));
        primaryStage.setTitle("About You");
        primaryStage.setScene(new Scene(root, 600, 333));
        primaryStage.show();
    }

}

