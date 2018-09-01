/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class MainApplication extends Application {
    
    // main method where our application start
    
    public static void main(String... args) {
        
        // it call start method
        launch(args);
    }

    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        // load method load fxml file
        Parent root = FXMLLoader.load(getClass().getResource("UI_Design.fxml"));
        
        Scene scene = new Scene(root);
        
        // use css 
        //scene.getStylesheets().add(getClass().getResource("custom.css").toExternalForm());
        // title for our Game
        primaryStage.setTitle("Puzzle Game");
        
        primaryStage.setResizable(false);
      //  primaryStage.getIcons().add(new Image(""));
        primaryStage.centerOnScreen();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

