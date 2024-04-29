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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FormGato extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) {
        primaryStage.setTitle("Formulário de Gato");

                // Carregando a imagem
                Image image = new Image(getClass().getResourceAsStream("gato.png"));
                ImageView imageView = new ImageView(image);

        // VBox para organizar os elementos
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

                // Adicionando a imagem ao VBox
                vbox.getChildren().add(imageView);

        // Label e TextField para a cor da pelagem do gato
        Label corPelagemLabel = new Label("Cor da Pelagem:");
        TextField corPelagemText = new TextField();

        // Label e TextField para o padrão da pelagem do gato
        Label padraoPelagemLabel = new Label("Padrão da Pelagem:");
        TextField padraoPelagemText = new TextField();

        // Label e TextField para o nome do gato
        Label nomeLabel = new Label("Nome:");
        TextField nomeText = new TextField();

        // Botão para submeter o formulário
        Button enviarButton = new Button("Criar Objeto");

        // Adicionando os elementos ao VBox
        vbox.getChildren().addAll(corPelagemLabel, corPelagemText, padraoPelagemLabel, padraoPelagemText, nomeLabel, nomeText, enviarButton);

        // StackPane para organizar os elementos
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(vbox);

        // Evento para o botão de submeter
        enviarButton.setOnAction(event -> {
            // Obtendo os valores dos campos de texto
            String corPelagem = corPelagemText.getText();
            String padraoPelagem = padraoPelagemText.getText();
            String nome = nomeText.getText();

            // Criando um objeto Gato com os valores fornecidos
            Gato gato = new Gato();
            gato.setCorPelagem(corPelagem);
            gato.setPadraoPelagem(padraoPelagem);
            gato.setNome(nome);

            // Exibindo os resultados em uma nova janela
            exibirResultado(gato);
        });

        Scene scene = new Scene(stackPane, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para exibir o resultado em uma nova janela
    private void exibirResultado(Gato gato) {
        Stage resultadoStage = new Stage();
        resultadoStage.setTitle("Resultado do Formulário");

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

        Label corPelagemLabel = new Label("Cor da Pelagem: " + gato.getCorPelagem());
        Label padraoPelagemLabel = new Label("Padrão da Pelagem: " + gato.getPadraoPelagem());
        Label nomeLabel = new Label("Nome: " + gato.getNome());

        vbox.getChildren().addAll(corPelagemLabel, padraoPelagemLabel, nomeLabel);

        Scene scene = new Scene(vbox, 800, 700);
        resultadoStage.setScene(scene);
        resultadoStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
