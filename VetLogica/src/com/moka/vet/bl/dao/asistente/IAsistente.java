package com.moka.vet.bl.dao.asistente;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public interface IAsistente {
    public void create(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, LocalDate fechaNacimiento, String rol, String userName, String contrasenna, String estudia)throws SQLException, Exception;
    public ArrayList<String> read () throws SQLException, Exception;
    public ArrayList<Asistente> readObject () throws SQLException, Exception;
    public ArrayList<String> findByName (String nombre) throws SQLException, Exception;
}
