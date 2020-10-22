package com.moca.vet;

import java.sql.*;

public class AccesoBD {
    protected Connection conn = null;
    protected Statement st;

    public AccesoBD(String driver, String conexion) throws SQLException, Exception {
        Class.forName(driver);
        conn = DriverManager.getConnection(conexion);
        st = conn.createStatement();
    }

    public AccesoBD(String driver, String url, String user, String password)throws SQLException, Exception{
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
        st = conn.createStatement();
    }

    public void ejecutarSql (String query) throws SQLException, Exception{
        st.execute(query);
    }

    public ResultSet ejecutarQuery (String query) throws SQLException, Exception{
        ResultSet rs;
        rs = st.executeQuery(query);
        return rs;
    }
}
