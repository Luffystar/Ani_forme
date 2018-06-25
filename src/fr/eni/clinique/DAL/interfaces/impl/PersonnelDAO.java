package fr.eni.clinique.DAL.interfaces.impl;

import fr.eni.clinique.BO.Utilisateur;
import fr.eni.clinique.DAL.exceptions.DALException;
import fr.eni.clinique.DAL.interfaces.IPersonnelDAO;
import fr.eni.clinique.DAL.utils.JdbcTools;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonnelDAO implements IPersonnelDAO {

    // Attributs
    private final JdbcTools jdbcTools;

    // Constructor
    public PersonnelDAO() {
        jdbcTools = JdbcTools.getInstance();
    }

    @Override
    public int create(Utilisateur utilisateur) throws DALException {
        int result = -1;

        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO Personnels ")
                .append("(Nom, MotPasse, Role, Archive) ")
                .append("values (?, ?, ?, ?);");

        try (PreparedStatement statement = jdbcTools.getConnection().prepareStatement(sb.toString(), Statement.RETURN_GENERATED_KEYS);) {

            statement.setString(1, utilisateur.getNom());
            statement.setString(2, utilisateur.getMotPasse());
            statement.setString(3, utilisateur.getRole());
            statement.setBoolean(4, utilisateur.getArchive());

            if (statement.executeUpdate() == 1) {
                ResultSet rs = statement.getGeneratedKeys();
                if (rs.next()) {
                    utilisateur.setCodePers(rs.getInt(1));
                    result = rs.getInt(1);
                }
            }

        } catch (SQLException ex) {
            throw new DALException(ex.getMessage());

        } finally {

            try {
                jdbcTools.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PersonnelDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return result;
    }

    @Override
    public Utilisateur read(int id) throws DALException {

        Utilisateur result = null;

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM Personnels WHERE ")
                .append("CodePers = ?");

        try (PreparedStatement statement = jdbcTools.getConnection().prepareStatement(sb.toString());) {

            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                result = new Utilisateur(
                        rs.getInt("CodePers"),
                        rs.getString("Nom"),
                        rs.getString("MotPasse"),
                        rs.getString("Role"),
                        rs.getBoolean("Archive")
                );
            }

        } catch (SQLException ex) {
            throw new DALException(ex.getMessage());

        } finally {

            try {
                jdbcTools.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PersonnelDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return result;
    }

    @Override
    public int update(Utilisateur utilisateur) throws DALException {
        try (Statement statement = jdbcTools.getConnection().createStatement();) {

            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE Personnels SET ");
            String virgule = " ";

            if (utilisateur.getNom() != null) {
                sb.append(virgule)
                        .append("Nom = '")
                        .append(utilisateur.getNom())
                        .append("' ");
                virgule = ", ";
            }
            if (utilisateur.getMotPasse()!= null) {
                sb.append(virgule)
                        .append("MotPasse = '")
                        .append(utilisateur.getMotPasse())
                        .append("' ");
                virgule = ", ";
            }
            if (utilisateur.getRole() != null) {
                sb.append(virgule)
                        .append("Role = '")
                        .append(utilisateur.getRole())
                        .append("' ");
                virgule = ", ";
            }
            if (utilisateur.getArchive() != null) {
                sb.append(virgule)
                        .append("Archive = '")
                        .append(utilisateur.getArchive())
                        .append("' ");
            }

            sb.append("WHERE CodePers = ").append(utilisateur.getCodePers());

            System.out.println(sb.toString());
            
            statement.executeUpdate(sb.toString());

        } catch (SQLException ex) {
            throw new DALException(ex.getMessage());

        } finally {

            try {
                jdbcTools.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PersonnelDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return 0;
    }

    @Override
    public int delete(Utilisateur utilisateur) throws DALException {
        int result = -1;

        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM Personnels WHERE ")
                .append("CodePers = ?");

        try (PreparedStatement statement = jdbcTools.getConnection().prepareStatement(sb.toString());) {

            statement.setInt(1, utilisateur.getCodePers());

            result = statement.executeUpdate();

        } catch (SQLException ex) {
            throw new DALException(ex.getMessage());

        } finally {

            try {
                jdbcTools.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PersonnelDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return result;
    }
}
