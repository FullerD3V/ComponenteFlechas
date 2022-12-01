/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componenteflechas.Main;

import componenteflechas.ComponenteFlechas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author alumno
 */
public class MainFXMLController implements Initializable {

    Image Up = new Image(ComponenteFlechas.class.getResource("Resources/Up.png").toString());
    Image Down = new Image(ComponenteFlechas.class.getResource("Resources/Down.png").toString());
    Image Right = new Image(ComponenteFlechas.class.getResource("Resources/Right.png").toString());
    Image Left = new Image(ComponenteFlechas.class.getResource("Resources/Left.png").toString());

    @FXML
    private Button btnUp, btnDown, btnRight, btnLeft;

    @FXML
    private TextField txtUp, txtDown, txtRight, txtLeft;

    @FXML
    private void btnUpOnAction(){
        txtUp.setVisible(true);
    }

    @FXML
    private void btnDownOnAction(){
        txtDown.setVisible(true);
    }

    @FXML
    private void btnRightOnAction(){
        txtRight.setVisible(true);
    }

    @FXML
    private void btnLeftOnAction(){
        txtLeft.setVisible(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ImageView imgUp = new ImageView();
        imgUp.setImage(Up);
        imgUp.setFitHeight(75);
        imgUp.setFitWidth(75);
        btnUp.setMaxHeight(75);
        btnUp.setMaxWidth(75);
        btnUp.setMinHeight(75);
        btnUp.setMinWidth(75);

        ImageView imgDown = new ImageView();
        imgDown.setImage(Down);
        imgDown.setFitHeight(75);
        imgDown.setFitWidth(75);
        btnDown.setMaxHeight(75);
        btnDown.setMaxWidth(75);
        btnDown.setMinHeight(75);
        btnDown.setMinWidth(75);

        ImageView imgRight = new ImageView();
        imgRight.setImage(Right);
        imgRight.setFitHeight(75);
        imgRight.setFitWidth(75);
        btnRight.setMaxHeight(75);
        btnRight.setMaxWidth(75);
        btnRight.setMinHeight(75);
        btnRight.setMinWidth(75);

        ImageView imgLeft = new ImageView();
        imgLeft.setImage(Left);
        imgLeft.setFitHeight(75);
        imgLeft.setFitWidth(75);
        btnLeft.setMaxHeight(75);
        btnLeft.setMaxWidth(75);
        btnLeft.setMinHeight(75);
        btnLeft.setMinWidth(75);
        
        btnUp.setGraphic(imgUp);
        btnDown.setGraphic(imgDown);
        btnRight.setGraphic(imgRight);
        btnLeft.setGraphic(imgLeft);
    }
}
