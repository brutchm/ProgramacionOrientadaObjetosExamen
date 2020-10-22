package com.moka.vet.bl.dao.cita;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public interface ICita {
    public void create(String nombreMascota, LocalDate fechaInicio, String observaciones)throws SQLException, Exception;
    public ArrayList<String> read () throws SQLException, Exception;
}
