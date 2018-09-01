/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class MainController implements Initializable {

    @FXML private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    @FXML private Label blankField;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        randomNumberGenerate();
    }    

    private void randomNumberGenerate() {
       int count = 0;
      
       while(count <= 8){
           
          break;
        }
    }
}
