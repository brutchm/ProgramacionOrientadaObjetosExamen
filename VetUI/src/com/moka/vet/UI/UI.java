package com.moka.vet.UI;

import com.moka.vet.tl.Controller;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class UI {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;
    static Controller gestor = new Controller();
    static final String ARCHIVOBD = "BD.txt";

    public static void main(String[] args) throws IOException {
        conectarBD();
        int opcionInicial = -1;
        do {
            menuInicial();
            opcionInicial = Integer.parseInt(in.readLine());
            ejecutarAccionInicial(opcionInicial);

        } while (opcionInicial != 0);

    }

    public static void conectarBD(){
        try {
            FileReader reader = new FileReader(ARCHIVOBD);
            BufferedReader buffer = new BufferedReader(reader);
            String info;
            String[] datos = new String[4];
            int i = 0;
            while ((info = buffer.readLine()) != null){
                datos[i] = info;
                i++;
            }
            gestor.conectarBD(datos);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void menuInicial() {
        out.println("Digite una opcion");
        out.println("______________________________");
        out.println("1. Iniciar Sesion");
        out.println("2. Registrarse");
        out.println("0. Salir");
        out.println("______________________________");
    }

    public static void menuRegistro() {
        out.println("Digite una opcion");
        out.println("______________________________");
        out.println("1. Registrarse como medico");
        out.println("2. Registrarse como asistente");
        out.println("0. Regresar al inicio");
        out.println("______________________________");
    }

    public static void menuPrincipal() {
        out.println("Digite la accion que desea realizar");
        out.println("___________________________________________");
        out.println("1. Registrar otro medico");
        out.println("2. Registrar otro asistente");
        out.println("3. Registrar una mascota");
        out.println("4. Registrar una cita medica");
        out.println("5. Registrar una reservacion en el hotel");
        out.println("6. Listar todos los usuarios");
        out.println("7. Listar (Buscar) unicamente medicos");
        out.println("8. Listar (Buscar) unicamente asistentes");
        out.println("9. Listar Mascotas");
        out.println("10. Listar citas");
        out.println("11. Listar Reservas");
        out.println("12. Realizar Check - in");
        out.println("13. Realizar Check - out");
        out.println("14. Buscar Medico por nombre");
        out.println("15. Buscar asistente por nombre");
        out.println("16. Buscar mascota por nombre");
        out.println("17. Crear las abitaciones del 1 al 10 (UTILIZAR UNICAMENTE UNA VEZ)");
        out.println("18. Listar habitaciones");
        out.println("0. Cerrar sesion");
        out.println("___________________________________________");
    }

    public static void ejecutarAccionInicial(int pOpcion) throws IOException {
        int opcionRegistro = -1;
        int opcionPrincipal = -1;
        switch (pOpcion) {
            case 1:
                if (iniciarSesion() == true) {
                    do {
                        menuPrincipal();
                        opcionPrincipal = Integer.parseInt(in.readLine());
                        ejecutarAccionPrincipal(opcionPrincipal);
                    } while (opcionPrincipal != 0);
                }
                break;
            case 2:
                do {
                    menuRegistro();
                    opcionRegistro = Integer.parseInt(in.readLine());
                    ejecutarAccionRegistro(opcionRegistro);
                } while (opcionRegistro != 0);
                break;
            case 0:
                out.println("Gracias por usar el programa");
                break;
            default:
                out.println("Digite una opcion valida");
                break;
        }
    }

    public static void ejecutarAccionRegistro(int pOpcion) throws IOException {
        switch (pOpcion) {
            case 1:
                registrarMedico();
                break;
            case 2:
                registrarAsistente();
                break;
            case 0:
                out.println("Redireccionando");
                break;
            default:
                out.println("Digite una opcion valida");
        }
    }

    public static void ejecutarAccionPrincipal(int pOpcion) throws IOException {
        switch (pOpcion) {
            case 1:
                registrarMedico();
                break;
            case 2:
                registrarAsistente();
                break;
            case 3:
                registrarMascota();
                break;
            case 4:
                registrarCita();
                break;
            case 5:
                registrarReserva();
                break;
            case 6:
                listarTodos();
                break;
            case 7:
                listarMedicos();
                break;
            case 8:
                listarAsist();
                break;
            case 9:
                listarMascotas();
                break;
            case 10:
                listarCitas();
                break;
            case 11:
                listarReservas();
                break;
            case 12:
                checkIn();
                break;
            case 13:
                checkOut();
                break;
            case 14:
                buscarMedicoXNombre();
                break;
            case 15:
                buscarAsistXNombre();
                break;
            case 16:
                buscarMascotaXNombre();
                break;
            case 17:
                gestor.crearHabitaciones();
                break;
            case 18:
                listarHabitaciones();
                break;
            case 0:
                break;
            default:
                out.println("Digite una opcion valida por favor");
                break;
        }
    }

    public static boolean iniciarSesion() throws IOException {
        String username;
        String password;
        String valido;
        boolean iniciada;

        out.println("Digite su nombre de usuario");
        username = in.readLine();
        out.println("Digite su contraseña");
        password = in.readLine();

        valido = gestor.validarSesion(username, password);

        if (valido.equals("Sesion iniciada")) {
            iniciada = true;
        } else if (valido.equals("Su usuario o contraseña son incorrectos o no se encuentra registrado")) {
            out.println(valido);
            iniciada = false;
        } else {
            out.println(valido);
            iniciada = false;
        }
        return iniciada;
    }

    public static void registrarMedico() throws IOException {
        String nombre;
        String apellidoUno;
        String apellidoDos;
        String cedula;
        String telefono;
        String email;
        String direccion;
        String estado;
        LocalDate fechaNacimiento;
        String rol;
        String userName;
        String contrasenna;
        String universidad;
        LocalDate fechaGraduacion;
        boolean paso;


        out.println(" Digite el nombre");
        nombre = in.readLine();
        out.println(" Digite el apellido 1");
        apellidoUno = in.readLine();
        out.println(" Digite el apellido 2");
        apellidoDos = in.readLine();
        out.println(" Digite la cedula");
        cedula = in.readLine();
        out.println(" Digite el numero de telefono");
        telefono = in.readLine();
        out.println(" Digite el email");
        email = in.readLine();
        out.println(" Digite  la direccion donde habita");
        direccion = in.readLine();
        out.println(" Digite 1 si el usuario esta activo o 2 si el usuario esta inactivo");
        estado = in.readLine();
        if (estado.equals("1")) {
            estado = "Activo";
        } else if (estado.equals("2")) {
            estado = "Inactivo";
        }
        out.println(" Digite la fecha de nacimiento con el formato " + LocalDate.now());
        fechaNacimiento = LocalDate.parse(in.readLine());
        rol = "Medico";
        out.println(" Digite el nombre de usuario");
        userName = in.readLine();
        out.println(" Digite la contraseña");
        contrasenna = in.readLine();
        out.println(" Digite la universidad donde asistió");
        universidad = in.readLine();
        out.println("Digite la fecha de graduacion con el formato " + LocalDate.now());
        fechaGraduacion = LocalDate.parse(in.readLine());

        paso = gestor.existeMedico(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, fechaNacimiento, rol, userName, contrasenna, universidad, fechaGraduacion);
        if (paso == false && gestor.validarMayor18(fechaNacimiento) == true) {
            gestor.registrarMedico(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, fechaNacimiento, rol, userName, contrasenna, universidad, fechaGraduacion);
            out.println("Usuario registrado");
        } else {
            out.println("No se ha podido registrar usuario por favor segurese de realizarlo bien");
        }
    }

    public static void registrarAsistente() throws IOException {
        String nombre;
        String apellidoUno;
        String apellidoDos;
        String cedula;
        String telefono;
        String email;
        String direccion;
        String estado;
        LocalDate fechaNacimiento;
        String rol;
        String userName;
        String contrasenna;
        String estudia;
        boolean paso;
        String estad;


        out.println(" Digite el nombre");
        nombre = in.readLine();
        out.println(" Digite el apellido 1");
        apellidoUno = in.readLine();
        out.println(" Digite el apellido 2");
        apellidoDos = in.readLine();
        out.println(" Digite la cedula");
        cedula = in.readLine();
        out.println(" Digite el numero de telefono");
        telefono = in.readLine();
        out.println(" Digite el email");
        email = in.readLine();
        out.println(" Digite  la direccion donde habita");
        direccion = in.readLine();
        out.println(" Digite 1 si el usuario esta activo o 2 si el usuario esta inactivo");
        estado = in.readLine();
        if (estado.equals("1")) {
            estado = "Activo";
        } else if (estado.equals("2")) {
            estado = "Inactivo";
        }
        out.println(" Digite la fecha de nacimiento con el formato " + LocalDate.now());
        fechaNacimiento = LocalDate.parse(in.readLine());
        rol = "Asistente";
        out.println(" Digite el nombre de usuario");
        userName = in.readLine();
        out.println(" Digite la contraseña");
        contrasenna = in.readLine();
        out.println(" La persona continúa estudiando? si o no");
        estudia = in.readLine();

        paso = gestor.existeAsistente(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, fechaNacimiento, rol, userName, contrasenna, estudia);
        if (paso == false && gestor.validarMayor18(fechaNacimiento) == true) {
            estad = gestor.registrarAsistente(nombre, apellidoUno, apellidoDos, cedula, telefono, email, direccion, estado, fechaNacimiento, rol, userName, contrasenna, estudia);
            out.println(estad);
            out.println("Usuario registrado");
        } else {
            out.println("Ha ocurrido un error, intentelo de nuevo, asegurese que el usuario sea mayor a 18 annos");
        }
    }

    public static void registrarMascota() throws IOException {
        String nombreDuenno;
        String nombreMascota;
        String tipo;
        String raza;
        int edad;
        String genero;

        out.println(" Digite el nombre del dueño");
        nombreDuenno = in.readLine();
        out.println(" Digite el nombre de la mascota");
        nombreMascota = in.readLine();
        out.println(" Digite el tipo de mascota");
        tipo = in.readLine();
        out.println(" Digite la raza de la mascota");
        raza = in.readLine();
        out.println(" Digite la edad");
        edad = Integer.parseInt(in.readLine());
        out.println(" Digite el genero");
        genero = in.readLine();

        if (gestor.existeMascota(nombreDuenno, nombreMascota, tipo, raza, edad, genero) == false) {
            gestor.registrarMascota(nombreDuenno, nombreMascota, tipo, raza, edad, genero);
        }else if (gestor.existeMascota(nombreDuenno, nombreMascota, tipo, raza, edad, genero) == true){
            out.println("Esta mascota ya fue registrada");
        }
    }

    public static void registrarReserva() throws IOException {
        String nombreMascota;
        LocalDate fechaInicio;
        LocalDate fechaSalida;

        boolean quinceDias;
        boolean espacio;
        boolean antes;


        out.println(" Digite el nombre de la mascota");
        nombreMascota = in.readLine();
        out.println(" Digite la fecha de ingreso de la mascota con el formato " + LocalDate.now());
        fechaInicio = LocalDate.parse(in.readLine());
        out.println(" Digite la fecha de salida con el formato " + LocalDate.now());
        fechaSalida = LocalDate.parse(in.readLine());

        if (gestor.validar15Dias(fechaInicio) == true && gestor.validarAntesHoy(fechaInicio) && gestor.validarEspacio(fechaInicio, fechaSalida) && gestor.existeMascota(nombreMascota)== true) {
            gestor.registrarHotel(nombreMascota, fechaInicio, fechaSalida);
        }else {
            out.println("Por favor vuelva a intentarlo, recuerde no agendar citas antes de hoy y verifique que la mascota este registrada y que no se pueden registrar más de 15 dias antes");
        }
    }

    public static void registrarCita() throws IOException {
        String nombreMascota;
        LocalDate fechaInicio;
        String observaciones;

        out.println("Digite el nombre de la mascota");
        nombreMascota = in.readLine();
        out.println("Digite la fecha de la cita con el formato " + LocalDate.now());
        fechaInicio = LocalDate.parse(in.readLine());
        out.println("Digite las observaciones de la cita");
        observaciones = in.readLine();

        if (gestor.validarAntesHoy(fechaInicio) == true && gestor.existeMascota(nombreMascota)== true) {
            gestor.registrarCita(nombreMascota, fechaInicio, observaciones);
        } else {
            out.println("Por favor vuelva a intentarlo, recuerde no agendar citas antes de hoy  y verifique que la mascota este registrada");
        }
    }

    public static void listarTodos() {
        ArrayList<String> info = gestor.listarUsuarios();
        for (String dato : info) {
            out.println(dato);
        }
    }

    public static void listarMedicos() {
        ArrayList<String> info = gestor.listarMedico();
        for (String dato : info) {
            out.println(dato);
        }
    }

    public static void listarAsist() {
        ArrayList<String> info = gestor.listarAsistente();
        for (String dato : info) {
            out.println(dato);
        }
    }

    public static void listarCitas() {
        ArrayList<String> info = gestor.listarCita();
        for (String dato : info) {
            out.println(dato);
        }
    }

    public static void listarReservas() {
        ArrayList<String> info = gestor.listarHotel();
        for (String dato : info) {
            out.println(dato);
        }
    }

    public static void listarMascotas() {
        ArrayList<String> info = gestor.listarMascota();
        for (String dato : info) {
            out.println(dato);
        }
    }

    public static void buscarMedicoXNombre() throws IOException {
        listarMedicos();
        String nombre;
        ArrayList<String> info;
        out.println("Digite el nombre del medico");
        nombre = in.readLine();
        info = gestor.buscarMedicoXNombre(nombre);
        for (String dato : info) {
            out.println(dato);
        }
    }

    public static void buscarAsistXNombre() throws IOException {
        listarAsist();
        String nombre;
        ArrayList<String> info;
        out.println("Digite el nombre del asistente");
        nombre = in.readLine();
        info = gestor.buscarAsistenteXNombre(nombre);
        for (String dato : info) {
            out.println(dato);
        }
    }

    public static void buscarMascotaXNombre() throws IOException {
        listarMascotas();
        String nombre;
        ArrayList<String> info;
        out.println("Digite el nombre de la mascota");
        nombre = in.readLine();
        info = gestor.buscarMascotaXNombre(nombre);
        for (String dato : info) {
            out.println(dato);
        }
    }

    public static void listarHabitaciones(){
        ArrayList<String> info = gestor.listarHabitaciones();
        for (String dato: info){
            out.println(dato);
        }
    }

    public static void checkIn()throws IOException{
        listarHabitaciones();
        int habitacion;
        String estado = "Ocupada";

        out.println("Digite la habitacion en la que va a registrar a la mascota");
        habitacion = Integer.parseInt(in.readLine());

        gestor.actualizarHabitacion(habitacion, estado);
    }

    public static void checkOut() throws IOException{
        listarHabitaciones();
        int numero;
        String estado = "Desocupada";

        out.println("Digite el numero de habitacion a la que desea hacer check out");
        numero = Integer.parseInt(in.readLine());

        gestor.actualizarHabitacion(numero, estado);
    }
}