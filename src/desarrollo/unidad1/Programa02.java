package desarrollo.unidad1;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Programa02 {
public static void main (String args []){
	Scanner leer = new Scanner (System.in);
	System.out.println ("Ingrese su nombre ");
	String nombre;
	nombre = leer.nextLine();
	System.out.println("Hola " + nombre);
}
}
