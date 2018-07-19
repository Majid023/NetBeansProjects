/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventHandle;

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author DELL
 */


public class Controller {
    @FXML
    private Label lbl;
    
    @FXML
    public void onClick(ActionEvent event){
        Random rand = new Random();
        int number = rand.nextInt(50)+1;
        lbl.setText(String.valueOf(Integer.toString(number)));
    }
}



