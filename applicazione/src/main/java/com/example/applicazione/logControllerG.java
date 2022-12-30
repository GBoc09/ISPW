package com.example.applicazione;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class logControllerG {

    @FXML
    private Button account;

    @FXML
    private Button facebook;

    @FXML
    private ImageView google;

    @FXML
    private Button login;

    @FXML
    private Button menu;

    @FXML
    private Button search;

    @FXML
    void FacebookButtonClicked(ActionEvent event) {

    }

    @FXML
    void GoogleButtonClicked(ActionEvent event) {

    }

    @FXML
    void createAccount(ActionEvent event) throws IOException {
        System.out.println("... creating account process is running ...");
        Stage stage = (Stage)account.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("accountGUI.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 600, 333));
        primaryStage.show();
    }

    @FXML
    void logButtonClicked(ActionEvent event) {

    }

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
    void searchButtonClicked(ActionEvent event) throws IOException {
        System.out.println("... research page ...");
        Stage stage = (Stage)search.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("searchGUI.fxml"));
        primaryStage.setTitle("Research page");
        primaryStage.setScene(new Scene(root, 600, 333));
        primaryStage.show();
    }

}

