/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package css;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class JavaFXWithCSS extends Application {
    public static void main(String... args){
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource("MainFXML.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("mainfxml.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("CSS");
        
        primaryStage.show();
    }
        
}
