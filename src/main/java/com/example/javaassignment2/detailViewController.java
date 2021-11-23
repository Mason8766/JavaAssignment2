package com.example.javaassignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.awt.Desktop;
import static com.example.javaassignment2.APIUtility.getGamesFromJSON;

public class detailViewController implements Initializable {
    RAWGResponse game = getGamesFromJSON();



    @FXML
    private Label lblName;

    @FXML
    private Label lblRelease;

    @FXML
    private Hyperlink lblWebsite;

    @FXML
    private Label lblRating;

    @FXML
    private TextArea txtDescription;

    @FXML
    private ImageView imgGameImage;

    @FXML
    private Button btnReturn;

    @FXML
    void returnSearch(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("search-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Games on the Go!: Search");
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        if (lblName.getText().length()> 22)
            lblName.setFont(Font.font(10));
        lblName.setText(game.getName());
        lblRating.setText(String.valueOf(game.getRating()));
        lblRelease.setText(game.getReleased());

        lblWebsite.setText(game.getWebsite());
        txtDescription.setText(game.getDescription());
        try {
            imgGameImage.setImage(new Image(game.getBackground_image()));
        }catch (Exception e){
        System.out.println("no immage");
        }



    }
    @FXML
    void openLink(ActionEvent event) {
        if (game.getWebsite().hashCode() != 0){


        //CREDIT For link tutorial https://www.youtube.com/watch?v=SlE0dCuO5yc&ab_channel=Randomcode
        try {
            Desktop.getDesktop().browse(new URI(game.getWebsite()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }}
    }

}
