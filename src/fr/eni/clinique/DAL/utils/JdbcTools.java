package fr.eni.clinique.DAL.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cchartier2017
 */
public class JdbcTools {

    //Attributs
    private static JdbcTools instance;

    private String url;
    private String user;
    private String password;
    private String driver;
    private Connection connection;

    //Constructor
    private JdbcTools() {
        this.url = Settings.getProperties("url");
        this.user = Settings.getProperties("user");
        this.password = Settings.getProperties("password");
        this.driver = Settings.getProperties("driver");

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcTools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Methode
    public static JdbcTools getInstance() {
        if (instance == null) {
            instance = new JdbcTools();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

}
