package fr.eni.clinique.DAL.interfaces.impl;

import fr.eni.clinique.BO.Utilisateur;
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
    public int create(Utilisateur data) {
        int result = -1;

        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO Articles ")
                .append("(reference, marque, designation, prixUnitaire, qteStock, grammage, couleur, type) ")
                .append("values (?, ?, ?, ?, ?, ?, ?, ?);");

        try (PreparedStatement statement = jdbcTools.getConnection().prepareStatement(sb.toString(), Statement.RETURN_GENERATED_KEYS);) {

           /* statement.setString(1, article.getReference());
            statement.setString(2, article.getMarque());
            statement.setString(3, article.getDesignation());
            statement.setFloat(4, article.getPrixUnitaire());
            statement.setInt(5, article.getQteStock());

            if (article instanceof Stylo) {
                Stylo stylo = (Stylo) article;
                statement.setNull(6, java.sql.Types.INTEGER);
                statement.setString(7, stylo.getCouleur());
                statement.setString(8, TypesArticles.STYLO);

            } else if (article instanceof Ramette) {
                Ramette ramette = (Ramette) article;

                statement.setInt(6, ramette.getGrammage());
                statement.setNull(7, java.sql.Types.NVARCHAR);
                statement.setString(8, TypesArticles.RAMETTE);
            }

            if (statement.executeUpdate() == 1) {
                ResultSet rs = statement.getGeneratedKeys();
                if (rs.next()) {
                    article.setIdArticle(rs.getInt(1));
                    result = rs.getInt(1);
                }
            }*/
        } catch (SQLException ex) {
            //throw new DALException(ex.getMessage());

        } finally {

            /*try {
                jdbcTools.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }

        return result;
    }

    @Override
    public Utilisateur read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Utilisateur data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Utilisateur data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
