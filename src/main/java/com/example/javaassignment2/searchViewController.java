package com.example.javaassignment2;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

import static com.example.javaassignment2.APIUtility.getGamesFromJSON;
import static com.example.javaassignment2.APIUtility.getMoviesFromAPI;

public class searchViewController {

    @FXML
    private Label lblTitle;

    @FXML
    private Label lblSubTitle;

    @FXML
    private TextField txtSearch;

    @FXML
    private Label lblInstruction;

    @FXML
    private Button btnSearch;

    @FXML
    private Label lblError;

    @FXML
    void searchGame(ActionEvent event) throws IOException, InterruptedException {

        try{
            getMoviesFromAPI("blah");
            RAWGResponse test = getGamesFromJSON();
            if (test.getName() == null)
                lblError.setText("Game not found");
            else
                System.out.println("Change scence");
        }catch (Exception e){
            lblError.setText("A Unknown error has occurred");
        }

    }

}
