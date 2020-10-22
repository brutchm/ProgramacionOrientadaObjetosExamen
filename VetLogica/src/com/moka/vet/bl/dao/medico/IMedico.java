package com.moka.vet.bl.dao.medico;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public interface IMedico {
    public void create(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, LocalDate fechaNacimiento, String rol, String userName, String contrasenna, String universidad, LocalDate fechaGraduacion) throws SQLException, Exception;
    public ArrayList<String> read() throws IOException, Exception;
    public ArrayList<Medico> readObject() throws IOException, Exception;
    public ArrayList<String> findByName (String nombre) throws SQLException, Exception;
}
