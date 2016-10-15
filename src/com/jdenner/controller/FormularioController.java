package com.jdenner.controller;

import com.jdenner.model.Lancamento;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Juliano
 */
public class FormularioController implements Initializable {

    private JanelaController janela;
    
    @FXML
    private TextField tfCampoValor;

    @FXML
    public void adicionarValor(ActionEvent event) {
        Lancamento lancamento = new Lancamento();
        
        try {
            lancamento.setValor(tfCampoValor.getText());
        } catch (Exception e) {
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setHeaderText("Valor inválido");
            a.show();
            return;
        }
        
        janela.setLancamento(lancamento);
        
        Stage stage = (Stage) tfCampoValor.getScene().getWindow();
        stage.hide();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void setJanela(JanelaController janela) {
        this.janela = janela;
    }
    
}
