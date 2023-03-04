module com.example.ecom {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.ecom.r to javafx.fxml;
    exports com.ecom.r;
}