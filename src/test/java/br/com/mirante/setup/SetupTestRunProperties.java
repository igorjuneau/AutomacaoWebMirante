package br.com.mirante.setup;

import java.util.Properties;

public class SetupTestRunProperties {

    public static SetupTestRunProperties setupTestRunProps() {
        return new SetupTestRunProperties();
    }

    private static Properties loadProperties() {
        Properties prop = new Properties();
        try {
            prop.load(SetupTestRunProperties.class.getClassLoader().getResourceAsStream("setuptestrun.properties"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return prop;
    }

    public static String getEnvironmentServer() {
        return loadProperties().getProperty("environmentServer");
    }

    public static String getConfigPlataforma() {
        return loadProperties().getProperty("plataforma");
    }

    public static String getConfigAmbiente() {
        return loadProperties().getProperty("ambiente");
    }

    public static String getConfigChangeAmbiente() {
        return loadProperties().getProperty("changeAmbiente");
    }

    public static String getConfigCapabilities() {
        return loadProperties().getProperty("capabilities");
    }


}
