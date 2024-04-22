module formulario {
    requires javafx.controls;
    requires javafx.fxml;

    opens formulario to javafx.fxml;
    exports formulario;
}
