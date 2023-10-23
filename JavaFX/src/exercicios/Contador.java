package src.exercicios;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.Main;

public class Contador extends Application {
    private int contador = 0;

    @Override
    public void start(Stage stage) throws Exception {
        String pathCss = getClass().getResource("/exercicios/Contador.css").toExternalForm();
        VBox boxPrincipal = new VBox();
        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.setSpacing(10);

        Label labelTitulo = new Label("Counter");
        Label labelNumero = new Label("0");

        Button botao1 = new Button("-");
        botao1.setOnAction(E -> {
            contador --;
            labelNumero.setText(Integer.toString(contador));
        });
        Button botao2 = new Button("+");
        botao2.setOnAction(e -> {
            contador ++;
            labelNumero.setText(Integer.toString(contador));
        });
        HBox boxBotoes = new HBox();
        boxBotoes.setSpacing(10);
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.getChildren().add(botao1);
        boxBotoes.getChildren().add(botao2);

        boxPrincipal.getChildren().add(labelTitulo);
        boxPrincipal.getChildren().add(labelNumero);
        boxPrincipal.getChildren().add(boxBotoes);
//        boxPrincipal.getChildren().add(botao2);

        Scene MainCena = new Scene(boxPrincipal);
        stage.setScene(MainCena);
        stage.show();
        MainCena.getStylesheets().add(pathCss);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
