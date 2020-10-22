package com.moka.vet.bl.dao.mascota;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IMascota {
    public void create(String nombreDuenno, String nombreMascota, String tipo, String raza, int edad, String genero)throws SQLException, Exception;
    public ArrayList<String> read () throws SQLException, Exception;
    public ArrayList<String> findByName (String nombre) throws SQLException, Exception;
    public ArrayList<Mascota> readObject() throws SQLException, Exception;
}
