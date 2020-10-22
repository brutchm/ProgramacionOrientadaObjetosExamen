package com.moka.vet.bl.dao.factoy;

import com.moka.vet.bl.dao.asistente.IAsistente;
import com.moka.vet.bl.dao.asistente.MySqlAsistenteDao;
import com.moka.vet.bl.dao.cita.ICita;
import com.moka.vet.bl.dao.cita.MySqlCitaDao;
import com.moka.vet.bl.dao.habitacion.IHabitacion;
import com.moka.vet.bl.dao.habitacion.MySqlHabitacionDao;
import com.moka.vet.bl.dao.hotel.IHotel;
import com.moka.vet.bl.dao.hotel.MySqlHotelDao;
import com.moka.vet.bl.dao.mascota.IMascota;
import com.moka.vet.bl.dao.mascota.MySqlMascotaDao;
import com.moka.vet.bl.dao.medico.IMedico;
import com.moka.vet.bl.dao.medico.MySqlMedicoDao;

public class MySqlDaoFactory extends DaoFactory {

    @Override
    public IAsistente getAsistenteDao() {
        return new MySqlAsistenteDao();
    }

    @Override
    public ICita getCitaDao() {
        return new MySqlCitaDao();
    }

    @Override
    public IHotel getHotelDao() {
        return new MySqlHotelDao();
    }

    @Override
    public IMascota getMascotaDao() {
        return new MySqlMascotaDao();
    }

    @Override
    public IMedico getMedicoDao() {
        return new MySqlMedicoDao();
    }

    @Override
    public IHabitacion getHabitacionDao() {
        return new MySqlHabitacionDao();
    }
}
