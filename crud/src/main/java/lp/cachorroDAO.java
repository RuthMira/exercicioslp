package lp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
// import lp.DatabaseConnection;
// import lp.Cachorro;
// import lp.CrudCachorro;

public class cachorroDAO {
    private Connection connection;

    public cachorroDAO() throws SQLException {
        connection = DatabaseConnection.getConnection();
    }

    public void adicionarCachorro(Cachorro cachorro) throws SQLException {
        String sql = "INSERT INTO lp1.cachorros (raca, numero_patas, cor_pelo) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cachorro.getRaca());
            statement.setInt(2, cachorro.getNumeroPatas());
            statement.setString(3, cachorro.getCorDoPelo());
            statement.executeUpdate();
        }
    }

    public List<Cachorro> listarCachorros() throws SQLException {
        List<Cachorro> cachorros = new ArrayList<>();
        String sql = "SELECT * FROM lp1.cachorros";
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
        String sql = "UPDATE lp1.cachorros SET raca=?, numero_patas=?, cor_pelo=? WHERE id=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cachorro.getRaca());
            statement.setInt(2, cachorro.getNumeroPatas());
            statement.setString(3, cachorro.getCorDoPelo());
            statement.setInt(4, cachorro.getId());
            statement.executeUpdate();
        }
    }

    public void excluirCachorro(int id) throws SQLException {
        String sql = "DELETE FROM lp1.cachorros WHERE id=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}


