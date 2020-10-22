package com.moka.vet.tl;

import com.moka.vet.bl.dao.asistente.Asistente;
import com.moka.vet.bl.dao.cita.Cita;
import com.moka.vet.bl.dao.hotel.Hotel;
import com.moka.vet.bl.dao.mascota.Mascota;
import com.moka.vet.bl.dao.medico.Medico;
import com.moka.vet.dl.CL;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {

    static CL logica = new CL();

    public String crearHabitaciones(){
        String estado;
        try {
            logica.crearHabitaciones();
            estado = "Operacion exitosa";
        }catch (Exception e){
            estado = "Ha ocurrido el siguiente error "+e.getLocalizedMessage();
        }
        return estado;
    }

    public ArrayList<String> listarHabitaciones(){
        ArrayList<String> info = new ArrayList<>();
        try {
            info = logica.listarHabitaciones();
        }catch (Exception e){
            info.add("A ocurrido el siguiente error "+e.getLocalizedMessage());
        }
        return info;
    }

    public String actualizarHabitacion (int numero, String estado){
        String msj;
        try {
            logica.actualizarHabitacion(numero, estado);
            msj = "Operacion exitosa";
        }catch (Exception e){
            msj = "Ha ocurrido el siguiente error "+e.getLocalizedMessage();
        }
        return msj;
    }

    public String registrarMedico(String pNombre, String pApellidoUno, String pApellidoDos, String pCedula, String pTelefono, String pEmail, String pDireccion, String pEstado, LocalDate pFechaNacimiento, String pRol, String pUserName, String pContrasenna, String pUniversidad, LocalDate pFechaGraduacion){
        String estado;
        try {
            logica.registrarMedico(pNombre, pApellidoUno, pApellidoDos, pCedula, pTelefono, pEmail, pDireccion, pEstado, pFechaNacimiento, pRol, pUserName, pContrasenna, pUniversidad, pFechaGraduacion);
            estado = "Proceso exitoso";
        }catch (Exception e){
            estado = "Ha ocurrido el siguiente error "+e.getLocalizedMessage();
        }
        return estado;
    }

    public String registrarAsistente(String pNombre, String pApellidoUno, String pApellidoDos, String pCedula, String pTelefono, String pEmail, String pDireccion, String pEstado, LocalDate pFechaNacimiento, String pRol, String pUserName, String pContrasenna,String pEstudia){
        String estado;
        try {
            logica.registrarAsistente(pNombre, pApellidoUno, pApellidoDos, pCedula, pTelefono, pEmail, pDireccion, pEstado, pFechaNacimiento, pRol, pUserName, pContrasenna, pEstudia);
            estado = "Proceso exitoso";
        }catch (Exception e ){
            estado = "Ha ocurrido el siguiente error "+e.getLocalizedMessage();
        }
        return estado;
    }

    public String registrarHotel(String pNombreMascota, LocalDate pFechaInicio, LocalDate pFechaSalida){
        String estado;
        try {
            logica.registrarHotel(pNombreMascota, pFechaInicio, pFechaSalida);
            estado = "Proceso exitoso";
        }catch (Exception e ){
            estado = "Ha ocurrido el siguiente error "+e.getLocalizedMessage();
        }
        return estado;
    }

    public String registrarCita(String pNombreMascota, LocalDate pFechaInicio, String pObservaciones){
        String estado;
        try {
            logica.registrarCita(pNombreMascota, pFechaInicio, pObservaciones);
            estado = "Proceso exitoso";
        }catch (Exception e ){
            estado = "Ha ocurrido el siguiente error "+e.getLocalizedMessage();
        }
        return estado;
    }

    public String registrarMascota(String pNombreDuenno, String pNombreMascota, String pTipo, String pRaza, int pEdad, String pGenero){
        String estado;
        try {
            logica.registrarMascota(pNombreDuenno, pNombreMascota, pTipo, pRaza, pEdad, pGenero);
            estado = "Proceso exitoso";
        }catch (Exception e ){
            estado = "Ha ocurrido el siguiente error "+e.getLocalizedMessage();
        }
        return estado;
    }

    public ArrayList<String> listarMedico(){
        ArrayList<String> info = new ArrayList<>();
        try {
            info = logica.listarMedico();
        }catch (Exception e){
            info.add("Ha ocurrido el siguient error "+e.getLocalizedMessage());
        }
        return info;
    }

    public ArrayList<String> listarAsistente(){
        ArrayList<String> info = new ArrayList<>();
        try {
            info = logica.listarAsistente();
        }catch (Exception e){
            info.add("Ha ocurrido el siguient error "+e.getLocalizedMessage());
        }
        return info;
    }

    public ArrayList<String> listarHotel(){
        ArrayList<String> info = new ArrayList<>();
        try {
            info = logica.listarHotel();
        }catch (Exception e){
            info.add("Ha ocurrido el siguient error "+e.getLocalizedMessage());
        }
        return info;
    }

    public ArrayList<String> listarCita(){
        ArrayList<String> info = new ArrayList<>();
        try {
            info = logica.listarCita();
        }catch (Exception e){
            info.add("Ha ocurrido el siguient error "+e.getLocalizedMessage());
        }
        return info;
    }

    public ArrayList<String> listarMascota(){
        ArrayList<String> info = new ArrayList<>();
        try {
            info = logica.listarMascota();
        }catch (Exception e){
            info.add("Ha ocurrido el siguient error "+e.getLocalizedMessage());
        }
        return info;
    }

    public ArrayList<String> listarUsuarios(){
        ArrayList<String> info = new ArrayList<>();
        try {
            info = logica.listarUsuarios();
        }catch (Exception e){
            info.add("Ha ocurrido el siguient error "+e.getLocalizedMessage());
        }
        return info;
    }

    public ArrayList<String> buscarMedicoXNombre(String pNombre){
        ArrayList<String> info = new ArrayList<>();
        try {
            info = logica.buscarMedicoXNombre(pNombre);
        }catch (Exception e){
            info.add("Ha ocurrido el siguiente error "+e.getLocalizedMessage());
        }
        return info;
    }

    public ArrayList<String> buscarMascotaXNombre(String pNombre){
        ArrayList<String> info = new ArrayList<>();
        try {
            info = logica.buscarMascotaXNombre(pNombre);
        }catch (Exception e){
            info.add("Ha ocurrido el siguiente error "+e.getLocalizedMessage());
        }
        return info;
    }

    public ArrayList<String> buscarAsistenteXNombre(String pNombre){
        ArrayList<String> info = new ArrayList<>();
        try {
            info = logica.buscarAsistenteXNombre(pNombre);
        }catch (Exception e){
            info.add("Ha ocurrido el siguiente error "+e.getLocalizedMessage());
        }
        return info;
    }

    public boolean validarMayor18(LocalDate fecha){
        boolean estado;
        try {
            estado = logica.validarMayor18(fecha);
        }catch (Exception e){
            estado = false;
        }
        return estado;
    }

    public boolean validarAntesHoy(LocalDate fecha){
        boolean estado;
        try {
            estado = logica.validarFechaAnteriosAHoy(fecha);
        }catch (Exception e){
            estado = false;
        }
        return estado;
    }

    public boolean validar15Dias(LocalDate fecha){
        Boolean estado;
        try {
            estado = logica.validarReserva15DiasAntes(fecha);
        }catch (Exception e){
            estado = false;
        }
        return estado;
    }

    public boolean validarEspacio(LocalDate entrada, LocalDate salida){
        boolean estado;
        try {
            estado = logica.validarEspacio(entrada, salida);
        }catch (Exception e){
            estado = false;
        }
        return estado;
    }

    public String validarSesion(String username, String password){
        String info;
        try {
            info = logica.iniciarSesion(username, password);
        }catch (Exception e){
            info = "Ha ocurrido el siguiente error "+e.getLocalizedMessage();
        }
        return info;
    }

    public boolean  existeMedico(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, LocalDate fechaNacimiento, String rol, String userName, String contrasenna, String universidad, LocalDate fechaGraducacion){
        boolean valido;
        try {
            valido = logica.existMedico(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, fechaNacimiento, rol, userName, contrasenna, universidad, fechaGraducacion);
        }catch (Exception e){
            valido = true;
        }
        return valido;
    }

    public boolean  existeAsistente(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, LocalDate fechaNacimiento, String rol, String userName, String contrasenna, String estudia){
        boolean valido;
        try {
            valido = logica.existeAsistente(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, fechaNacimiento, rol, userName, contrasenna, estudia);
        }catch (Exception e){
            valido = true;
        }
        return valido;
    }

    public boolean existeMascota(String nombreDuenno, String nombreMascota, String tipo, String raza, int edad, String genero){
        boolean valido;
        try {
            valido = logica.existeMascota(nombreDuenno, nombreMascota, tipo, raza, edad, genero);
        }catch (Exception e){
            valido = true;
        }
        return valido;
    }

    public boolean existeMascota(String nombre){
        boolean existe;
        try {
            existe = logica.existeMascota(nombre);
        } catch (Exception e){
            existe = false;
        }
        return existe;
    }

    public void conectarBD(String[] info)throws Exception {
        logica.conectarBD(info);
    }
}
