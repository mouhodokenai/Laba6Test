package com.example.laba6test;
import javafx.scene.control.Alert;

public class ErrorForm {
    public static void showError() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ошибка");
        alert.setHeaderText(null);
        alert.setContentText("неверный ввод данных");
        alert.showAndWait();
    }
}
