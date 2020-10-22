package com.moka.vet.bl.dao.medico;

import com.moca.vet.Conector;

import java.sql.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class MySqlMedicoDao implements IMedico {
    @Override
    public void create(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, LocalDate fechaNacimiento, String rol, String userName, String contrasenna, String universidad, LocalDate fechaGraduacion) throws SQLException, Exception {
        String query = "INSERT INTO MEDICO VALUES('"+nombre+"', '"+apellidoUno+"', '"+apellidoDos+"', '"+cedula+"', '"+telefono+"', '"+email+"', '"+direccion+"', '"+estado+"','"+fechaNacimiento+"', '"+rol+"', '"+userName+"', '"+contrasenna+"', '"+universidad+"', '"+fechaGraduacion+"')";
        Conector.getConnector().ejecutarSql(query);
    }

    @Override
    public ArrayList<String> read() throws IOException, Exception {
        ArrayList<String>info = new ArrayList<>();
        ResultSet rs;
        String query = "SELECT NOMBRE, AP1, AP2, CEDULA, TELEFONO, EMAIL,DIRECCION, ESTADO, FECNAC, ROL, USERNAME, CONTRASENNA, UNIVERSIDAD, FECGRADUACION FROM MEDICO";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Date fecha1 = new Date(rs.getDate("FECNAC").getTime());
            Date fecha2 = new Date(rs.getDate("FECGRADUACION").getTime());
            Medico m = new Medico(rs.getString("NOMBRE"), rs.getString("AP1"), rs.getString("AP2"), rs.getString("CEDULA"), rs.getString("TELEFONO"), rs.getString("EMAIL"), rs.getString("DIRECCION"), rs.getString("ESTADO"), rs.getString("ROL"), rs.getString("USERNAME"), rs.getString("CONTRASENNA"), rs.getString("UNIVERSIDAD"));
            m.setFechaNacimiento(fecha1.toLocalDate());
            m.setFechaGraduacion(fecha2.toLocalDate());
            info.add(m.toString());
        }
        return info;
    }

    @Override
    public ArrayList<Medico> readObject() throws IOException, Exception {
        ArrayList<Medico>info = new ArrayList<>();
        ResultSet rs;
        String query = "SELECT NOMBRE, AP1, AP2, CEDULA, TELEFONO, EMAIL,DIRECCION, ESTADO, FECNAC, ROL, USERNAME, CONTRASENNA, UNIVERSIDAD, FECGRADUACION FROM MEDICO";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Date fecha1 = new Date(rs.getDate("FECNAC").getTime());
            Date fecha2 = new Date(rs.getDate("FECGRADUACION").getTime());
            Medico m = new Medico(rs.getString("NOMBRE"), rs.getString("AP1"), rs.getString("AP2"), rs.getString("CEDULA"), rs.getString("TELEFONO"), rs.getString("EMAIL"), rs.getString("DIRECCION"), rs.getString("ESTADO"), rs.getString("ROL"), rs.getString("USERNAME"), rs.getString("CONTRASENNA"), rs.getString("UNIVERSIDAD"));
            m.setFechaNacimiento(fecha1.toLocalDate());
            m.setFechaGraduacion(fecha2.toLocalDate());
            info.add(m);
        }
        return info;
    }

    @Override
    public ArrayList<String> findByName(String nombre) throws SQLException, Exception {
        ArrayList<String>info = new ArrayList<>();
        ResultSet rs;
        String query = "SELECT NOMBRE, AP1, AP2, CEDULA, TELEFONO, EMAIL,DIRECCION, ESTADO, FECNAC, ROL, USERNAME, CONTRASENNA, UNIVERSIDAD, FECGRADUACION FROM MEDICO WHERE NOMBRE = '"+nombre+"'";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Date fecha1 = new Date(rs.getDate("FECNAC").getTime());
            Date fecha2 = new Date(rs.getDate("FECGRADUACION").getTime());
            Medico m = new Medico(rs.getString("NOMBRE"), rs.getString("AP1"), rs.getString("AP2"), rs.getString("CEDULA"), rs.getString("TELEFONO"), rs.getString("EMAIL"), rs.getString("DIRECCION"), rs.getString("ESTADO"), rs.getString("ROL"), rs.getString("USERNAME"), rs.getString("CONTRASENNA"), rs.getString("UNIVERSIDAD"));
            m.setFechaNacimiento(fecha1.toLocalDate());
            m.setFechaGraduacion(fecha2.toLocalDate());
            info.add(m.toString());
            info.add("Fin de la busqueda, si no aparecen mas lineas es porque no existe un medico con este nombre");
        }
        return info;
    }
}
