public interface DirectorioDAO {

    void agregarEstudiante(ModeloEstudiante e);
    void buscarEstudiante(String correoI);
    void modificarEstudiante(String correoI, String correoP, long numeroC, long numeroF, String programa);
    void eliminarEstudiante(String correoI);
    void mostrarDirectorio();
    void recuperarse();
    void guardarse();
}
