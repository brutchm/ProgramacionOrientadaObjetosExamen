package com.moka.vet.bl.dao.habitacion;

public class Habitacion {
    private int numero;
    private String estado;

    public Habitacion(int numero, String estado) {
        this.numero = numero;
        this.estado = estado;
    }

    public Habitacion() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", estado='" + estado + '\'' +
                '}';
    }
}
