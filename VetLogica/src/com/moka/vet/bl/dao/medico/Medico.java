package com.moka.vet.bl.dao.medico;

import com.moka.vet.bl.dao.usuario.Usuario;

import java.time.LocalDate;

public class Medico extends Usuario {
    private String universidad;
    private LocalDate fechaGraduacion;

    public Medico() {
        this.universidad = " ";
    }

    public Medico(String universidad, LocalDate fechaGraduacion) {
        this.universidad = universidad;
        this.fechaGraduacion = fechaGraduacion;
    }

    public Medico(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, LocalDate fechaNacimiento, String rol, String userName, String contrasenna, String universidad, LocalDate fechaGraduacion) {
        super(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, fechaNacimiento, rol, userName, contrasenna);
        this.universidad = universidad;
        this.fechaGraduacion = fechaGraduacion;
    }

    public Medico(String universidad) {
        this.universidad = universidad;
    }

    public Medico(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, String rol, String userName, String contrasenna, String universidad) {
        super(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, rol, userName, contrasenna);
        this.universidad = universidad;
    }

    public Medico(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, LocalDate fechaNacimiento, String rol, String userName, String contrasenna, String universidad) {
        super(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, fechaNacimiento, rol, userName, contrasenna);
        this.universidad = universidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public LocalDate getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(LocalDate fechaGraduacion) {
        this.fechaGraduacion = fechaGraduacion;
    }

    @Override
    public String toString() {
        return super.toString()+
                "universidad: " + universidad +
                        ", fechaGraduacion: " + fechaGraduacion;
    }

}
