import java.util.ArrayList;
public class Controlador {
    VistaMenu miVista = new VistaMenu ();
    DirectorioDAO miDAO = new DirectorioDAO();

    public Controlador() {
         miDAO.crear();
    }
    public void iniciar() {
        while(true) {
            miVista.mostrarMenu();
            int opcion = miVista.leerOpcion();

            switch (opcion) {
                case 1: adicionar (); break;
                case 2: buscar (); break ;
                case 3: eliminar(); break ;
                case 4: modificar(e); break;
                case 5: ver(); break;
                case 6: salir(); break;
                
            }          
                
        }
    
    }

    public void adicionar(Estudiante e){
        System.out.println("Esta adicionando... ");
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar(e);
        
    }
    public void buscar(){
        System.out.println("Esta buscando... ");
        String correo = miVista.leerCorreoInstitucional ();
        Estudiante e = miDAO.buscar(correo);
        miVista.mostrarEstudiante (e);
    
    }
    public void eliminar(String correoInst){
        System.out.println("Esta eliminando... ");
        String correo = miVista.leerCorreoInstitucional ();
        miDAO.eliminar (correo);
    }
    public void actualizar(){
        System.out.println("Esta modificando... "); 
        String correoInst = miVista.leerCorreoInstitucional();
        Estudiante nuevo = miDAO.Buscar(correoInst);
        miDao.actualizar(correoInst, nuevo);
    
    }   
    public void ver(){
        System.out.println("Esta viendo directorio... "); 
        ArrayList <Estudiante> miLista = miDAO.obtenerTodos();

        for(int i = 0; i = miLista.size(); i++){
            Estudiante e = miLista.get(i);
            miVista.mostrarEstudiante(e);
        
        }
    }
    public void salir(){
        System.out.println("hasta pronto... ");  
        System.exit(0);  
    }
}
