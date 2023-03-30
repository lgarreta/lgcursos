//package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import model.Estudiante;

public class EstudianteView {

    BufferedReader inPut = new BufferedReader(new InputStreamReader(System.in));

    // Menú
    public void menu() {
        print("INSTITUTO LA FLORESTA");
        print("Seleccione tarea a realizar:");
        print("1. Ingresar estudiante");
        print("2. Buscar estudiante");
        print("3. Modificar estudiante");
        print("4. Eliminar Estudiante");
        print("5. Ver directorio de estudiantes");
        print("6. Salir");
    }
    
    public void subMenuConsultas() {
        print("Consultas");
        print("Seleccione consulta a realizar:");
        print("1. Buscar estudiante por correo electrónico");
        print("2. Buscar estudiante por apellios");
        print("3. Buscar por programa");
        print("4. Buscar cantidad de estudiantes por programa");
        print("5. Buscar por fecha de nacimiento");
        print("6. Buscar por número de celular");
    }

    public int opcion(){
        int op = 0;
        print("Opción:\n");
        try {
            op = Integer.parseInt(inPut.readLine());
        } catch (Exception ex){
            print("El dato ingresado no es un número\n\nError: Opción no válida");
        }
        return op;
    }

    //Lectura de datos
    public Estudiante leerDatos(){
        Estudiante e = new Estudiante();
        try{            
            print("Ingresar estudiante");
            print("Ingresar nombres:\n");
            e.setNombre(inPut.readLine());
            print("Ingresar apellidos:\n");
            e.setApellido(inPut.readLine());
            print("Ingresar fecha de nacimiento (YYYY-MM-DD):\n");
            e.setFechaNaci(inPut.readLine());
            print("Ingresar correo institucional:\n");
            e.setCorreoInst(inPut.readLine());
            print("Ingresar correo personal:\n");
            e.setCorreoPers(inPut.readLine());
            try{
                print("Ingresar número de celular:\n");
                e.setNumeroCelular(Long.parseLong(inPut.readLine()));
            }catch(Exception err){
                e.setNumeroCelular(0);
                print("El dato ingresado no es un número");
            }
            try{
                System.out.println("Ingresar número fijo:\n");
                e.setNumeroFijo(Long.parseLong(inPut.readLine()));
            }catch(Exception err){
                e.setNumeroFijo(0);
                print("El dato ingresado no es un número");
            }
            print("Ingresar programa:\n");
            e.setPrograma(inPut.readLine());
        }catch(IOException ex){
            Logger.getLogger(EstudianteView.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return e;
    }

    public Estudiante leerDatosModificar(){
        Estudiante o = new Estudiante();
        try{
            print("Ingresar correo personal:\n");
            o.setCorreoPers(inPut.readLine());
            try{
                print("Ingresar número de celular:\n");
                o.setNumeroCelular(Long.parseLong(inPut.readLine()));
            }catch(Exception err){
                o.setNumeroCelular(0);
            }
            try{
                print("Ingresar número fijo:\n");
                o.setNumeroFijo(Long.parseLong(inPut.readLine()));
            }catch(Exception err){
                o.setNumeroFijo(0);
            }
            print("Ingresar programa:");
            o.setPrograma(inPut.readLine());
        }catch(IOException ex){
            Logger.getLogger(EstudianteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return o;
    }

    public String leerCorreo(){
        print("Ingresar correo institucional:\n");
        String correo = null;
        try {
            correo = inPut.readLine();
        } catch (IOException ex) {
            Logger.getLogger(EstudianteView.class.getName()).log(Level.SEVERE, null, ex);
        }

        return correo;
    }

    public String leerApellidos(){
        print("Ingresar apellidos:\n");
        String apellidos = null;
        try {
            apellidos = inPut.readLine();
        } catch (IOException ex) {
            Logger.getLogger(EstudianteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return apellidos;
    }
    
    public String leerPrograma(){
        print("Ingresar programa:\n");
        String programa = null;
        try {
            programa = inPut.readLine();
        } catch (IOException ex) {
            Logger.getLogger(EstudianteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return programa;
    }
    
    public String leerFecha(){
        print("Ingresar fecha de nacimiento:\n");
        String fecha = null;
        try {
            fecha = inPut.readLine();
        } catch (IOException ex) {
            Logger.getLogger(EstudianteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fecha;
    }
    
    public String leerNumero(){
        print("Ingresar número de celular:\n");
        String numero = "-1";
        try {
            long num = Long.parseLong(inPut.readLine());
            numero = String.valueOf(num);
        } catch (Exception ex) {
            print("El dato ingresado no es un número");
        }
        return numero;
    }

    //Impresión de datos
    public void mostrarEstudiante(Estudiante e, String campo, String dato){
        switch (campo){
            case "cInstitucional":
            case "apellido":
            case "fNacimiento":
            case "":
                print("Nombres: " + e.getNombre());
                print("Apellidos: " + e.getApellido());
                print("Fecha nacimiento: " + e.getFechaNaci());
                print("Correo institucional: " + e.getCorreoInst());
                print("Correo personal: " + e.getCorreoPers());
                print("Número de teléfono celular: " + e.getNumeroCelular());
                print("Número de teléfono fijo: " + e.getNumeroFijo());
                print("Programa académico: " + e.getPrograma() + "\n");
                break;
            case "programa":
                print(e.getApellido() + " " + e.getNombre() + "\n");
                break;
            case "celular":
                print(e.getApellido() + " " + e.getNombre() + " " + e.getPrograma() + "\n");
                break;
            case "cuenta":
                print("Cantidad estudiantes " + dato + ": " + e.getCuentaPrograma() + "\n");
                break;
            default:
                break;
        }
    }

    public void mostrarEstudiantes(ArrayList<Estudiante> es, String campo, String dato) {
        if(es.size() > 0){
            for (var i = 0; i < es.size(); i++) {
                Estudiante e = es.get(i);
                mostrarEstudiante(e, campo, dato);
            }
        } else{
            switch (campo){
                case "cInstitucional":
                    print("El estudiante no se encuentra registrado en el instituto\n");
                    break;
                case "apellido":
                case "programa":
                case "fNacimiento":
                case "celular":
                    print("No hay resultados para esa consulta\n");
                    break;
                case "cuenta":
                    print("Cantidad estudiantes " + dato + ": 0");
                    break;
                case "":
                    print("No hay registros por el momento\n");
                    break;
                default:
                    break;
            }
        }
        
    }
    
    public void print(String msm){
        System.out.println(msm);
    }
}
