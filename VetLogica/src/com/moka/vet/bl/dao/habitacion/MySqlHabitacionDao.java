package com.moka.vet.bl.dao.habitacion;

import com.moca.vet.Conector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MySqlHabitacionDao implements IHabitacion {

    @Override
    public void create() throws SQLException, Exception {
        int i = 1;
        for (int j = 0; j < 10; j++) {
            String query = "INSERT INTO HABITACION VALUES ("+i+",'Desocupada')";
            Conector.getConnector().ejecutarSql(query);
            i++;
        }
    }

    @Override
    public ArrayList<String> read() throws SQLException, Exception {
        ArrayList<String> info =  new ArrayList<>();
        ResultSet rs;
        String query = "SELECT NUMERO, ESTADO FROM HABITACION";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Habitacion h = new Habitacion(rs.getInt("NUMERO"), rs.getString("ESTADO"));
            info.add(h.toString());
        }
        return info;
    }

    @Override
    public void update(int numero, String estado) throws SQLException, Exception {
        String query = "UPDATE HABITACION SET ESTADO = '"+estado+"' WHERE NUMERO = "+numero;
        Conector.getConnector().ejecutarSql(query);
    }
}
