package com.moka.vet.bl.dao.hotel;

import com.moca.vet.Conector;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class MySqlHotelDao implements IHotel{
    @Override
    public void create(String nombreMascota, LocalDate fechaInicio, LocalDate fechaSalida) throws SQLException, Exception {
        String query = "INSERT INTO HOTEL VALUES('"+nombreMascota+"', '"+fechaInicio+"', '"+fechaSalida+"')";
        Conector.getConnector().ejecutarSql(query);
    }

    @Override
    public ArrayList<String> read() throws SQLException, Exception {
        ArrayList<String> info = new ArrayList<>();
        ResultSet rs;
        String query = "SELECT NOMBRE, FECHAINICIO, FECHASALIDA FROM HOTEL";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Date fechaUno = new Date(rs.getDate("FECHAINICIO").getTime());
            Date fechaDos = new Date(rs.getDate("FECHASALIDA").getTime());
            Hotel h = new Hotel(rs.getString("NOMBRE"));
            h.setFechaInicio(fechaUno.toLocalDate());
            h.setFechaSalida(fechaDos.toLocalDate());
            info.add(h.toString());
        }
        return info;
    }

    @Override
    public ArrayList<Hotel> readObject() throws SQLException, Exception {
        ArrayList<Hotel> info = new ArrayList<>();
        ResultSet rs;
        String query = "SELECT NOMBRE, FECHAINICIO, FECHASALIDA FROM HOTEL";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Date fechaUno = new Date(rs.getDate("FECHAINICIO").getTime());
            Date fechaDos = new Date(rs.getDate("FECHASALIDA").getTime());
            Hotel h = new Hotel(rs.getString("NOMBRE"));
            h.setFechaInicio(fechaUno.toLocalDate());
            h.setFechaSalida(fechaDos.toLocalDate());
            info.add(h);
        }
        return info;
    }
}
