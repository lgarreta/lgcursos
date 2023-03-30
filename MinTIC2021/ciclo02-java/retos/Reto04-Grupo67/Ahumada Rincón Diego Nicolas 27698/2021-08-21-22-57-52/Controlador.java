public class Controlador {

    private ModeloEstudiante model = new ModeloEstudiante();
    private Directorio directorio = new Directorio();
    private Vista view = new Vista(model, directorio);


    public void iniciar(){
        while (true){
            view.mostrarMenu();
            int opcion = view.leerOpcion();
            if (opcion == 1){
                ModeloEstudiante e = view.leerDatosNuevoEstudiante();
                directorio.agregarEstudiante(e);
            }else if (opcion == 2){
                view.leerDatosBuscarEstudiante();
            }else if (opcion == 3){
                view.leerDatosModificarEstudiante();
            }else if (opcion == 4){
                view.leerDatosEliminarUsuario();
            }else if (opcion == 5){
                view.mostrarDirectorioEstudiantes();
            }else if (opcion == 6){
                System.out.println("Hasta pronto");
                break;
            }else {
                System.out.println("No es una opción valida");
            }
        }
    }


}

