module lp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;

    opens lp to javafx.fxml;
    exports lp;
}
