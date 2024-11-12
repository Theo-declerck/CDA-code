package com.example.javafxdemo;

import com.example.javafxdemo.Employee;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        TableView<Employee> table = new TableView<Employee>();

        TableColumn<Employee, String> nom = new TableColumn<Employee, String>("nom");
        TableColumn<Employee, String> Prenom = new TableColumn<Employee, String>("Prenom");
        TableColumn<Employee, String> date = new TableColumn<Employee, String>("date");
        TableColumn<Employee, String> salaire = new TableColumn<Employee, String>("Salaire");
        TableColumn<Employee, String> poste = new TableColumn<Employee, String>("Poste");
        TableColumn<Employee, String> service = new TableColumn<Employee, String>("Service");

        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        Prenom.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
        salaire.setCellValueFactory(new PropertyValueFactory<>("Salaire"));
        poste.setCellValueFactory(new PropertyValueFactory<>("Poste"));
        service.setCellValueFactory(new PropertyValueFactory<>("Service"));
        table.setItems(getUserList());
        table.getColumns().addAll(nom, Prenom, date, salaire, poste, service);

        StackPane root = new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(table);

        Scene scene = new Scene(root, 450, 300);
        stage.setScene(scene);
        stage.show();
    }

    private ObservableList<Employee> getUserList() {

        Agences agence1 = new Agences("Agence1", "agence1", "Agece11", "ville1", true);
        Employee user1 = new Employee("test1", "test1", "2000-01-02", "Test1", 1110, "Test1", agence1, 0, 0, 0);
        Employee user2 = new Employee("test1", "test1", "2000-01-02", "Test1", 1110, "Test1", agence1, 0, 0, 0);
        Employee user3 = new Employee("test1", "test1", "2000-01-02", "Test1", 1110, "Test1", agence1, 0, 0, 0);
        Employee user4 = new Employee("test1", "test1", "2000-01-02", "Test1", 1110, "Test1", agence1, 0, 0, 0);

        ObservableList<Employee> list = FXCollections.observableArrayList(user1, user2, user3, user4);
        return list;
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
