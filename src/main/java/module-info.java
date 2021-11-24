module com.example.javaassignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;
    requires java.desktop;

    opens com.example.javaassignment2 to javafx.fxml, com.google.gson;
    exports com.example.javaassignment2;
    exports com.example.javaassignment2.Utilities;
    opens com.example.javaassignment2.Utilities to com.google.gson, javafx.fxml;
    exports com.example.javaassignment2.Controllers;
    opens com.example.javaassignment2.Controllers to com.google.gson, javafx.fxml;
    exports com.example.javaassignment2.Models;
    opens com.example.javaassignment2.Models to com.google.gson, javafx.fxml;
}