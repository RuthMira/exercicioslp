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

public class FormFlor extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) {
        primaryStage.setTitle("Formulário de Flor");

        // VBox para organizar os elementos
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

        // Label e TextField para o tipo de flor
        Label tipoLabel = new Label("Tipo de Flor:");
        TextField tipoText = new TextField();

        // Label e TextField para a cor da flor
        Label corLabel = new Label("Cor da Flor:");
        TextField corText = new TextField();

        // Label e TextField para a localização da flor
        Label localizacaoLabel = new Label("Localização:");
        TextField localizacaoText = new TextField();

        // Botão para submeter o formulário
        Button enviarButton = new Button("Enviar");

        // Adicionando os elementos ao VBox
        vbox.getChildren().addAll(tipoLabel, tipoText, corLabel, corText, localizacaoLabel, localizacaoText, enviarButton);

        // StackPane para organizar os elementos
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(vbox);

        // Evento para o botão de submeter
        enviarButton.setOnAction(event -> {
            // Obtendo os valores dos campos de texto
            String tipo = tipoText.getText();
            String cor = corText.getText();
            String localizacao = localizacaoText.getText();

            // Criando um objeto Flor com os valores fornecidos
            Flor flor = new Flor();
            flor.setTipo(tipo);
            flor.setCor(cor);
            flor.setLocalizacao(localizacao);

            // Exibindo os resultados em uma nova janela
            exibirResultado(flor);
        });

        Scene scene = new Scene(stackPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para exibir o resultado em uma nova janela
    private void exibirResultado(Flor flor) {
        Stage resultadoStage = new Stage();
        resultadoStage.setTitle("Resultado do Formulário");

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

        Label tipoLabel = new Label("Tipo de Flor: " + flor.getTipo());
        Label corLabel = new Label("Cor da Flor: " + flor.getCor());
        Label localizacaoLabel = new Label("Localização: " + flor.getLocalizacao());

        vbox.getChildren().addAll(tipoLabel, corLabel, localizacaoLabel);

        Scene scene = new Scene(vbox, 300, 200);
        resultadoStage.setScene(scene);
        resultadoStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
