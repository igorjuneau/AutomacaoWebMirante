package br.com.mirante.toolbox;

public class GlobalTools {

    public static String getExecutionNavegador() {
        String navegador = System.getProperty("navegador");
        if (navegador != null && !navegador.isEmpty()) {
            return navegador.toLowerCase();
        }
        return "chrome";
    }

    public static String getExecutionAmbiente() {
        String ambiente = System.getProperty("ambiente");
        if (ambiente == null || ambiente.isEmpty()) {
            ambiente = "hml";
        }
        return ambiente.toLowerCase();
    }

    public static String getExecutionUrl() {
        String ambiente = getExecutionAmbiente();

        if (ambiente.contains("hml")) {
            return "https://blogdoagi.com.br/";
        }
        return "https://blogdoagi.com.br/";
    }

    public static String getExecutionUrlHml() {
        return "https://blogdoagi.com.br/";
    }
}
