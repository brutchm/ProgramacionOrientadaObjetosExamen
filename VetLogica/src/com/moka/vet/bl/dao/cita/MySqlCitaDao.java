package com.moka.vet.bl.dao.cita;

import com.moca.vet.Conector;

import java.sql.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class MySqlCitaDao implements ICita {

    @Override
    public void create(String nombreMascota, LocalDate fechaInicio, String observaciones) throws SQLException, Exception {
        String query = "INSERT INTO CITA VALUES('"+nombreMascota+"', '"+fechaInicio+"', '"+observaciones+"')";
        Conector.getConnector().ejecutarSql(query);
    }

    @Override
    public ArrayList<String> read() throws SQLException, Exception {
        ArrayList<String> info = new ArrayList<>();
        ResultSet rs;
        String query = "SELECT NOMBRE, FECHA, OBSERVACIONES FROM CITA";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Date fec = new Date(rs.getDate("FECHA").getTime());
            Cita c = new Cita(rs.getString("NOMBRE"), rs.getString("OBSERVACIONES"));
            c.setFechaInicio(fec.toLocalDate());
            info.add(c.toString());
        }
        return info;
    }
}
