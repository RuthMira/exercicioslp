package lp;

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
import java.sql.SQLException;

public class CrudCachorro extends Application {
    private ObservableList<Cachorro> cachorros = FXCollections.observableArrayList();
    private TableView<Cachorro> tableView = new TableView<>();
    private TextField racaText;
    private TextField patasText;
    private TextField corText;
    private cachorroDAO cachorroDAO;

    @SuppressWarnings("unchecked")
    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) {
        primaryStage.setTitle("Formulário de Cachorro");

        // Carregar imagem
        Image image = new Image(getClass().getResourceAsStream("img/cachorro.png"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(250);
        imageView.setFitWidth(250);
        imageView.setPreserveRatio(true);

        // VBox principal
        VBox mainVBox = new VBox();
        mainVBox.setSpacing(10);
        mainVBox.setPadding(new Insets(20));
        mainVBox.setAlignment(Pos.TOP_CENTER);

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

        mainVBox.getChildren().add(tableView);

        // Campos de entrada
        racaText = new TextField();
        racaText.setPromptText("Raça");

        patasText = new TextField();
        patasText.setPromptText("Número de patas");

        corText = new TextField();
        corText.setPromptText("Cor do Pelo");

        VBox formVBox = new VBox();
        formVBox.setSpacing(10);
        formVBox.getChildren().addAll(racaText, patasText, corText);

        mainVBox.getChildren().add(formVBox);

        try {
            cachorroDAO = new cachorroDAO();
            atualizarTableView();
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Erro", "Erro ao conectar ao banco de dados");
        }

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
        criarButton.setOnAction(event -> criarCachorro());
        atualizarButton.setOnAction(event -> atualizarCachorro());
        deletarButton.setOnAction(event -> deletarCachorro());

        Scene scene = new Scene(new StackPane(mainVBox), 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void atualizarTableView() {
        try {
            cachorros.clear();
            cachorros.addAll(cachorroDAO.listarCachorros());
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Erro", "Erro ao atualizar a tabela");
        }
    }

    private void criarCachorro() {
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
            cachorroDAO.adicionarCachorro(cachorro);
            atualizarTableView();
            showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Cachorro criado com sucesso");
        } catch (NumberFormatException | SQLException e) {
            showAlert(Alert.AlertType.ERROR, "Erro", "Número de patas deve ser um número inteiro");
        }
    }

    private void atualizarCachorro() {
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
                cachorroDAO.atualizarCachorro(selectedCachorro);
                atualizarTableView();
                showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Cachorro atualizado com sucesso");
            } catch (NumberFormatException | SQLException e) {
                showAlert(Alert.AlertType.ERROR, "Erro", "Número de patas deve ser um número inteiro");
            }
        } else {
            showAlert(Alert.AlertType.ERROR, "Erro", "Nenhum cachorro selecionado para atualização");
        }
    }

    private void deletarCachorro() {
        Cachorro selectedCachorro = tableView.getSelectionModel().getSelectedItem();
        if (selectedCachorro != null) {
            try {
                cachorroDAO.excluirCachorro(selectedCachorro.getId());
                tableView.getItems().remove(selectedCachorro);
                showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Cachorro deletado com sucesso");
            } catch (SQLException e) {
                e.printStackTrace();
                showAlert(Alert.AlertType.ERROR, "Erro", "Erro ao deletar cachorro");
            }
        } else {
            showAlert(Alert.AlertType.ERROR, "Erro", "Nenhum cachorro selecionado para exclusão");
        }
    }

    private void showAlert(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
