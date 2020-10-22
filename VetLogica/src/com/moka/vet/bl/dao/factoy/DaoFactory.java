package com.moka.vet.bl.dao.factoy;

import com.moka.vet.bl.dao.asistente.IAsistente;
import com.moka.vet.bl.dao.cita.ICita;
import com.moka.vet.bl.dao.habitacion.IHabitacion;
import com.moka.vet.bl.dao.hotel.IHotel;
import com.moka.vet.bl.dao.mascota.IMascota;
import com.moka.vet.bl.dao.medico.IMedico;

public abstract class DaoFactory {
    public static final int MYSQL = 1;
    public static final int SQLSERVER = 2;

    public static DaoFactory getDaoFactory(int factory){
        switch (factory){
            case MYSQL:
                return new MySqlDaoFactory();
            case SQLSERVER:
                return  new SqlServerDaoFactory();
            default:
                return null;
        }
    }

    public abstract IAsistente getAsistenteDao();

    public abstract ICita getCitaDao();

    public abstract IHotel getHotelDao();

    public abstract IMascota getMascotaDao();

    public abstract IMedico getMedicoDao();

    public abstract IHabitacion getHabitacionDao();
}
