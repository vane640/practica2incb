module com.uejemplos.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uejemplos.demo to javafx.fxml;
    exports com.uejemplos.demo;
}