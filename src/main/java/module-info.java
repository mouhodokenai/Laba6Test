module com.example.laba6test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laba6test to javafx.fxml;
    exports com.example.laba6test;
}