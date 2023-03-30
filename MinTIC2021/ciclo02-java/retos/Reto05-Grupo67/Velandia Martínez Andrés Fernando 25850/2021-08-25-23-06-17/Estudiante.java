
public class Estudiante {
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String correoInstitucional;
    private String correoPersonal;
    private String celular;
    private String fijo;
    private String programa;

    public Estudiante() {
    }

   

    public Estudiante(String nombres, String apellidos, String fechaNacimiento, String correoInstitucional, String correoPersonal, String celular, String fijo, String programa) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correoInstitucional = correoInstitucional;
        this.correoPersonal = correoPersonal;
        this.celular = celular;
        this.fijo = fijo;
        this.programa = programa;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return    "Nombres: " + nombres + 
                "\nApellidos: " + apellidos + 
                "\nFecha nacimiento: " + fechaNacimiento + 
                "\nCorreo institucional: " + correoInstitucional + 
                "\nCorreo personal: " + correoPersonal + 
                "\nNúmero de teléfono celular: " + celular + 
                "\nNúmero de teléfono fijo: " + fijo + 
                "\nPrograma académico: " + programa + "\n";
    }

   
}
