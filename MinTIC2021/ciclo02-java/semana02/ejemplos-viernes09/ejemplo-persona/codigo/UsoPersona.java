public class UsoPersona {
    public static void main (String args []) {
        Persona desconocido;
        desconocido = new Persona ("maria", 33, "A+");
        desconocido.presentarse ();

        Persona jorge = new Persona ("jorge", 22, "O-");
        jorge.presentarse ();

        Persona juan = new Persona ();
        juan.leerDatos ();
        juan.presentarse ();

        float ganancia = juan.trabajar (10, 5500);
        System.out.println ("Juan ganó: " + ganancia);

    }
}