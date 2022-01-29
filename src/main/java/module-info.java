module com.example.orion {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example.orion.client;
    opens com.example.orion.client to javafx.fxml;
}