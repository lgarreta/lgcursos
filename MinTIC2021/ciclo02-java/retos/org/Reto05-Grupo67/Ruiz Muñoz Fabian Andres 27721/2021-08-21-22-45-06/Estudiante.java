public class Estudiante {
    String nombres;
    String apellidos;
    long   fechaNacimiento;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroFijo;
    String programaAcademico;

    public Estudiante(){
        this.nombres="Sin nombres";
        this.correoInstitucional="Sin correo";
        this.numeroCelular=0;
        this.apellidos="Sin apellido";
        this.fechaNacimiento="Sin fechaNacimiento";
        this.correoPersonal="Sin correopersonal";
        this.numeroFijo = 0;
        this.programaAcademico ="Sin programaAcademico";
    }
    public Estudiante(String nombres,String apellidos,long fechaNacimiento,String correoInst,String correoPersonal,long nroCelular,long nroFijo,String programaAcademico){
        this.nombres=nombres;
        this.correoInstitucional=correoInst;
        this.numeroCelular=nroCelular;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correoPersonal = correoPersonal;
        this.numeroFijo = nroFijo;
        this.programaAcademico = programaAcademico;
    }
}
