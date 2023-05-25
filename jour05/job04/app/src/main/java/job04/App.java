package job04;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Création des composants
        Label label = new Label("Nom :");
        TextField champNom = new TextField();
        Button button = new Button("Envoyer");
        FlowPane root = new FlowPane();

        // Ajout des classes CSS aux composants correspondants
        label.getStyleClass().add("label");
        champNom.getStyleClass().add("text-field");
        button.getStyleClass().add("button");

        // Ajout des composants à la racine de la scène
        root.getChildren().addAll(label, champNom, button);

        button.setOnAction(e -> {
            String nom = champNom.getText();
            System.out.println("Nom saisi : " + nom);
            champNom.setText("");
            
        });

        // Création de la scène
        Scene scene = new Scene(root, 300, 100);

        // Chargement de la feuille de style CSS
        scene.getStylesheets().add("style.css");

        // Affichage de la scène
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
