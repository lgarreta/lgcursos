//package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import model.Estudiante;

public class EstudianteView {

    BufferedReader inPut = new BufferedReader(new InputStreamReader(System.in));

    public void menu() {
        System.out.println("INSTITUTO LA FLORESTA");
        System.out.println("Seleccione tarea a realizar:");
        System.out.println("1. Ingresar estudiante");
        System.out.println("2. Buscar estudiante");
        System.out.println("3. Modificar estudiante");
        System.out.println("4. Eliminar Estudiante");
        System.out.println("5. Ver directorio de estudiantes");
        System.out.println("6. Salir");
    }

    public int opcion() throws IOException {
        int op = 0;
        System.out.println("Opción:\n");
        try {
            op = Integer.parseInt(inPut.readLine());
        } catch (IOException e) {
            System.out.println("Opción no válida");
        }
        return op;
    }

    public Estudiante leerDatos() throws IOException {
        Estudiante e = new Estudiante();

        System.out.println("Ingresar estudiante");
        System.out.println("Ingresar nombres:\n");
        e.setNombre(inPut.readLine());
        System.out.println("Ingresar apellidos:\n");
        e.setApellido(inPut.readLine());
        System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):\n");
        e.setFechaNaci(inPut.readLine());
        System.out.println("Ingresar correo institucional:\n");
        e.setCorreoInst(inPut.readLine());
        System.out.println("Ingresar correo personal:\n");
        e.setCorreoPers(inPut.readLine());
        try{
            System.out.println("Ingresar número de celular:\n");
            e.setNumeroCelular(Long.parseLong(inPut.readLine()));
        }catch(Exception err){
            e.setNumeroCelular(0);
        }
        try{
            System.out.println("Ingresar número fijo:\n");
            e.setNumeroFijo(Long.parseLong(inPut.readLine()));
        }catch(Exception err){
            e.setNumeroFijo(0);
        }
        System.out.println("Ingresar programa:\n");
        e.setPrograma(inPut.readLine());

        return e;
    }

    public void mostrarEstudiante(Estudiante e) {
        System.out.println("Nombres: " + e.getNombre());
        System.out.println("Apellidos: " + e.getApellido());
        System.out.println("Fecha nacimiento: " + e.getFechaNaci());
        System.out.println("Correo institucional: " + e.getCorreoInst());
        System.out.println("Correo personal: " + e.getCorreoPers());
        System.out.println("Número de teléfono celular: " + e.getNumeroCelular());
        System.out.println("Número de teléfono fijo: " + e.getNumeroFijo());
        System.out.println("Programa académico: " + e.getPrograma() + "\n");
    }

    public Estudiante leerDatosModificar() throws IOException {
        Estudiante o = new Estudiante();

        System.out.println("Ingresar correo personal:\n");
        o.setCorreoPers(inPut.readLine());
        try{
            System.out.println("Ingresar número de celular:\n");
            o.setNumeroCelular(Long.parseLong(inPut.readLine()));
        }catch(Exception err){
            o.setNumeroCelular(0);
        }
        try{
            System.out.println("Ingresar número fijo:\n");
            o.setNumeroFijo(Long.parseLong(inPut.readLine()));
        }catch(Exception err){
            o.setNumeroFijo(0);
        }
        System.out.println("Ingresar programa:");
        o.setPrograma(inPut.readLine());

        return o;
    }

    public void mostrarEstudiantes(ArrayList<Estudiante> es) {
        for (var i = 0; i < es.size(); i++) {
            Estudiante e = es.get(i);
            mostrarEstudiante(e);
        }
    }

    public String leerCorreo() throws IOException {
        System.out.println("Ingresar correo institucional:\n");
        String correo = inPut.readLine();

        return correo;
    }

    public void msmBuscar() {
        System.out.println("Buscar estudiante");
    }

    public void msmModificar() {
        System.out.println("Modificar estudiante");
    }

    public void msmEliminar() {
        System.out.println("Eliminar estudiante");
    }

    public void msmCreado() {
        System.out.println("Se agregó el estudiante\n");
    }

    public void msmModificado() {
        System.out.println("Se modificó el estudiante\n");
    }

    public void msmEliminado() {
        System.out.println("Se eliminó el estudiante\n");
    }

    public void msmEstudiante() {
        System.out.println("Información del estudiante:");
    }

    public void msmListado() {
        System.out.println("El directorio de los estudiantes\n");
    }

    public void msmBye() {
        System.out.println("Hasta pronto");
    }
}
