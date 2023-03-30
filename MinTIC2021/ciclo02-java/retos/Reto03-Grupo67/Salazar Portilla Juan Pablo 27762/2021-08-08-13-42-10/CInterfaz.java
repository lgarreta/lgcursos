//package Reto;

import java.util.ArrayList;

public interface CInterfaz {
    
    public void crear();
    public void adicionar(CEstudiante fEstudiante);
    public CEstudiante buscar(String fCorreoInstitucional);
    public void eliminar(String fCorreoInstitucional);
    public void actualizar (String fCorreoInstitucional, CEstudiante fEstudiante);
    public ArrayList <CEstudiante> obtenerTodos();
}
