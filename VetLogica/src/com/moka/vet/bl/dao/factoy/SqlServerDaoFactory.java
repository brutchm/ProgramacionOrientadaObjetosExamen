package com.moka.vet.bl.dao.factoy;

import com.moka.vet.bl.dao.asistente.IAsistente;
import com.moka.vet.bl.dao.cita.ICita;
import com.moka.vet.bl.dao.habitacion.IHabitacion;
import com.moka.vet.bl.dao.hotel.IHotel;
import com.moka.vet.bl.dao.mascota.IMascota;
import com.moka.vet.bl.dao.medico.IMedico;

public class SqlServerDaoFactory extends DaoFactory {
    @Override
    public IAsistente getAsistenteDao() {
        return null;
    }

    @Override
    public ICita getCitaDao() {
        return null;
    }

    @Override
    public IHotel getHotelDao() {
        return null;
    }

    @Override
    public IMascota getMascotaDao() {
        return null;
    }

    @Override
    public IMedico getMedicoDao() {
        return null;
    }

    @Override
    public IHabitacion getHabitacionDao() {
        return null;
    }
}
