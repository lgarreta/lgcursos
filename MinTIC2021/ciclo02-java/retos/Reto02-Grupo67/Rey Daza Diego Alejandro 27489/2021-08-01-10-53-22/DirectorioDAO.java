/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alejo
 */
import java.util.ArrayList;

// 

// 

public class DirectorioDAO implements DirectorioDAOInterface
{
    ArrayList<Estudiante> miLista;
    
    public void crear() {
        this.miLista = new ArrayList<Estudiante>();
    }
    
    public void adicionar(final Estudiante e) {
        this.miLista.add(e);
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
    }
    
    public void eliminar(final String s) {
        for (int i = 0; i < this.miLista.size(); ++i) {
            final Estudiante o = this.miLista.get(i);
            if (s.equals(o.correoInstitucional)) {
                this.miLista.remove(o);
            }
        }
    }
    
    public ArrayList<Estudiante> obtenerTodos() {
        return this.miLista;
    }
}