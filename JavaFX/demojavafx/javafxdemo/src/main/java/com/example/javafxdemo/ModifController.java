package com.example.javafxdemo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ModifController implements Initializable {
    @FXML
    TextField nom;
    @FXML
    TextField prenom;
    @FXML
    TextField poste;
    @FXML
    TextField salaire;
    @FXML
    TextField service;
    @FXML
    Button boutontest;

    public ObservableList<Employee> Employeeselect;
    
    public void setSelectedEmployees(ObservableList<Employee> Employeeselect) {
        this.Employeeselect = Employeeselect;
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
            
    }

    Stage stage;

    void setStage(Stage stg) {
        stage = stg;
    }

    public void modifperso() throws IOException {
        Employee selectedEmployee = Employeeselect.get(0); 
        selectedEmployee.setNom(nom.getText());
        selectedEmployee.setPrenom(prenom.getText());
        selectedEmployee.setPoste(poste.getText());
        selectedEmployee.setSalaire(Integer.parseInt(salaire.getText()));
        selectedEmployee.setService(service.getText());

        Stage stage = (Stage) boutontest.getScene().getWindow();
        stage.close();
        App.setRoot("primary");
        
       
    }
    public void afficheperso() {
       Employee selectedEmployee = Employeeselect.get(0);        
        nom.setText(selectedEmployee.getNom());
        prenom.setText(selectedEmployee.getPrenom());
        poste.setText(selectedEmployee.getPoste());
        salaire.setText(Integer.toString(selectedEmployee.getSalaire()));
        service.setText(selectedEmployee.getService());  
    }

    @FXML
    private void switchToprimary() throws IOException {
        App.setRoot("primary");
    }
}
