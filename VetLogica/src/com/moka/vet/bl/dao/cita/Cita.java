package com.moka.vet.bl.dao.cita;

import com.moka.vet.bl.dao.reservas.Reservas;

import java.time.LocalDate;

public class Cita extends Reservas {
    private String observaciones;

    public Cita() {
        this.observaciones = " ";
    }

    public Cita(String observaciones) {
        this.observaciones = observaciones;
    }

    public Cita(String nombreMascota, LocalDate fechaInicio, String observaciones) {
        super(nombreMascota, fechaInicio);
        this.observaciones = observaciones;
    }

    public Cita(String nombreMascota, String observaciones) {
        super(nombreMascota);
        this.observaciones = observaciones;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return super.toString()+
                "observaciones: " + observaciones +
                        ", nombreMascota: " + nombreMascota +
                        ", FechaInicio: " + FechaInicio ;
    }
}
