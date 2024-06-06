package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Configurações para conexão ao MySQL localmente
    private static final String URL = "jdbc:mysql://localhost:3306/LP1?useSSL=false&serverTimezone=UTC";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
