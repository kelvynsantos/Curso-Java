package src;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class fx_1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox box  = new VBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        Button botaoA = new Button("A");
        Button botaoB = new Button("B");
        botaoA.setOnAction(e -> System.out.println("AA"));
        botaoB.setOnAction(e -> System.exit(0));
        box.getChildren().add(botaoA);
        box.getChildren().add(botaoB);

        Scene cena = new Scene(box,100,150);
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
