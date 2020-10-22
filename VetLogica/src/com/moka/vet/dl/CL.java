package com.moka.vet.dl;

import com.moca.vet.Conector;
import com.moka.vet.bl.dao.asistente.Asistente;
import com.moka.vet.bl.dao.cita.Cita;
import com.moka.vet.bl.dao.factoy.DaoFactory;
import com.moka.vet.bl.dao.factoy.SqlServerDaoFactory;
import com.moka.vet.bl.dao.hotel.Hotel;
import com.moka.vet.bl.dao.mascota.Mascota;
import com.moka.vet.bl.dao.medico.Medico;
import com.moka.vet.bl.dao.usuario.Usuario;
import com.moka.vet.bl.dao.reservas.Reservas;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class CL {

    /**
     * Seccion de habitaciones
     * */

    public void crearHabitaciones()throws SQLException, Exception{
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        factory.getHabitacionDao().create();
    }

    public ArrayList<String> listarHabitaciones()throws SQLException, Exception{
        ArrayList<String> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getHabitacionDao().read();
        return info;
    }

    public void actualizarHabitacion(int numero, String estado)throws SQLException, Exception{
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        factory.getHabitacionDao().update(numero, estado);
    }

    /**
     * Seccion de  registrar
     */

    public void registrarMedico(String pNombre, String pApellidoUno, String pApellidoDos, String pCedula, String pTelefono, String pEmail, String pDireccion, String pEstado, LocalDate pFechaNacimiento, String pRol, String pUserName, String pContrasenna, String pUniversidad, LocalDate pFechaGraduacion) throws Exception {
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        factory.getMedicoDao().create(pNombre, pApellidoUno, pApellidoDos, pCedula, pTelefono, pEmail, pDireccion, pEstado, pFechaNacimiento, pRol, pUserName, pContrasenna, pUniversidad, pFechaGraduacion);
    }

    public void registrarAsistente(String pNombre, String pApellidoUno, String pApellidoDos, String pCedula, String pTelefono, String pEmail, String pDireccion, String pEstado, LocalDate pFechaNacimiento, String pRol, String pUserName, String pContrasenna, String pEstudia) throws Exception {
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        factory.getAsistenteDao().create(pNombre, pApellidoUno, pApellidoDos, pCedula, pTelefono, pEmail, pDireccion, pEstado, pFechaNacimiento, pRol, pUserName, pContrasenna, pEstudia);
    }

    public void registrarHotel(String pNombreMascota, LocalDate pFechaInicio, LocalDate pFechaSalida) throws Exception {
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        factory.getHotelDao().create(pNombreMascota, pFechaInicio, pFechaSalida);
    }

    public void registrarCita(String pNombreMascota, LocalDate pFechaInicio, String pObservaciones) throws Exception {
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        factory.getCitaDao().create(pNombreMascota, pFechaInicio, pObservaciones);
    }

    public void registrarMascota(String pNombreDuenno, String pNombreMascota, String pTipo, String pRaza, int pEdad, String pGenero) throws Exception {
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        factory.getMascotaDao().create(pNombreDuenno, pNombreMascota, pTipo, pRaza, pEdad, pGenero);
    }

    /**
     * Seccion de listar
     */

    public ArrayList<String> listarMedico() throws Exception {
        ArrayList<String> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getMedicoDao().read();
        return info;
    }

    public ArrayList<String> listarAsistente() throws Exception {
        ArrayList<String> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getAsistenteDao().read();
        return info;
    }

    public ArrayList<String> listarHotel() throws Exception {
        ArrayList<String> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getHotelDao().read();
        return info;
    }

    public ArrayList<String> listarCita() throws Exception {
        ArrayList<String> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getCitaDao().read();
        return info;
    }

    public ArrayList<String> listarMascota() throws Exception {
        ArrayList<String> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getMascotaDao().read();
        return info;
    }

    public ArrayList<String> listarUsuarios() throws Exception {
        ArrayList<String> info;
        ArrayList<String> infoMedico;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getAsistenteDao().read();
        infoMedico = factory.getMedicoDao().read();
        for (String dato : infoMedico) {
            info.add(dato);
        }
        return info;
    }

    /**
     * Seccion de listar objetos
     */

    public ArrayList<Medico> listarObjectMedico() throws Exception {
        ArrayList<Medico> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getMedicoDao().readObject();
        return info;
    }

    public ArrayList<Asistente> listarObjectAsistente() throws Exception {
        ArrayList<Asistente> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getAsistenteDao().readObject();
        return info;
    }

    public ArrayList<Mascota> listarObjectMascota() throws Exception {
        ArrayList<Mascota> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getMascotaDao().readObject();
        return info;
    }

    public ArrayList<Hotel> listarObjectHotel() throws SQLException, Exception{
        ArrayList<Hotel> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getHotelDao().readObject();
        return info;
    }


    /**
     * Seccion de buscar por nombre
     */

    public ArrayList<String> buscarMedicoXNombre(String pNombre) throws Exception {
        ArrayList<String> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getMedicoDao().findByName(pNombre);
        return info;
    }

    public ArrayList<String> buscarMascotaXNombre(String pNombre) throws Exception {
        ArrayList<String> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getMascotaDao().findByName(pNombre);
        return info;
    }

    public ArrayList<String> buscarAsistenteXNombre(String pNombre) throws Exception {
        ArrayList<String> info;
        DaoFactory factory = DaoFactory.getDaoFactory(1);
        info = factory.getAsistenteDao().findByName(pNombre);
        return info;
    }


    /**
     * Seccion de validaciones
     */

    public boolean validarMayor18(LocalDate pFecha) throws Exception {
        boolean valido = false;
        LocalDate fechaValida = LocalDate.now().minusYears(18);
        if (fechaValida.isAfter(pFecha)) {
            valido = true;
        }
        return valido;
    }

    public boolean validarFechaAnteriosAHoy(LocalDate pFecha) throws Exception {
        boolean valdio = false;
        LocalDate ahora = LocalDate.now();
        if (pFecha.isAfter(ahora)) {
            valdio = true;
        } else if (pFecha.isBefore(pFecha) || pFecha.isEqual(ahora)) {
            valdio = false;
        }
        return valdio;
    }

    public boolean validarReserva15DiasAntes(LocalDate pfecha) throws Exception {
        boolean valido = false;
        LocalDate ahora = LocalDate.now();
        if (ahora.plusDays(15).isAfter(pfecha) || ahora.plusDays(15).isEqual(pfecha)) {
            valido = true;
        }
        return valido;
    }

    public boolean validarEspacio(LocalDate entrada, LocalDate salida) throws Exception{
        boolean valido = true;
        ArrayList<Hotel> datos = listarObjectHotel();
        int cont1 = 0;
        int cont2 = 0;
        for (Hotel dato : datos){
            if (dato.getFechaSalida().isAfter(entrada)){
                cont1++;
            }
            if (dato.getFechaSalida().isBefore(salida)){
                cont2++;
            }
        }
        if (cont1 >= 10 || cont2 >= 10){
            valido = false;
        }
        return valido;
    }

    public boolean existeMascota(String nombre)throws SQLException, Exception{
        boolean existe = false;
        ArrayList<Mascota> info = listarObjectMascota();
        for (Mascota dato : info){
            if (dato.getNombreMascota().equals(nombre)){
                existe = true;
            }
        }
        return existe;
    }

    /**
     * Seccion inicio de Sesion
     */

    public String iniciarSesion(String username, String password) throws Exception {
        Usuario u = new Usuario();
        u.setUserName(username);
        u.setContrasenna(password);
        String valido = "Su usuario o contraseña son incorrectos o no se encuentra registrado";
        ArrayList<Medico> medicos = listarObjectMedico();
        ArrayList<Asistente> asistentes = listarObjectAsistente();

        for (Medico dato : medicos) {
            if (dato.getUserName().equals(username) && dato.getContrasenna().equals(password)) {
                valido = "Sesion iniciada";
            }
        }

        for (Asistente dato : asistentes) {
            if (dato.getUserName().equals(username) && dato.getContrasenna().equals(password)) {
                valido = "Sesion iniciada";
            }
        }
        return valido;
    }

    /**
     * Seccion de validar iguales
     */

    public boolean existMedico(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, LocalDate fechaNacimiento, String rol, String userName, String contrasenna, String universidad, LocalDate fechaGraducacion) throws Exception {
        Medico m = new Medico(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, fechaNacimiento, rol, userName, contrasenna, universidad, fechaGraducacion);
        boolean existe = false;
        ArrayList<Medico> medicos = listarObjectMedico();
        for (Medico dato : medicos) {
            if (dato.equals(m)) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean existeAsistente(String nombre, String apellidoUno, String apellidoDos, String cedula, String telefono, String email, String direccion, String estado, LocalDate fechaNacimiento, String rol, String userName, String contrasenna, String estudia)throws Exception{
        boolean existe = false;
        Asistente a = new Asistente(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, fechaNacimiento, rol, userName, contrasenna, estudia);
        ArrayList<Asistente> asistentes = listarObjectAsistente();

        for (Asistente dato: asistentes){
            if (dato.equals(a)){
                existe = true;
            }
        }
        return existe;
    }

    public boolean existeMascota(String nombreDuenno, String nombreMascota, String tipo, String raza, int edad, String genero)throws Exception{
        boolean existe = false;
        Mascota m = new Mascota(nombreDuenno, nombreMascota, tipo, raza, edad, genero);
        ArrayList<Mascota> mascotas = listarObjectMascota();

        for (Mascota dato: mascotas){
            if (dato.equals(m)){
                existe = true;
            }
        }

        return existe;
    }

    public void conectarBD(String[] info) throws Exception{
        String driver = info[0];
        String url = info[1];
        String user = info[2];
        String password = info[3];

        Conector.setDriver(driver);
        Conector.setUrl(url);
        Conector.setUser(user);
        Conector.setPassword(password);
    }
}
