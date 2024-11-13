package com.example.javafxdemo;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class PrimaryController implements Initializable {

    public static ObservableList<Employee> PersonData = FXCollections.observableArrayList();

    @FXML
    private Button button;

    @FXML
    private Button buttonadd;

    @FXML
    private Button buttonmod;

    @FXML
    private TableView<Employee> TVEmployee;

    Stage stage;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        stage.close();
    }

    void setStage(Stage stg) {
        stage = stg;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Ajout des données si la liste est vide
        if (PersonData.isEmpty()) {
            PersonData.add(new Employee("Reese", "Kyle", "2004-04-12", "Comptable", 10000, "Comptabilité"));
            PersonData.add(new Employee("Smith", "John", "2000-12-01", "Comptable", 10000, "Comptabilité"));
            PersonData.add(new Employee("Wright", "Marcus", "2016-05-24", "Avocat", 12000, "Droit"));
        }

        // Ajouter les données à la TableView
        TVEmployee.getItems().addAll(PersonData);
    }

    // Méthode pour obtenir les éléments sélectionnés
    private ObservableList<Employee> getSelectedItems() {
        return TVEmployee.getSelectionModel().getSelectedItems();
    }

    // Méthode pour supprimer les employés sélectionnés
    public void deleteEmployeButtonClicked() {
        ObservableList<Employee> selectedEmployees = getSelectedItems();

        if (selectedEmployees != null) {
            ArrayList<Employee> rows = new ArrayList<>(selectedEmployees);
            rows.forEach(row -> TVEmployee.getItems().remove(row));
        }
    }

    // Méthode pour passer à une autre scène
    @FXML
    private void switchTosecondary() throws IOException {
        App.setRoot("secondary");
    }

    // Méthode pour passer à la scène "third.fxml"
    @FXML
    private void switchTothird() throws IOException {
        try {          
            FXMLLoader loader = new FXMLLoader(getClass().getResource("third.fxml"));
            Parent root = loader.load();       
            ModifController modifController = loader.getController();         
            modifController.setSelectedEmployees(getSelectedItems());     
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void switchToprimary() throws IOException {
        App.setRoot("primary");
    }
}
