package sistemkoperasi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SistemKoperasi extends Application {

    @Override
    public void start(Stage primaryStage) {
        koneksi.getKoneksi();

        Button btn = new Button();
        btn.setText("Tes Koneksi Database");

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 400, 250);

        primaryStage.setTitle("Sistem Informasi Koperasi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}