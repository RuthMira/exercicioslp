package telas.exerciciolp1;

import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FormCachorro extends Application {
    private ObservableList<Cachorro> cachorros = FXCollections.observableArrayList();
    private TableView<Cachorro> tableView = new TableView<>();
    private TableColumnBase<Cachorro, Integer> racaText;
    private TableColumnBase<Cachorro, Integer> patasText;
    private TableColumnBase<Cachorro, Integer> corText;

    @SuppressWarnings("unchecked")
    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) {
        primaryStage.setTitle("Formulário de Cachorro");

        // Carregar imagem
        Image image = new Image(getClass().getResourceAsStream("cachorro.png"));
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
        TableColumn<Cachorro, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Cachorro, String> racaColumn = new TableColumn<>("Raça");
        racaColumn.setCellValueFactory(new PropertyValueFactory<>("raca"));

        TableColumn<Cachorro, Integer> patasColumn = new TableColumn<>("Patas");
        patasColumn.setCellValueFactory(new PropertyValueFactory<>("numeroPatas"));

        TableColumn<Cachorro, String> corColumn = new TableColumn<>("Cor");
        corColumn.setCellValueFactory(new PropertyValueFactory<>("corDoPelo"));

        tableView.setItems(cachorros);
        tableView.getColumns().addAll(idColumn, racaColumn, patasColumn, corColumn);
        tableView.setPrefHeight(200);

        // Listener para seleção na TableView
        tableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                racaText.setText(newSelection.getRaca());
                patasText.setText(String.valueOf(newSelection.getNumeroPatas()));
                corText.setText(newSelection.getCorDoPelo());
            } else {
                ((List<Cachorro>) racaText).clear();
                ((List<Cachorro>) patasText).clear();
                ((List<Cachorro>) corText).clear();
            }
        });

        mainVBox.getChildren().add(tableView);

        // Campos de entrada
        Label racaLabel = new Label("Raça:");
        TextField racaText = new TextField();

        Label patasLabel = new Label("Número de patas:");
        TextField patasText = new TextField();

        Label corLabel = new Label("Cor do Pelo:");
        TextField corText = new TextField();

        VBox formVBox = new VBox();
        formVBox.setSpacing(10);
        formVBox.getChildren().addAll(racaLabel, racaText, patasLabel, patasText, corLabel, corText);

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
            String raca = racaText.getText();
            String patas = patasText.getText();
            String cor = corText.getText();

            if (raca.isEmpty() || patas.isEmpty() || cor.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Erro", "Todos os campos devem ser preenchidos");
                return;
            }

            try {
                int numeroPatas = Integer.parseInt(patas);
                Cachorro cachorro = new Cachorro();
                cachorro.setRaca(raca);
                cachorro.setNumeroPatas(numeroPatas);
                cachorro.setCorDoPelo(cor);
                cachorros.add(cachorro);

                racaText.clear();
                patasText.clear();
                corText.clear();
                showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Cachorro criado com sucesso");
            } catch (NumberFormatException e) {
                showAlert(Alert.AlertType.ERROR, "Erro", "Número de patas deve ser um número inteiro");
            }
        });
    
        atualizarButton.setOnAction(event -> {
            Cachorro selectedCachorro = tableView.getSelectionModel().getSelectedItem();
            if (selectedCachorro != null) {
                String raca = racaText.getText();
                String patas = patasText.getText();
                String cor = corText.getText();

                if (raca.isEmpty() || patas.isEmpty() || cor.isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, "Erro", "Todos os campos devem ser preenchidos");
                    return;
                }

                try {
                    int numeroPatas = Integer.parseInt(patas);
                    selectedCachorro.setRaca(raca);
                    selectedCachorro.setNumeroPatas(numeroPatas);
                    selectedCachorro.setCorDoPelo(cor);
                    tableView.refresh();
                    showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Cachorro atualizado com sucesso");
                } catch (NumberFormatException e) {
                    showAlert(Alert.AlertType.ERROR, "Erro", "Número de patas deve ser um número inteiro");
                }
            } else {
                showAlert(Alert.AlertType.ERROR, "Erro", "Nenhum cachorro selecionado para atualização");
            }
        });

        deletarButton.setOnAction(event -> {
            Cachorro selectedCachorro = tableView.getSelectionModel().getSelectedItem();
            if (selectedCachorro != null) {
                cachorros.remove(selectedCachorro);
                showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Cachorro deletado com sucesso");
            } else {
                showAlert(Alert.AlertType.ERROR, "Erro", "Nenhum cachorro selecionado para deleção");
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
