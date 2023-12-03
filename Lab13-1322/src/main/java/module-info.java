module com.example.lab131322 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab131322 to javafx.fxml;
    exports com.example.lab131322;
}