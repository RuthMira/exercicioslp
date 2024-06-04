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

public class FormFlor extends Application {
    private ObservableList<Flor> flores = FXCollections.observableArrayList();
    private TableView<Flor> tableView = new TableView<>();
    private TableColumnBase<Flor, Integer> tipoText;
    private TableColumnBase<Flor, Integer> corText;
    private TableColumnBase<Flor, Integer> localizacaoText;

    @SuppressWarnings("unchecked")
    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) {
        primaryStage.setTitle("Formulário de Flor");

        // Carregar imagem
        Image image = new Image(getClass().getResourceAsStream("flor.png"));
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

        TableColumn<Flor, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Flor, String> tipoColumn = new TableColumn<>("Tipo");
        tipoColumn.setCellValueFactory(new PropertyValueFactory<>("tipo"));

        TableColumn<Flor, String> corColumn = new TableColumn<>("Cor");
        corColumn.setCellValueFactory(new PropertyValueFactory<>("cor"));

        TableColumn<Flor, String> localizacaoColumn = new TableColumn<>("Localização");
        localizacaoColumn.setCellValueFactory(new PropertyValueFactory<>("localização"));

        tableView.setItems(flores);
        tableView.getColumns().addAll(idColumn, tipoColumn,localizacaoColumn, corColumn);
        tableView.setPrefHeight(200);

        // Listar para seleção na tableView
        tableView.getSelectionModel().selectedItemProperty().addListener((obs,oldselection, newSelecition) -> {
            if (newSelecition != null) {
                tipoText.setText(newSelecition.getTipo());
                corText.setText(newSelecition.getCor());
                localizacaoText.setText(newSelecition.getLocalizacao());
            } else {
                ((List<Flor>)tipoText).clear();
                ((List<Flor>)corText).clear();
                ((List<Flor>)localizacaoText).clear();
            }
        });

        mainVBox.getChildren().add(tableView);

        //Campos de Entrada
        Label tipoLabel = new Label("Tipo de Flor:");
        TextField tipoText = new TextField();

        // Label e TextField para a cor da flor
        Label corLabel = new Label("Cor da Flor:");
        TextField corText = new TextField();

        // Label e TextField para a localização da flor
        Label localizacaoLabel = new Label("Localização:");
        TextField localizacaoText = new TextField();

        VBox formVBox = new VBox();
        formVBox.setSpacing(10);
        formVBox.getChildren().addAll(tipoLabel, tipoText, localizacaoLabel, localizacaoText, corLabel, corText);

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
            String tipo = tipoText.getText();
            String cor = corText.getText();
            String localizacao = localizacaoText.getText();

            if (tipo.isEmpty() || cor.isEmpty() || localizacao.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Erro", "Todos os campos devem ser preenchidos");
                return;
            }

            try {
                Flor flor = new Flor();
                flor.setTipo(tipo);
                flor.setCor(cor);
                flor.setLocalizacao(localizacao);
                flores.add(flor);

                tipoText.clear();
                corText.clear();
                localizacaoText.clear();
                showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Flor criado com sucesso");
            } catch (NumberFormatException e) {
                showAlert(Alert.AlertType.ERROR, "Erro", "Número de patas deve ser um número inteiro");
            }
        });

        atualizarButton.setOnAction(event -> {
            Flor selectedCachorro = tableView.getSelectionModel().getSelectedItem();
            if (selectedCachorro != null) {
                String raca = tipoText.getText();
                String patas = localizacaoText.getText();
                String cor = corText.getText();

                if (raca.isEmpty() || patas.isEmpty() || cor.isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, "Erro", "Todos os campos devem ser preenchidos");
                    return;
                }

                try {
                    selectedCachorro.setTipo(cor);
                    selectedCachorro.setLocalizacao(raca);
                    selectedCachorro.setCor(cor);
                    tableView.refresh();
                    showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Flor atualizado com sucesso");
                } catch (NumberFormatException e) {
                    showAlert(Alert.AlertType.ERROR, "Erro", "Número de patas deve ser um número inteiro");
                }
            } else {
                showAlert(Alert.AlertType.ERROR, "Erro", "Nenhuma Flor selecionado para atualização");
            }
        });

        deletarButton.setOnAction(event -> {
            Flor selectedFlor = tableView.getSelectionModel().getSelectedItem();
            if (selectedFlor != null) {
                flores.remove(selectedFlor);
                showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Flor deletada com sucesso");
            } else {
                showAlert(Alert.AlertType.ERROR, "Erro", "Nenhuma Flor selecionada para deleção");
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


