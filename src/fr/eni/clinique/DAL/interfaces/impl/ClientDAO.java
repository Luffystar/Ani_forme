package fr.eni.clinique.DAL.interfaces.impl;

import fr.eni.clinique.BO.Client;
import fr.eni.clinique.BO.Utilisateur;
import fr.eni.clinique.DAL.exceptions.DALException;
import fr.eni.clinique.DAL.interfaces.IClientDAO;
import fr.eni.clinique.DAL.interfaces.IPersonnelDAO;
import fr.eni.clinique.DAL.utils.JdbcTools;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author CHARTIER Corentin
 */
public class ClientDAO implements IClientDAO {

    // Attributs
    private final JdbcTools jdbcTools;

    // Constructor
    public ClientDAO() {
        jdbcTools = JdbcTools.getInstance();
    }

    @Override
    public int create(Client client) throws DALException {
        int result = -1;

        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO Clients ")
                .append("(NomClient, PrenomClient, Adresse1, Adresse2, CodePostal, Ville, NumTel, Assurance, Email, Remarque, Archive) ")
                .append("values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

        try (PreparedStatement statement = jdbcTools.getConnection().prepareStatement(sb.toString(), Statement.RETURN_GENERATED_KEYS);) {

            statement.setString(1, client.getNomClient());
            statement.setString(2, client.getPrenomClient());
            statement.setString(3, client.getAdresse1());
            statement.setString(4, client.getAdresse2());
            statement.setString(5, client.getCodePostal());
            statement.setString(6, client.getVille());
            statement.setString(7, client.getNumTel());
            statement.setString(8, client.getAssurance());
            statement.setString(9, client.getEmail());
            statement.setString(10, client.getRemarque());
            statement.setBoolean(11, client.getArchive());

            if (statement.executeUpdate() == 1) {
                ResultSet rs = statement.getGeneratedKeys();
                if (rs.next()) {
                    client.setCodeClient(rs.getInt(1));
                    result = rs.getInt(1);
                }
            }

        } catch (SQLException ex) {
            throw new DALException(ex.getMessage());

        } finally {

            try {
                jdbcTools.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return result;
    }

    @Override
    public Client read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Client data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Client data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
