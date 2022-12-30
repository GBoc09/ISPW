package com.example.applicazione;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class scubaControllerG {

    @FXML
    private Button bag;

    @FXML
    private Button bookCourse;

    @FXML
    private Button equip;

    @FXML
    private Button menu;

    @FXML
    private Button search;

    @FXML
    private Button user;
    @FXML
    private Button logBook;


    @FXML
    void bagButtonClicked(ActionEvent event) throws IOException {
        System.out.println("Your Cart");
        Stage stage = (Stage)bag.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("cartGUI.fxml"));
        primaryStage.setTitle("What's on your cart?");
        primaryStage.setScene(new Scene(root, 600, 333));
        primaryStage.show();
    }

    @FXML
    void bookScubaCourse(ActionEvent event) throws IOException {
        System.out.println("Chose a course");
        Stage stage = (Stage)bookCourse.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("scubaCourseGUI.fxml"));
        primaryStage.setTitle("Scuba Courses");
        primaryStage.setScene(new Scene(root, 600, 333));
        primaryStage.show();
    }
    @FXML
    void logBook(ActionEvent event) {

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
    void rentEquip(ActionEvent event) throws IOException {
        System.out.println("... Rent Equipment ...");
        Stage stage = (Stage)equip.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("rentGUI.fxml"));
        primaryStage.setTitle("Rent Equip");
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

