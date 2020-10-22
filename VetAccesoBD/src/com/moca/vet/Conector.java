package com.moca.vet;

import java.sql.SQLException;

public class Conector {
    private static AccesoBD connectorBD = null;
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    public static AccesoBD getConnector ()throws SQLException, Exception{
        if (connectorBD == null){
            connectorBD = new AccesoBD(driver, url, user, password);
        }
        return connectorBD;
    }

    public static String getDriver() {
        return driver;
    }

    public static void setDriver(String driver) {
        Conector.driver = driver;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        Conector.url = url;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        Conector.user = user;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Conector.password = password;
    }
}
