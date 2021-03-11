/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.parole;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="btnCancella"
    private Button btnCancella; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader
    
    @FXML // fx:id="txtTime"
    private TextArea txtTime; // Value injected by FXMLLoader

    @FXML
    void doCancel(ActionEvent event) {

    	String daCancellare= txtResult.getSelectedText();
    	words.togliParola(daCancellare);
    	String s="";
    	for(String ss: words.getElenco()) {
    		s+= ss+ "\n";
    	}
    	txtResult.setText(s);
    	txtTime.appendText("L'operazione CANCEL ha impegato "+System.nanoTime()+"ns"+"\n");
    }
 
    Parole words= new Parole();
    @FXML
    void doInsert(ActionEvent event) {

    	
    	String testo= txtParola.getText();
    	String[] parole= testo.split(" ");
    	for(String p: parole) {
    		words.addParola(p);
    	}
    	String s="";
    	for(String ss: words.getElenco()) {
    		s+= ss+ "\n";
    	}
    	txtParola.clear();
    	txtResult.setText(s);
    	txtTime.appendText("L'operazione INSERT ha impegato "+System.nanoTime()+"ns"+"\n");
    	
    	
    }

    @FXML
    void doReset(ActionEvent event) {

    	words.reset();
    	
    	txtResult.clear();
    	txtTime.appendText("L'operazione RESET ha impegato "+System.nanoTime()+"ns"+"\n");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
