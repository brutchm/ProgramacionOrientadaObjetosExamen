package com.moka.vet.bl.dao.reservas;

import java.time.LocalDate;
import java.util.Objects;

public class Reservas {
    protected String nombreMascota;
    protected LocalDate FechaInicio;

    public Reservas() {
        this.nombreMascota = " ";
    }

    public Reservas(String nombreMascota, LocalDate fechaInicio) {
        this.nombreMascota = nombreMascota;
        FechaInicio = fechaInicio;
    }

    public Reservas(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return
                "nombreMascota: " + nombreMascota +
                        ", FechaInicio: " + FechaInicio
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservas reservas = (Reservas) o;
        return Objects.equals(nombreMascota, reservas.nombreMascota) &&
                Objects.equals(FechaInicio, reservas.FechaInicio);
    }
}
