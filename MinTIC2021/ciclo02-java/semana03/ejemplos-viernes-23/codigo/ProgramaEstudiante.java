
import java.util.Scanner;
import java.util.ArrayList;

public class ProgramaEstudiante {
	public static void main (String args[]) {
		// Creación de un objeto lista parametrizado
		ArrayList <Estudiante> miLista = new ArrayList <Estudiante> ();

		// Creación de varios estudiantes
		Estudiante e1          = new Estudiante ("ana", 11);
		Estudiante e2          = new Estudiante ("lady", 22);
		Estudiante e3          = new Estudiante ("sofia", 33);
		Estudiante x           = new Estudiante ("luis", 44);
		Estudiante y           = new Estudiante ("andres", 99);
		Estudiante z           = new Estudiante ("oscar", 88);
		Estudiante maria       = new Estudiante ("maria", 77);
		Estudiante juan        = new Estudiante ("juan", 66);
		Estudiante pedro       = new Estudiante ("pedro", 55);
		Estudiante estudianteX = new Estudiante ("kamilo", 100);

		// Adicion de los anteriores estudiantes a la lista
		miLista.add (e1);
		miLista.add (e2);
		miLista.add (e3);
		miLista.add (x);
		miLista.add (y);
		miLista.add (z);
		miLista.add (maria);
		miLista.add (juan);
		miLista.add (pedro);
		miLista.add (estudianteX);

		// Muestra la lista recorriéndola usando iterador for desde el inicio hasta el fin
		System.out.println ("\nRECORRIDO: ");
		for (Estudiante e : miLista) {
    		e.presentarse ();
		}

		System.out.println ("\nADICION POR TECLADO: ");
		System.out.println ("Ingrese los datos de un estudiante desde teclado:");
		// Adicion de un estudiante leyendo datos desde el teclado
		// Leer desde teclado nombre y codigo
		Scanner lector = new Scanner (System.in);

		System.out.print ("Ingrese nombre: ");
		String nombreNuevo = lector.nextLine ();
		System.out.print ("Ingrese codigo: ");
		int    codigoNuevo = lector.nextInt ();

		Estudiante nuevo = new Estudiante (nombreNuevo, codigoNuevo);
		nuevo.presentarse ();

		miLista.add (nuevo);
		// Recorrido de una lista usando iterador for
		for (Estudiante e : miLista) {
			e.presentarse ();
		}

		System.out.println ("\nBUSQUEDA: ");
		// codigo se lee desde teclado
		System.out.println ("Digite el codigo: ");
		int codigoBuscar = lector.nextInt();

		for (Estudiante e : miLista) {
			if (e.getCodigo() == codigoBuscar) {
				System.out.println ("Lo encontre!!");
				e.presentarse();
				break;
			}
		}

		// codigo se lee desde teclado
		System.out.println ("\nREMOVER:");
		System.out.println ("Digite el codigo: ");
		codigoBuscar = lector.nextInt();

		for (int i = 0; i < miLista.size(); i++ ) {
			Estudiante e = miLista.get (i);
			if (e.getCodigo () == codigoBuscar) {
				miLista.remove (e);
				break;
			}
		}

		// Recorrido de una lista usando iterador for
		for (Estudiante e : miLista) {
			e.presentarse ();
		}

		System.out.println ("\nACTUALIZAR:");
		// Actualizar el nombre de un estudiante dado el código
		// codigo fijo
		System.out.print ("Digite el codigo: ");
		codigoBuscar = lector.nextInt();
		lector.nextLine ();
		System.out.print ("Ingrese el nuevo nombre: ");
		nombreNuevo = lector.nextLine ();

		// Recorrido de una lista usando iterador for
		for (Estudiante e : miLista) {
			e.presentarse ();
		}
			
		// Recorro la lista preguntando si los codigos son iguales
		for (Estudiante e : miLista) {
			if (e.getCodigo () == codigoBuscar) {
				// Encuentro la posición dentro de la lista
				int posicion = miLista.indexOf (e);
				// Modifico el objeto
				e.setNombre (nombreNuevo);
				// Actualizo la lista
				miLista.set (posicion, e);        
				break;
			}
		}
		System.out.println ("");

		// Recorrido de una lista usando iterador for
		for (Estudiante e : miLista) {
			e.presentarse ();
		}
	}
}

