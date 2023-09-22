package com.example.laba6test;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ResultController {
    @FXML
    public Label result;
    public static String ress;

    public static void getRes(String resultat){
        ress = resultat;
    }
    public void initialize() {
        result.setText(ress);
    }


    public void exitButton(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void setRes(String res) {
        result.setText(res);
    }
}
