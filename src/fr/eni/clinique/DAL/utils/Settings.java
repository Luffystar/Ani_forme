package fr.eni.clinique.DAL.utils;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Settings {

    // Constante
    private static final String FILE_NAME = "settings.properties";

    // Attributs
    private static Properties properties;

    static {
        properties = new Properties();

        try {
            properties.load(Settings.class.getResourceAsStream(FILE_NAME));

        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Methode
    public static String getProperties(String key) {
        return properties.getProperty(key, null);
    }
}
