/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.useSceneBuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

/**
 *
 * @author DELL
 */
public class MainController {
   @FXML 
   private Button btn;
   @FXML
   private CheckBox checkbox;
   
   public void showMessage(ActionEvent event){
       
            if(checkbox.isSelected()){
                checkbox.setSelected(false);
            }
            else{
                checkbox.setSelected(true);
            }
   }
}
