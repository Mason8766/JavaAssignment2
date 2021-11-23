package com.example.javaassignment2;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.javaassignment2.APIUtility.getGamesFromJSON;
import static com.example.javaassignment2.APIUtility.getMoviesFromAPI;

public class searchViewController{

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
//22
        if (txtSearch.getText().length() >0 ){
        try{

            getMoviesFromAPI(txtSearch.getText());
            RAWGResponse test = getGamesFromJSON();
            if (test.getName() == null)
                lblError.setText("Game not found");
            else{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("details-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setTitle("Games on the Go!: Details");
                stage.setScene(scene);
                stage.show();}
        }catch (Exception e)
        {
            lblError.setText("A Unknown error has occurred");
        }
        }else
        {
            lblError.setText("No game was entered");
        }

    }


}
