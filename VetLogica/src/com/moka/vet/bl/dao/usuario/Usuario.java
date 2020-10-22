package com.moka.vet.bl.dao.usuario;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario {
    protected String nombre;
    protected String apellidoUno;
    protected String apellidoDos;
    protected String cedula;
    protected String telefono;
    protected String email;
    protected String direccion;
    protected String estado;
    protected LocalDate fechaNacimiento;
    protected String rol;
    protected String userName;
    protected String contrasenna;

    public Usuario() {
        this.nombre = " ";
        this.apellidoUno = " ";
        this.apellidoDos = " ";
        this.cedula = " ";
        this.telefono = " ";
        this.email = " ";
        this.direccion = " ";
        this.estado = " ";
        this.rol = " ";
        this.userName = " ";
        this.contrasenna = " ";
    }

    public Usuario(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, String rol, String userName, String contrasenna) {
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.estado = estado;
        this.rol = rol;
        this.userName = userName;
        this.contrasenna = contrasenna;
    }

    public Usuario(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, LocalDate fechaNacimiento, String rol, String userName, String contrasenna) {
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.userName = userName;
        this.contrasenna = contrasenna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoUno() {
        return apellidoUno;
    }

    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }

    public String getApellidoDos() {
        return apellidoDos;
    }

    public void setApellidoDos(String apellidoDos) {
        this.apellidoDos = apellidoDos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    @Override
    public String toString() {
        return
                "nombre: " + nombre +
                        ", apellidoUno: " + apellidoUno +
                        ", apellidoDos: " + apellidoDos +
                        ", cedula: " + cedula +
                        ", telefono: " + telefono +
                        ", email: " + email +
                        ", direccion: " + direccion +
                        ", estado: " + estado +
                        ", fechaNacimiento: " + fechaNacimiento +
                        ", rol: " + rol +
                        ", userName: " + userName +
                        ", contrasenna: " + contrasenna
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(cedula, usuario.cedula);
    }


    public boolean equalsUser(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(userName, usuario.userName) &&
                Objects.equals(contrasenna, usuario.contrasenna);

    }
}
