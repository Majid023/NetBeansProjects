/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxwebview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class FXMLController implements Initializable {

    @FXML private WebView webView;
    private WebEngine engine;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        engine = webView.getEngine();
    }    
    public void btn1(ActionEvent event) {
        engine.load("http://www.madein.network");
        System.out.println("madein.network");
    }
    
    
    public void btn2(ActionEvent event) {
       engine.executeScript("window.location=\"http://google.com//\";");
       System.out.println("google.com");
    }
    
    public void btn3(ActionEvent event) {
        engine.loadContent("<h1>Hwllo world</h1>");
        System.out.println("html code");
    }
    
    public void btn4(ActionEvent event) {
        engine.reload();
        System.out.println("reload");
    }
}
