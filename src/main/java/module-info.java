module com.example.javaassignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;

    opens com.example.javaassignment2 to javafx.fxml, com.google.gson;
    exports com.example.javaassignment2;
}