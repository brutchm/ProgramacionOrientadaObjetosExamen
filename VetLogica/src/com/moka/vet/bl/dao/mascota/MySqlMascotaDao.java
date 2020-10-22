package com.moka.vet.bl.dao.mascota;

import com.moca.vet.Conector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MySqlMascotaDao implements IMascota {
    @Override
    public void create(String nombreDuenno, String nombreMascota, String tipo, String raza, int edad, String genero) throws SQLException, Exception {
        String query = "INSERT INTO MASCOTA VALUES('"+nombreDuenno+"', '"+nombreMascota+"', '"+tipo+"', '"+raza+"', "+edad+", '"+genero+"')";
        Conector.getConnector().ejecutarSql(query);
    }

    @Override
    public ArrayList<String> read() throws SQLException, Exception {
        ArrayList<String> info = new ArrayList<>();
        ResultSet rs;
        String query = "SELECT NOMBREDUENNO, NOMBREMASCOTA, TIPO, RAZA, EDAD, GENERO FROM MASCOTA";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Mascota m = new Mascota(rs.getString("NOMBREDUENNO"), rs.getString("NOMBREMASCOTA"), rs.getString("TIPO"), rs.getString("RAZA"), rs.getInt("EDAD"), rs.getString("GENERO"));
            info.add(m.toString());
        }
        return info;
    }

    @Override
    public ArrayList<String> findByName(String nombre) throws SQLException, Exception {
        ArrayList<String> info = new ArrayList<>();
        ResultSet rs;
        String query = "SELECT NOMBREDUENNO, NOMBREMASCOTA, TIPO, RAZA, EDAD, GENERO FROM MASCOTA WHERE NOMBREMASCOTA = '"+nombre+"'";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Mascota m = new Mascota(rs.getString("NOMBREDUENNO"), rs.getString("NOMBREMASCOTA"), rs.getString("TIPO"), rs.getString("RAZA"), rs.getInt("EDAD"), rs.getString("GENERO"));
            info.add(m.toString());
            info.add("Fin de la busqueda, si no aparecen mas lineas es porque no existe una mascota con este nombre");
        }
        return info;
    }

    @Override
    public ArrayList<Mascota> readObject() throws SQLException, Exception {
        ArrayList<Mascota> info = new ArrayList<>();
        ResultSet rs;
        String query = "SELECT NOMBREDUENNO, NOMBREMASCOTA, TIPO, RAZA, EDAD, GENERO FROM MASCOTA";
        rs = Conector.getConnector().ejecutarQuery(query);
        while (rs.next()){
            Mascota m = new Mascota(rs.getString("NOMBREDUENNO"), rs.getString("NOMBREMASCOTA"), rs.getString("TIPO"), rs.getString("RAZA"), rs.getInt("EDAD"), rs.getString("GENERO"));
            info.add(m);
        }
        return info;
    }
}
