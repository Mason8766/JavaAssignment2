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
import javafx.scene.image.ImageView;
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
    private ImageView imgPoster;
    @FXML
    private Button btnDetails;

    @FXML
    void DetailsClicked(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("details-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Games on the Go!: Details");
        stage.setScene(scene);
        stage.show();
    }
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
                btnDetails.setDisable(false);
                lblError.setText("Game Found");
                lblError.setStyle("-fx-color: green;");
                try {
                    imgPoster.setImage(new Image(test.getBackground_image()));
                }catch (Exception e){
                    System.out.println("no image");
                    imgPoster.setImage(new Image("https://www.google.com/search?q=no+image&rlz=1C1ONGR_enCA928CA928&sxsrf=AOaemvJpVJEhDpm_4-EmvllhV_bYpEmC_A:1637700231459&tbm=isch&source=iu&ictx=1&fir=-QpL1I7u3zbiBM%252C029W-ajBtZqZzM%252C_%253BKDNppyUHocvEWM%252CaY2W28UsxZn-4M%252C_%253BZ7xJTlohWIItUM%252CLDnLiJ-oRy4-NM%252C_%253BwcTtuETpmP_xaM%252Cldp7V-Ybx0nO3M%252C_%253BsXGK1AzI0U7nIM%252CLDnLiJ-oRy4-NM%252C_%253B5qEaMZpfwjSl-M%252CnrfynTDcnO_BGM%252C_%253B_3a8DGLxJcsFQM%252CLDnLiJ-oRy4-NM%252C_%253Br_eCQ0GQ0UO8ZM%252CH0F39Afu_F6SBM%252C_%253BXgy6VJHMNVpBzM%252CMcX7zI2MyXyP-M%252C_%253BoiEOjtEmXM8gRM%252CWYZyQrTrQ8Xd6M%252C_%253B8vt1U_7wV1YvDM%252CqCpptpER3vmPdM%252C_%253B8F4-XnKEUDntvM%252CmiPsXBYId1cWIM%252C_%253BRs7eoVJHmzVQHM%252CxgQlOUW0EqO1KM%252C_%253B57jbTkTzJzReMM%252CbiTbknbojKNO_M%252C_%253BqvFhXKhgg9nhFM%252C2xOxVtxgCum9zM%252C_%253BsIlXAVUVxVR2yM%252C5DVRcCDOgdoVUM%252C_%253Bi2jbX8LdidMaOM%252CWYZyQrTrQ8Xd6M%252C_&vet=1&usg=AI4_-kQlum3S_JNWhFoYckhUk144FaT9aQ&sa=X&ved=2ahUKEwjIlK3krK_0AhWQk4kEHbBXCe0Q9QF6BAgDEAE#imgrc=-QpL1I7u3zbiBM"));
                }

               }
        }catch (Exception e)
        {
            lblError.setText("The game you selected is incomplete/invalid.");
            System.out.println(e);
        }
        }else
        {
            lblError.setText("No game was entered");
        }

    }


}
