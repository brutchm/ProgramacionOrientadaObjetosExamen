package com.moka.vet.bl.dao.habitacion;

import com.moka.vet.bl.dao.factoy.SqlServerDaoFactory;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IHabitacion {
    public void create() throws SQLException, Exception;

    public ArrayList<String> read ()throws SQLException, Exception;

    public void update (int numero, String estado) throws SQLException, Exception;
}
