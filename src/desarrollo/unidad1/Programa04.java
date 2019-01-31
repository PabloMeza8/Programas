package desarrollo.unidad1;
import java.util.Scanner;
public class Programa04 {
public static void main (String args []){
	Scanner leer = new Scanner (System.in);
	int ed;
	System.out.println ("Ingrese su edad");
	ed = leer.nextInt();
	if (ed>=18){
		System.out.println ("Mayor de edad");
	}
	else {
		System.out.println ("Menor de edad");
	}
}
}