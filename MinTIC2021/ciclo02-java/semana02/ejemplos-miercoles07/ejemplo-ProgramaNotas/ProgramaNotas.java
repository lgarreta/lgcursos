/*
Se requiere calcular las notas de dos materias: algebra y biologia. Cada materia tiene un porcentaje valor determinado de la nota final. Algebra vale el 70% y Biología el 30%. Lo que se requiere calcular el valor final de cada nota y la nota final que es la suma de las dos notas. Se debe mostrar un menú con las opciones:

(1) Para calcular nota algebra
(2) Para calcular nota biología
(3) Para calcular nota final
(0) Salir

Para calcular la nota debe solicitar al estudiante la nota que sacó y el programa debe hacer cálculo con el porcentaje y mostrar ese resultado.
*/

import java.util.Scanner; // Utilice la clase Scanner desde las librerias de java
public class ProgramaNotas {

    Scanner lector = new Scanner (System.in);


    public void mostrarMenu () {
        System.out.println ("----Opciones----");
        System.out.println ("1. Calcular nota definitiva de Algebra");
        System.out.println ("2. Calcular nota definitiva de Biologia");
        System.out.println ("3. Calcular nota final");
        System.out.println ("0. Salir");        
    }

    public int leerOpcion () {
        int opcion;
        System.out.println ("Ingrese opcion: ");
        
        opcion = lector.nextInt();

        return (opcion);
    }
}
