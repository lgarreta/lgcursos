// Estudiante.java
public class Estudiante {
    // Atributos
    private String nombre;
    private int codigo;
    
    // Constructor
    public Estudiante (String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public void presentarse () {
        System.out.println ("Mi nombre es: " + nombre + " y mi codigo es: " + codigo);
    }
    
    public int getCodigo () {
        return (codigo);
    }
    
    public void setNombre (String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
} 
