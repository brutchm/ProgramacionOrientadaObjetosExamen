package com.moka.vet.bl.dao.asistente;

import com.moca.vet.Conector;

import java.sql.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class MySqlAsistenteDao implements IAsistente {
    @Override
    public void create(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, LocalDate fechaNacimiento, String rol, String userName, String contrasenna, String estudia) throws SQLException, Exception {
        String query = "INSERT INTO ASISTENTE VALUES('"+nombre+"', '"+apellidoUno+"', '"+apellidoDos+"', '"+cedula+"', '"+telefono+"', '"+email+"', '"+direccion+"', '"+estado+"', '"+fechaNacimiento+"', '"+rol+"', '"+userName+"', '"+contrasenna+"', '"+estudia+"')";
        Conector.getConnector().ejecutarSql(query);
    }

    @Override
    public ArrayList<String> read() throws SQLException, Exception {
        ArrayList<String> asistentes = new ArrayList<>();
        ResultSet rs;
        String query = "SELECT NOMBRE, AP1, AP2, CEDULA, TELEFONO, EMAIL,DIRECCION, ESTADO, FECNAC, ROL, USERNAME, CONTRASENNA, ESTUDIA FROM ASISTENTE";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Date fec = new Date(rs.getDate("FECNAC").getTime());
            Asistente a = new Asistente(rs.getString("NOMBRE"), rs.getString("AP1"), rs.getString("AP2"), rs.getString("CEDULA"), rs.getString("TELEFONO"), rs.getString("EMAIL"), rs.getString("DIRECCION"), rs.getString("ESTADO"), rs.getString("ROL"), rs.getString("USERNAME"), rs.getString("CONTRASENNA"), rs.getString("ESTUDIA"));
            a.setFechaNacimiento(fec.toLocalDate());
            asistentes.add(a.toString());
        }
        return  asistentes;
    }

    @Override
    public ArrayList<Asistente> readObject() throws SQLException, Exception {
        ArrayList<Asistente> asistentes = new ArrayList<>();
        ResultSet rs;
        String query = "SELECT NOMBRE, AP1, AP2, CEDULA, TELEFONO, EMAIL,DIRECCION, ESTADO, FECNAC, ROL, USERNAME, CONTRASENNA, ESTUDIA FROM ASISTENTE";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Date fec = new Date(rs.getDate("FECNAC").getTime());
            Asistente a = new Asistente(rs.getString("NOMBRE"), rs.getString("AP1"), rs.getString("AP2"), rs.getString("CEDULA"), rs.getString("TELEFONO"), rs.getString("EMAIL"), rs.getString("DIRECCION"), rs.getString("ESTADO"), rs.getString("ROL"), rs.getString("USERNAME"), rs.getString("CONTRASENNA"), rs.getString("ESTUDIA"));
            a.setFechaNacimiento(fec.toLocalDate());
            asistentes.add(a);
        }
        return  asistentes;
    }

    @Override
    public ArrayList<String> findByName(String nombre) throws SQLException, Exception {
        ResultSet rs;
        ArrayList<String> info = new ArrayList<>();
        String query = "SELECT NOMBRE, AP1, AP2, CEDULA, TELEFONO, EMAIL,DIRECCION, ESTADO, FECNAC, ROL, USERNAME, CONTRASENNA, ESTUDIA FROM ASISTENTE WHERE NOMBRE = '"+nombre+"'";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Date fec = new Date(rs.getDate("FECNAC").getTime());
            Asistente a = new Asistente(rs.getString("NOMBRE"), rs.getString("AP1"), rs.getString("AP2"), rs.getString("CEDULA"), rs.getString("TELEFONO"), rs.getString("EMAIL"), rs.getString("DIRECCION"), rs.getString("ESTADO"), fec.toLocalDate(), rs.getString("ROL"), rs.getString("USERNAME"), rs.getString("CONTRASENNA"), rs.getString("ESTUDIA"));
            info.add(a.toString());
            info.add("Fin de la busqueda, si no aparecen mas lineas es porque no existe un medico con este nombre");
        }
        return info;
    }
}
