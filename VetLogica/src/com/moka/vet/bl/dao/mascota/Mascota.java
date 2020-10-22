package com.moka.vet.bl.dao.mascota;

import java.util.Objects;

public class Mascota {
    private String nombreDuenno;
    private String nombreMascota;
    private String tipo;
    private String raza;
    private int edad;
    private String genero;

    public Mascota() {
        this.nombreDuenno = " ";
        this.nombreMascota = " ";
        this.tipo = " ";
        this.raza = " ";
        this.edad = 0;
        this.genero = " ";
    }

    public Mascota(String nombreDuenno, String nombreMascota, String tipo, String raza, int edad, String genero) {
        this.nombreDuenno = nombreDuenno;
        this.nombreMascota = nombreMascota;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombreDuenno() {
        return nombreDuenno;
    }

    public void setNombreDuenno(String nombreDuenno) {
        this.nombreDuenno = nombreDuenno;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return
                "nombreDuenno: " + nombreDuenno +
                        ", nombreMascota: " + nombreMascota +
                        ", tipo: " + tipo +
                        ", raza: " + raza +
                        ", edad: " + edad +
                        ", genero: " + genero
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mascota mascota = (Mascota) o;
        return Objects.equals(nombreDuenno, mascota.nombreDuenno) &&
                Objects.equals(nombreMascota, mascota.nombreMascota);
    }

}
