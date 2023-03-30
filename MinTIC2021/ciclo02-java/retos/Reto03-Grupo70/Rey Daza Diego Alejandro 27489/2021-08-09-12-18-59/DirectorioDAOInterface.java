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
public interface DirectorioDAOInterface
{
    void crear();
    
    void adicionar(final Estudiante p0);
    
    Estudiante buscar(final String p0);
    
    void actualizar(final String p0, final Estudiante p1);
    
    void eliminar(final String p0);
    
    ArrayList<Estudiante> obtenerTodos();
}