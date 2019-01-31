package desarrollo.unidad1;
import java.util.Scanner;
public class Programa05 {
public static void main (String args []){
	Scanner leer = new Scanner (System.in);
	int cal;
	System.out.println ("Ingrese su calificación");
	cal = leer.nextInt();
	if (cal>=80){
		System.out.println ("Aprobado");
	}
	else {
		System.out.println ("Reprobado");
	}
}
}