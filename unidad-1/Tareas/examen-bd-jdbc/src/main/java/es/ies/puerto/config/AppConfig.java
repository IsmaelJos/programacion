package es.ies.puerto.config;

import es.ies.puerto.exception.MarvelException;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

public class AppConfig {
    String urlBd;
    String dbName;
    public AppConfig() throws MarvelException {
        Properties properties = new Properties();

        try {
            URL pathUrl = AppConfig.class.getClassLoader().getResource("app.properties");
            FileInputStream fis = new FileInputStream(pathUrl.getPath());
            properties.load(fis);
            dbName = (String) properties.get("urlBd");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUrlBd() {
        if (urlBd == null) {
            URL resource = AppConfig.class.getClassLoader().getResource(dbName);
            urlBd = resource.getPath();
        }
        return urlBd;
    }
}
