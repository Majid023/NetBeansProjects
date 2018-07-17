/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
/**
 *
 * @author DELL
 */
public class LemdaExpression extends Application {
    
    
    public static void main(String... args){
        launch(args);
    }
    
    @Override
    public void start(Stage stage){
        Button show_button = new Button();
        Button exit_button = new Button( "Exit" );
        show_button.setText( "Click me!" );
        show_button.setOnAction( new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event){
                System.out.println("Hii... Majid, How are you?");
            }
        });
        
        exit_button.setOnAction(e->System.exit(0) );
        
        
        VBox root = new VBox();
        root.getChildren().addAll(show_button,exit_button);
        
        Scene scene = new Scene(root, 400,300);
        stage.setTitle( "lamda expression" );
        stage.setScene(scene);
        
        stage.show();
        
            
        
    }
}





