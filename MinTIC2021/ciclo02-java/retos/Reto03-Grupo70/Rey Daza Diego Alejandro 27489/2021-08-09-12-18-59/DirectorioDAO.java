/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alejo
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
// 

// 

public class DirectorioDAO implements DirectorioDAOInterface
{
    ArrayList<Estudiante> miLista;
    
    public void crear() {
        this.miLista = new ArrayList<Estudiante>();
        recuperarse();
    }
    
    public void adicionar(final Estudiante e) {
        this.miLista.add(e);
        guardarse();
    }
    
    public Estudiante buscar(final String s) {
        for (int i = 0; i < this.miLista.size(); ++i) {
            final Estudiante estudiante = this.miLista.get(i);
            if (s.equals(estudiante.correoInstitucional)) {
                return estudiante;
            }
        }
        return null;
    }
    
    public void actualizar(final String s, final Estudiante element) {
        for (int i = 0; i < this.miLista.size(); ++i) {
            if (s.equals(this.miLista.get(i).correoInstitucional)) {
                this.miLista.set(i, element);
            }
        }
        guardarse();
    }
    
    public void eliminar(final String s) {
        for (int i = 0; i < this.miLista.size(); ++i) {
            final Estudiante o = this.miLista.get(i);
            if (s.equals(o.correoInstitucional)) {
                this.miLista.remove(o);
            }
        }
       guardarse();
    }
    
    public ArrayList<Estudiante> obtenerTodos() {
        return (this.miLista);
          
      }
    
    private void recuperarse() {
        try {
            FileInputStream fis = new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream ois;
            ois = new ObjectInputStream(fis);
            int N = (int) ois.readObject();
            int i = 0;

            while (i < N) {
                Estudiante e = (Estudiante) ois.readObject();
                this.miLista.add(e);
                i++;
            }
            fis.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error");

        }
    }
    
    private void guardarse() {
        FileOutputStream fos = null;
        try {

            // Creación archivo para escribir flujo de datos binario
            fos = new FileOutputStream("datos_estudiantes.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            int N = miLista.size();
            oos.writeObject(N);
            for (int i = 0; i < N; i++) {
                Estudiante e = miLista.get(i);
                oos.writeObject(e);
            }
            oos.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Inicio. Archivo vacio");
        } catch (IOException ex) {
            System.out.println("Error lectura/escritura");
        }

    }
}
