package br.com.igorVieira.toolbox;

import java.util.Properties;

public class SetupTestRunProperties {

    private static Properties loadProperties() {
        Properties prop = new Properties();
        try {
            prop.load(SetupTestRunProperties.class.getClassLoader().getResourceAsStream("setuptestrun.properties"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return prop;
    }

    public static String getConfigUrlPrd() {
        return loadProperties().getProperty("URL_PRD");
    }

    public static String getConfigAmbiente() {
        return loadProperties().getProperty("AMBIENTE");
    }

    public static String getConfigUrlHml() {
        return loadProperties().getProperty("URL_HML");
    }

    public static String getConfigNavegador() {
        return loadProperties().getProperty("NAVEGADOR");
    }
}
