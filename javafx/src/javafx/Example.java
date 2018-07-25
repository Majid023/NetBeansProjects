/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class Example extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button();
        btn.setText("Click me!");
        
        AnchorPane pane = new AnchorPane();
        pane.getChildren().add(btn);
        
        Scene scene = new Scene(pane,300,200);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("javafx example");
        primaryStage.show();
        
    }
    
    public static void main( String... args){
        launch(args);
    }
    
    
}
