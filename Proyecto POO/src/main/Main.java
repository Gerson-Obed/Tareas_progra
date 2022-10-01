package main;

import clases.Alumno;
import java.io.*; //importar
import java.io.InputStreamReader;

public class Main {

    //Declaracion de Arreglo
    static Alumno alumnos[] = null;

    //Contador
    static int cont = 0;

    //Lectura y captura del teclado reemplaza a la funcion Scanner
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader lector = new BufferedReader(isr);

    public static void main(String args[]) throws IOException {

        //Inicializar arreglo
        alumnos = new Alumno[5];

        //inicializar opcion
        int opcion = 0;

        //Menu
        do {
            System.out.println("MENU DE CONTROL");
            System.out.println("----------------");
            System.out.println("1.-Inrgesar alumno");
            System.out.println("2.-Buscar alumno");
            System.out.println("3.-Listar alumno");
            System.out.println("4.-Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(lector.readLine());//capturamos lo ingresado

            switch (opcion) {
                case 1:
                    if (cont < 5) {
                        agregarAlumno();
                    } else {
                        System.out.println("No hay cupos");
                    }
                    break;
                case 2:
                    editarAlumno();
                    break;
                case 3:
                    listarAlumno();
                    break;
                case 4:
                    System.out.println("Saliendo...");
            }
        } while (opcion != 4);
        System.exit(0);
    }

    //Metodo crear alumno
    private static void agregarAlumno() throws IOException {

        //variables locales
        String nombre = "";
        String apellido = "";
        double dpi = 0;
        double nit = 0;

        //Lectura de datos:
        System.out.println("\n\n\n");
        System.out.println("--------------------");
        System.out.println("DATOS DE ALUMNO");
        System.out.println("--------------------");

        System.out.print("Nombre: ");
        nombre = lector.readLine();

        System.out.print("Apellido: ");
        apellido = lector.readLine();


        System.out.print("DPI: ");
        dpi = Double.parseDouble(lector.readLine());//se convierte el dato de string a double

        System.out.print("NIT: ");
        nit = Double.parseDouble(lector.readLine());


        //Agregar elementos a la coleccion:
        alumnos[cont] = new Alumno(nombre, apellido, dpi, nit);
        cont++;
        System.out.println("Alumno agregado!: " + cont);
    }

    //metodo editar alumno
    private static void editarAlumno() throws IOException {

        //vairables locales
        String rut;
        int pos = -1;
        int accion = 0;
        System.out.print("Ingrese Nombre: ");
        rut = lector.readLine();
        pos = buscarAlumno(rut);

        if (pos >= 0) {
            System.out.println("Datos: " + alumnos[pos].toString());
            System.out.println("1.-Modificar");
            System.out.println("2.-Eliminar");
            System.out.println("Ingrese opción: ");
            accion = Integer.parseInt(lector.readLine());

            switch (accion) {
                case 1:
                    modificarDatos(pos);
                    break;
                case 2:
                    eliminarDatos(pos);
                    break;
                default:
                    System.out.println("Opción inválida!");
            }
        } else {
            System.out.println("No existe registro!");
        }
    }

    //metodo buscarAlumno
    private static int buscarAlumno(String rut) {
        int pos = -1;
        for (int i = 0; i < cont; i++) {
            if (alumnos[i].getNombre().equals(rut)) {
                System.out.println("Registro encontrado!");
                pos = i;
            } else {
                System.out.println("Registro inexistente!");
            }
        }
        return pos;
    }

    //metodo modificarDatos
    public static void modificarDatos(int pos) throws IOException {

        //variables locales:
        String nombre = null;
        String apellido = null;
        double dpi = 0;
        double nit = 0;
        int opcion = 0;
        int seguir = 0;

        //Condiciones:
        while (seguir == 1) {
            System.out.println("1.-Modificar nombre?");
            System.out.println("2.-Modificar apellido?");
            System.out.println("3.-Modificar dpi?");
            System.out.println("4.-Modificar nit?");
            System.out.print("Ingrese opción: ");
            opcion = Integer.parseInt(lector.readLine());

            //Manejo de condiciones:
            switch (opcion) {
                case 1:
                    System.out.println("Nombre: ");
                    nombre = lector.readLine();
                    alumnos[pos].setNombre(nombre);
                    break;
                case 2:
                    System.out.println("Apellido: ");
                    apellido = lector.readLine();
                    alumnos[pos].setApellido(apellido);
                    break;
                case 3:
                    System.out.println("DPI: ");
                    dpi = Double.parseDouble(lector.readLine());
                    alumnos[pos].setDPI(dpi);
                    break;
                case 4:
                    System.out.println("NIT: ");
                    nit = Double.parseDouble(lector.readLine());
                    alumnos[pos].setNIT(nit);
                    break;
            }
            System.out.println("--------------------");
            System.out.println("1.-Segir");
            System.out.println("2.-Salir");
            System.out.print("Ingrese opción: ");
            seguir = Integer.parseInt(lector.readLine());
        }
    }

    //metodo eliminarDatos
    public static void eliminarDatos(int pos) {
        for (int i = pos; i < cont; i++) {
            alumnos[i] = alumnos[i + 1];
        }
        System.out.println("Registro eliminado!");
        cont--;
    }

    //Metodo listar alumno
    private static void listarAlumno() {
        for (int i = 0; i < cont; i++) {
            System.out.println("\n\n--ALUMNOS REGISTRADOS--");
            System.out.println("" + alumnos[i].toString());
        }
    }
}
