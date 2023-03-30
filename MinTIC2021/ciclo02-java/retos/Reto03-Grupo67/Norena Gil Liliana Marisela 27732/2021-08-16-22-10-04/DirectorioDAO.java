import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos
    ArrayList <Estudiante> listaEstudiantes;

    // Metodos
    public void crear () {
        // Inicializa el DAO creando la lista;
        listaEstudiantes = new ArrayList<Estudiante> ();
        recuperarse();
    }
    
    public void ingresar (Estudiante e) {
        // Adiciona el estudiante "e" al DAO, es decir a la lista
        listaEstudiantes.add (e);
        guardarse();
    }
    
    public Estudiante buscar (String correoInst) {
        // Busca en el DAO el estudiante que tenga el correo igual a "correoInst"
        
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
                return (e);
        }
        return (null);
    }
    
    public void modificar (String correoInst, Estudiante nuevo) {
        // Busca en el DAO el estudiante que tenga el correo igual al "correoInst" 
       // Estudiante e = buscar(correoInst);
        // y lo cambia por el "nuevo" que llega
        //e = nuevo;
        System.out.println ("Se modificó el estudiante");
        guardarse();
    }
    public void eliminar (String correoInst){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa

        Estudiante e = buscar(correoInst);
        listaEstudiantes.remove(e);
      
        guardarse();

    }
    public ArrayList<Estudiante> obtenerTodos (){
        // Retorna una lista con todos los estudiantes
        return (listaEstudiantes);
    }

    public void recuperarse(){

        // Lectura de archivo con datos binario
        FileInputStream fos;

        try {
            fos = new FileInputStream ("estudiante.dat");
            ObjectInputStream  ois = new ObjectInputStream(fos);

            //Leyendo tamaño de lista
            int size = (int) ois.readObject();

            for (int i=0; i < size; i++) {
                Estudiante e = (Estudiante) ois.readObject();
               listaEstudiantes.add(e);
            }

            // Cierro el flujo
            ois.close ();
        
        } catch (IOException | ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

    public void guardarse (){
       
        // Creación archivo para escribir flujo de datos binario
        FileOutputStream fos;

        try {
            fos = new FileOutputStream ("estudiante.dat");
            ObjectOutputStream oos = new ObjectOutputStream (fos);

            //Guardando tamaño
            oos.writeObject(listaEstudiantes.size());

            for (int i=0; i < listaEstudiantes.size (); i++) {
                Estudiante e = listaEstudiantes.get (i);
                // Escritura con metodo writeObject
                oos.writeObject(e);
            }
    
            // Cierro el flujo
            oos.close ();
          
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }


  
    
}


