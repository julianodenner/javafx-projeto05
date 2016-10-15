package com.jdenner.controller;

import com.jdenner.model.Lancamento;
import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Juliano
 */
public class JanelaController implements Initializable {

    @FXML
    private Label lbLancamentos;

    @FXML
    public void novoLancamento(ActionEvent event) throws IOException {
        String url = "/com/jdenner/view/Formulario.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
        Parent root = loader.load();
        
        FormularioController controller = loader.getController();
        controller.setJanela(this);
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void setLancamento(Lancamento lancamento) {
        String texto = lbLancamentos.getText();
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        texto += "\n" + nf.format(lancamento.getValor());
        
        lbLancamentos.setText(texto);
    }
    
}
