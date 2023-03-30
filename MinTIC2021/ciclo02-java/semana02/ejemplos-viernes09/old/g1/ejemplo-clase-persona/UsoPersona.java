public class UsoPersona {
    public static void main (String argumentos []) {
        Persona usuarioMaria;           // Declaracion
        usuarioMaria = new Persona () ; // Construyo o instancio
        usuarioMaria.leerDatos ();        
        usuarioMaria.presentarse ();

        Persona jorge = new Persona ("Jorge Z.", 44, "A+");
        jorge.presentarse ();

        float caloriasJorge = jorge.caminar (10, 20);
        System.out.println ("Jorge gasto en calorias: " + caloriasJorge);

    }    
}
