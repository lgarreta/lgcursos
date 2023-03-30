

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos de la conexion
    static final String BD_URL = "jdbc:sqlite:bd_estudiantes.db";
    
    // Objetos para conectarse a la Base Datos
    Connection conexion;
    Statement sentencia;
    ResultSet resultados;
    
    
    // Metodos
    
    public void  crear () {
        try {            
            Class.forName("org.sqlite.JDBC");
            // Abre la conexion
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = conexion.createStatement();
            
        }catch (SQLException exc) {
            System.out.println("Error SQL");
            exc.printStackTrace ();
            System.exit(1);
        }catch (ClassNotFoundException exc) {
            System.out.println("Error de clase no encontrada");
            exc.printStackTrace();
            System.exit(1);
        }   
    }
    
    public void adicionar (Estudiante e) {
        try {
            //Adiciona el estudiante "e" al DAO (A la lista)
            //Crear la cadena "insert into "
            //Ejecutar con executeQuery
            String consulta = String.format (
                    "INSERT INTO estudiantes VALUES ('%s','%s','%s','%s','%s',%s,%s,'%s')",
                    e.nombres, e.apellidos, e.fechaNacimiento, e.correoInstitucional, e.correoPersonal, e.numeroCelular, e.numeroFijo, e.programaAcademico
            );
            //String cadena = "("+"'"+ e.nombres +"',"+"'"+ e.apellidos +"',"+"'"+ e.fechaNacimiento +"',"+"'"+ e.correoInstitucional +"',"+"'"+ e.correoPersonal +"',"+"'"+ e.numeroCelular +"',"+"'"+ e.numeroFijo +"',"+"'"+ e.programaAcademico +"',)";
            //String consulta = "INSERT INTO estudiantes VALUES" + cadena ;
            
            System.out.println(consulta);
            sentencia.executeUpdate (consulta);
        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Busca dentr
    public Estudiante buscar (String correoInst) {
        Estudiante e = null;
        try {
            String cadena = "'"+ correoInst +"'";
            String consulta = "SELECT * from estudiantes WHERE correoInst == " + cadena;
            resultados = sentencia.executeQuery(consulta);
            while (resultados.next()){
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNacimiento = resultados.getString("fechaNaci");
                String correoInstitucional = resultados.getString("correoInst");
                String correoPersonal = resultados.getString("correoPers");
                Long numeroCelular = resultados.getLong("numeroCel");
                Long numeroFijo = resultados.getLong("numeroFijo");
                String programaAcademico = resultados.getString("progAcade");
                
                e = new Estudiante (nombres, apellidos, fechaNacimiento, correoInstitucional, correoPersonal, numeroCelular,
                numeroFijo, programaAcademico);   
            }
        } catch (SQLException ex) {
            System.out.println("Estudiantes no encontrados");
        }
        return (e);
      
       
    }
                    
    /**public void eliminar (String correoInst) {
        for (int i=0; i < listaEstudiantes.size(); i++){
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
               
            listaEstudiantes.remove(i);
            System.out.println ("Se eliminó el estudiante");
        }
        
    }*/
        
    public void modificar (String correoInst, Estudiante nuevo) {
        try {
            String consulta = String.format("UPDATE estudiantes SET nombres='%s', apellidos='%s',fechaNacimiento='%s', correoInstitucional='%s', correoPersonal='%s', numeroCelular=%s, numeroFijo=%s, programaAcademico='%s'",
                    nuevo.nombres, nuevo.apellidos, nuevo.fechaNacimiento, nuevo.correoInstitucional, nuevo.correoPersonal, nuevo.numeroCelular, nuevo.numeroFijo, nuevo.programaAcademico);
            
            sentencia.executeUpdate (consulta);
            System.out.println(consulta);
            
            
            //System.out.println ("");
            //for (int i=0; i < listaEstudiantes.size(); i++){
            // Estudiante e = listaEstudiantes.get (i);
            //if (correoInst.equals (e.correoInstitucional))
            //listaEstudiantes.set(i,nuevo);
            //}
        } catch (SQLException ex) {
            System.out.println("No se actualizo la base de datos");
        }
    }
    
    
    public ArrayList <Estudiante> obtenerTodos () {
        
        ArrayList <Estudiante> listaEstudiantes = new ArrayList <Estudiante> ();
        try {
            
            
            String consulta = "SELECT * from estudiantes";
            resultados = sentencia.executeQuery(consulta);
            
            while (resultados.next()) {
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNacimiento = resultados.getString("fechaNaci");
                String correoInstitucional = resultados.getString("correoInst");
                String correoPersonal = resultados.getString("correoPers");
                Long numeroCelular = resultados.getLong("numeroCel");
                Long numeroFijo = resultados.getLong("numeroFijo");
                String programaAcademico = resultados.getString("progAcade");
                
                Estudiante e = new Estudiante (nombres, apellidos, fechaNacimiento, correoInstitucional, correoPersonal, numeroCelular,
                        numeroFijo, programaAcademico);
                listaEstudiantes.add (e);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println ("");
         return (listaEstudiantes);
    }

    @Override
    public void eliminar(String correoInst) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    


       /** private void recuperarse() {
        try{
        
            FileInputStream fis = new FileInputStream ("datos_estudiantes.dat");
            ObjectInputStream ois = new ObjectInputStream (fis);

            int N = (int)ois.readObject();
            for (int i=0; i<N; i++);{
                Estudiante e =(Estudiante) ois.readObject();
                listaEstudiantes.add(e);
            }
            ois.close();
        }catch (FileNotFoundException exc) {
            System.out.println("Esta en 0 el archivo");
        }catch (IOException exc) {
            System.out.println("Error lectura/escritura  conversion error **");
        }catch (ClassNotFoundException exc){
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE,null, exc);
        }
    }


    

    private void guardarse () {
    FileOutputStream fos = null;
        try{
            fos = new FileOutputStream ("datos_estudiantes.dat");
                ObjectOutputStream oos = new ObjectOutputStream (fos);

                int N = listaEstudiantes.size ();
                oos.writeObject (N);
                for (int i= 0; i<N; i++) {
                    Estudiante e = listaEstudiantes.get (i);
                    oos.writeObject (e);
                 }
                 oos.close();
            }catch (FileNotFoundException exc) {
                System.out.println("Inicio Archivo en 0");
            }catch (IOException exc) {
                System.out.println("Error lectura/escritura");
            }
    }*/
}

                