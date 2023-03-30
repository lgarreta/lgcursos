import java.io.Serializable;

public class Estudiante implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Atributos
    String nombres;
    String apellidos;
    String fecha;
    String correoInst;
    String correo;
    long nroCelular;
    long nroFijo;
    String programa;

    // Constructor
    public Estudiante() {
        this.nombres = "Sin nombres";
        this.apellidos = "Sin apellidos";
        this.fecha = "Sin fecha";
        this.correoInst = "Sin correo";
        this.correo = "Sin correo";
        this.nroCelular = 0;
        this.nroFijo = 0;
        this.programa = "Sin programa";

    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCelular(long nroCelular) {
        this.nroCelular = nroCelular;
    }

    public void setFijo(long nroFijo) {
        this.nroFijo = nroFijo;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    /*
     * public Estudiante (String nombres, String correoInst, long nroCelular){
     * this.nombres = nombres; this.correoInstitucional = correoInst;
     * this.numeroCelular = nroCelular; }
     */
}