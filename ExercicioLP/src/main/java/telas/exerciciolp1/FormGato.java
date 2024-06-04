package telas.exerciciolp1;

import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
// import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FormGato extends Application {
    private ObservableList<Gato> gatos = FXCollections.observableArrayList();
    private TableView<Gato> tableView = new TableView<>();
    private TableColumnBase<Gato, Integer> corPelagemText;
    private TableColumnBase<Gato, Integer> padraoPelagemText;
    private TableColumnBase<Gato, Integer> nomeText;

    @SuppressWarnings("unchecked")
    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) {
        primaryStage.setTitle("Formulário de Gato");

        // Carregar imagem
        Image image = new Image(getClass().getResourceAsStream("gato.png"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(250);
        imageView.setFitWidth(250);
        imageView.setPreserveRatio(true);

         // VBox principal
         VBox mainVBox = new VBox();
         mainVBox.setSpacing(10);
         mainVBox.setPadding(new Insets(20));
         mainVBox.setAlignment(Pos.TOP_CENTER);
 
         // Adicionar imagem centralizada
         StackPane imagePane = new StackPane();
         imagePane.getChildren().add(imageView);
         imagePane.setAlignment(Pos.CENTER);
         mainVBox.getChildren().add(imagePane);

         // Configurar TableView
        TableColumn<Gato, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Gato, String> corPelagemColumn = new TableColumn<>("Cor");
        corPelagemColumn.setCellValueFactory(new PropertyValueFactory<>("cor"));

        TableColumn<Gato, String> padraoPelagemColumn = new TableColumn<>("Padrão da Pelagem");
        padraoPelagemColumn.setCellValueFactory(new PropertyValueFactory<>("padrao"));

        TableColumn<Gato, String> nomeColumn = new TableColumn<>("Nome");
        nomeColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));

        tableView.setItems(gatos);
        tableView.getColumns().addAll(idColumn, corPelagemColumn, padraoPelagemColumn, nomeColumn);
        tableView.setPrefHeight(200);

        // Listener para seleção na TableView
        tableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                corPelagemText.setText(newSelection.getCorPelagem());
                padraoPelagemText.setText(newSelection.getPadraoPelagem());
                nomeText.setText(newSelection.getNome());
            } else {
                ((List<Gato>) corPelagemText).clear();
                ((List<Gato>) padraoPelagemText).clear();
                ((List<Gato>) nomeText).clear();
            }
        });

        mainVBox.getChildren().add(tableView);

        Label corPelagemLabel = new Label("Cor da Pelagem:");
        TextField corPelagemText = new TextField();

        Label padraoPelagemLabel = new Label("Padrão da Pelagem:");
        TextField padraoPelagemText = new TextField();

        Label nomeLabel = new Label("Nome:");
        TextField nomeText = new TextField();

        VBox formVBox = new VBox();
        formVBox.setSpacing(10);
        formVBox.getChildren().addAll(corPelagemLabel, padraoPelagemLabel, nomeLabel, corPelagemText, padraoPelagemText, nomeText);

        mainVBox.getChildren().add(formVBox);

        // Botões de ação
        Button criarButton = new Button("Criar");
        criarButton.setStyle("-fx-background-color: #9582c4; -fx-text-fill: white;");

        Button atualizarButton = new Button("Atualizar");
        atualizarButton.setStyle("-fx-background-color: #9582c4; -fx-text-fill: white;");

        Button deletarButton = new Button("Deletar");
        deletarButton.setStyle("-fx-background-color: #9582c4; -fx-text-fill: white;");

        HBox buttonBox = new HBox();
        buttonBox.setSpacing(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(criarButton, atualizarButton, deletarButton);

        mainVBox.getChildren().add(buttonBox);

         // Eventos dos botões
         criarButton.setOnAction(event -> {
            String corPelagem = corPelagemText.getText();
            String padraoPelagem = padraoPelagemText.getText();
            String nome = nomeText.getText();

            if (corPelagem.isEmpty() || padraoPelagem.isEmpty() || nome.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Erro", "Todos os campos devem ser preenchidos");
                return;
            }

            try {
                Gato gato = new Gato();
                gato.setCorPelagem(corPelagem);
                gato.setPadraoPelagem(padraoPelagem);
                gato.setNome(nome);
                gato.add(gato);

                corPelagemText.clear();
                padraoPelagemText.clear();
                nomeText.clear();
                showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Gato criado com sucesso");
            } catch (NumberFormatException e) {
                showAlert(Alert.AlertType.ERROR, "Erro", "Número de patas deve ser um número inteiro");
            }
        });

        atualizarButton.setOnAction(event -> {
            Gato selectedGato = tableView.getSelectionModel().getSelectedItem();
            if (selectedGato != null) {
                String corPelagem = corPelagemText.getText();
                String padraoPelagem = padraoPelagemText.getText();
                String nome = nomeText.getText();

                if (corPelagem.isEmpty() || padraoPelagem.isEmpty() || nome.isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, "Erro", "Todos os campos devem ser preenchidos");
                    return;
                }

                try {
                    selectedGato.setCorPelagem(corPelagem);
                    selectedGato.setPadraoPelagem(padraoPelagem);
                    selectedGato.setNome(nome);
                    tableView.refresh();
                    showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Gato atualizado com sucesso");
                } catch (NumberFormatException e) {
                    showAlert(Alert.AlertType.ERROR, "Erro", "Número de patas deve ser um número inteiro");
                }
            } else {
                showAlert(Alert.AlertType.ERROR, "Erro", "Nenhum Gato selecionado para atualização");
            }
        });

        deletarButton.setOnAction(event -> {
            Gato selectedGato = tableView.getSelectionModel().getSelectedItem();
            if (selectedGato != null) {
                gatos.remove(selectedGato);
                showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Gato deletado com sucesso");
            } else {
                showAlert(Alert.AlertType.ERROR, "Erro", "Nenhum Gato selecionado para deleção");
            }
        });

        
        Scene scene = new Scene(new StackPane(mainVBox), 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}