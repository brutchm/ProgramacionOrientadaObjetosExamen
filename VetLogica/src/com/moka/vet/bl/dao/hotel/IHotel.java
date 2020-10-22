package com.moka.vet.bl.dao.hotel;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public interface IHotel {
    public void create(String nombreMascota, LocalDate fechaInicio, LocalDate fechaSalida)throws SQLException, Exception;
    public ArrayList<String> read() throws SQLException, Exception;
    public ArrayList<Hotel> readObject ()throws SQLException, Exception;
}
