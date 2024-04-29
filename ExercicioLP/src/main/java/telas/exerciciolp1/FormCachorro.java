package telas.exerciciolp1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FormCachorro extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) {
        primaryStage.setTitle("Formulário de Cachorro");

        // VBox para organizar os elementos
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

        // Label e TextField para a raça do cachorro
        Label racaLabel = new Label("Raça:");
        TextField racaText = new TextField();

        // Label e TextField para o número de patas do cachorro
        Label patasLabel = new Label("Número de patas:");
        TextField patasText = new TextField();

        // Label e TextField para a cor do pelo do cachorro
        Label corLabel = new Label("Cor do Pelo:");
        TextField corText = new TextField();

        // Botão para submeter o formulário
        Button enviarButton = new Button("Enviar");

        // Adicionando os elementos ao VBox
        vbox.getChildren().addAll(racaLabel, racaText, patasLabel, patasText, corLabel, corText, enviarButton);

        // StackPane para organizar os elementos
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(vbox);

        // Evento para o botão de submeter
        enviarButton.setOnAction(event -> {
            // Obtendo os valores dos campos de texto
            String raca = racaText.getText();
            int patas = Integer.parseInt(patasText.getText());
            String cor = corText.getText();

            // Criando um objeto Cachorro com os valores fornecidos
            Cachorro cachorro = new Cachorro();
            cachorro.setRaca(raca);
            cachorro.setNumeroPatas(patas);
            cachorro.setCorDoPelo(cor);

            // Exibindo os resultados em uma nova janela
            exibirResultado(cachorro);
        });

        Scene scene = new Scene(stackPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para exibir o resultado em uma nova janela
    private void exibirResultado(Cachorro cachorro) {
        Stage resultadoStage = new Stage();
        resultadoStage.setTitle("Resultado do Formulário");

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

        Label racaLabel = new Label("Raça: " + cachorro.getRaca());
        Label patasLabel = new Label("Número de patas: " + cachorro.getNumeroPatas());
        Label corLabel = new Label("Cor do Pelo: " + cachorro.getCorDoPelo());

        vbox.getChildren().addAll(racaLabel, patasLabel, corLabel);

        Scene scene = new Scene(vbox, 300, 200);
        resultadoStage.setScene(scene);
        resultadoStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
