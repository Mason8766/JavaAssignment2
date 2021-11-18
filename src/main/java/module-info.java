module com.example.javaassignment2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaassignment2 to javafx.fxml;
    exports com.example.javaassignment2;
}