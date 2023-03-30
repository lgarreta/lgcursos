
import java.sql.SQLException;

public class RetoProgramaDirectorio {
    public static void main(String[] args) throws SQLException {
        try {
            Controlador ctrl = new Controlador();
            ctrl.iniciar();
            System.out.println("Hola");
        } catch(ClassNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        }
    }
}
