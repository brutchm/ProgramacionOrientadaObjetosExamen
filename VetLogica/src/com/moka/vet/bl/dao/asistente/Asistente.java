package com.moka.vet.bl.dao.asistente;

import com.moka.vet.bl.dao.usuario.Usuario;

import java.time.LocalDate;
import java.util.Objects;

public class Asistente extends Usuario {
    private String estudia;

    public Asistente(){
        this.estudia = " ";
    }

    public Asistente(String estudia) {
        this.estudia = estudia;
    }

    public Asistente(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, String rol, String userName, String contrasenna, String estudia) {
        super(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, rol, userName, contrasenna);
        this.estudia = estudia;
    }

    public Asistente(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, LocalDate fechaNacimiento, String rol, String userName, String contrasenna, String estudia) {
        super(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, fechaNacimiento, rol, userName, contrasenna);
        this.estudia = estudia;
    }

    public String getEstudia() {
        return estudia;
    }

    public void setEstudia(String estudia) {
        this.estudia = estudia;
    }

    @Override
    public String toString() {
        return super.toString()+
                "estudia: " + estudia;
    }

}
