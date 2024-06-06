package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CachorroDAO {
    private Connection connection;

    public CachorroDAO() throws SQLException {
        connection = DatabaseConnection.getConnection();
    }

    public void adicionarCachorro(Cachorro cachorro) throws SQLException {
        String sql = "INSERT INTO cachorros (raca, numero_patas, cor_pelo) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cachorro.getRaca());
            statement.setInt(2, cachorro.getNumeroPatas());
            statement.setString(3, cachorro.getCorDoPelo());
            statement.executeUpdate();
        }
    }

    public List<Cachorro> listarCachorros() throws SQLException {
        List<Cachorro> cachorros = new ArrayList<>();
        String sql = "SELECT * FROM cachorros";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Cachorro cachorro = new Cachorro();
                cachorro.setId(resultSet.getInt("id"));
                cachorro.setRaca(resultSet.getString("raca"));
                cachorro.setNumeroPatas(resultSet.getInt("numero_patas"));
                cachorro.setCorDoPelo(resultSet.getString("cor_pelo"));
                cachorros.add(cachorro);
            }
        }
        return cachorros;
    }

    public void atualizarCachorro(Cachorro cachorro) throws SQLException {
        String sql = "UPDATE cachorros SET raca=?, numero_patas=?, cor_pelo=? WHERE id=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cachorro.getRaca());
            statement.setInt(2, cachorro.getNumeroPatas());
            statement.setString(3, cachorro.getCorDoPelo());
            statement.setInt(4, cachorro.getId());
            statement.executeUpdate();
        }
    }

    public void excluirCachorro(int id) throws SQLException {
        String sql = "DELETE FROM cachorros WHERE id=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}

