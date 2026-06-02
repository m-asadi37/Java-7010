module com.example.junico {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.junico to javafx.fxml;
    opens com.example.junico.controller to javafx.fxml;

    exports com.example.junico;
}