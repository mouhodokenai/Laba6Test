package com.example.laba6test;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("ResultForm.fxml"));
    @FXML
    private BorderPane root;
    @FXML
    public Label resultat;
    public Label result;
    @FXML
    public TextField number1TextField;
    @FXML
    private TextField number2TextField;

    @FXML
    public void calculateButtonClicked() {
        int number1;
        int number2;
        String res;
        try {
            number1 = Integer.parseInt(number1TextField.getText());
            number2 = Integer.parseInt(number2TextField.getText());
            int sum1 = func(number1);
            int sum2 = func(number2);
            if (number1 < 1 | number2 < 1) {
                res = "одно или оба числа не натуральны";
            } else if (sum1 == sum2) {
                res = "суммы равны";
            } else if (sum1 > sum2) {
                res = "в 1 числе сумма цифр больше";
            } else {
                res = "во 2 числе сумма цифр больше";
            }
            switchToNewScene((Stage) root.getScene().getWindow());
            ResultController resultController = loader.getController();
            resultController.setRes(res);

        } catch (NumberFormatException e) {
            ErrorForm.showError();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int func(int num) {
        int sum = 0;
        while (num > 0) {
            int n1 = num % 10;
            num = num / 10;
            sum += n1;
        }
        return sum;
    }

    public Scene loadNewScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResultForm.fxml"));
        Parent root = loader.load();
        return new Scene(root);
    }
    public void switchToNewScene(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResultForm.fxml"));
        Parent root = loader.load();
        Scene newScene = new Scene(root);
        primaryStage.setScene(newScene);
        primaryStage.show();
    }




}

