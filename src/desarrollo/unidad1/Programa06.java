package desarrollo.unidad1;
import java.util.Scanner;
public class Programa06 {
public static void main (String args []){
	Scanner leer = new Scanner (System.in);
	int num;
	System.out.println ("Ingrese un número entero");
	num = leer.nextInt();
	if (num%2 == 0){
		System.out.println ("Par");
	}
	else {
		System.out.println ("Impar");
	}
}
}