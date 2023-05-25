package job03;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Fenêtre graphique");

        // Création des composants
        Label labelNom = new Label("Nom :");
        TextField champNom = new TextField();
        Button boutonEnvoyer = new Button("Envoyer");

        // Ajout des composants à la disposition FlowPane
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.setHgap(10);
        flowPane.getChildren().addAll(labelNom, champNom, boutonEnvoyer);

        // Ajout d'un écouteur d'événements au bouton "Envoyer"
        boutonEnvoyer.setOnAction(e -> {
            String nom = champNom.getText();
            System.out.println("Nom saisi : " + nom);
            
        });

        // Création de la scène et affichage de la fenêtre
        Scene scene = new Scene(flowPane, 300, 100);
        stage.setScene(scene);
        stage.show();
    }
}
