package com.example.javafxdemo;
import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


/**
 * FXML Controller class
 *
 * @author Fomnus
 */
public class AjoutPersonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    public AjoutPersonController(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("secondary.fxml"));
        loader.setController(this);
        try{
            loader.load();
        }catch(Exception e){

        }
    }
    @FXML AnchorPane createPersonAnchor;
    @FXML public void setFXMLCreatePersonAnchorPane(AnchorPane fxmlCreatePerson){
        createPersonAnchor = fxmlCreatePerson;
    }
    @FXML public AnchorPane getFXMLCreatePersonAnchorPane(){
        return createPersonAnchor;
    }
    @FXML TextField nom;
    @FXML TextField prenom;
    @FXML TextField salaire;
    @FXML TextField poste;
    @FXML TextField service;
    @FXML DatePicker date ;


    @FXML public void createPersonAction() throws IOException {
            nom.getText();
            prenom.getText();
            int testt = Integer.parseInt(salaire.getText());
            poste.getText();
            service.getText();
            String datetset = date.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            PrimaryController.PersonData.add(new Employee(nom.getText(), prenom.getText(), datetset, poste.getText(), testt, service.getText()));
            App.setRoot("primary");
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void switchToprimary() throws IOException {
         App.setRoot("primary");
     }

}

