package com.moka.vet.bl.dao.hotel;

import com.moka.vet.bl.dao.reservas.Reservas;

import java.time.LocalDate;
import java.util.Objects;

public class Hotel extends Reservas {
    private LocalDate fechaSalida;

    public Hotel(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Hotel(String nombreMascota, LocalDate fechaInicio, LocalDate fechaSalida) {
        super(nombreMascota, fechaInicio);
        this.fechaSalida = fechaSalida;
    }

    public Hotel() {
    }

    public Hotel(String nombreMascota, LocalDate fechaInicio) {
        super(nombreMascota, fechaInicio);
    }

    public Hotel(String nombreMascota) {
        super(nombreMascota);
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return super.toString()+
                "fechaSalida: " + fechaSalida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(fechaSalida, hotel.fechaSalida);
    }

}
