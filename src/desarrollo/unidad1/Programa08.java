package desarrollo.unidad1;
import java.util.Scanner;
public class Programa08 {
	public static void main (String args []){
		Scanner leer = new Scanner (System.in);
		int dia;
		System.out.println ("Escribe un n�mero del 1 al 7");
		dia = leer.nextInt();
		switch (dia)
		{
		case 1: 
			System.out.println ("Domingo");
			break;
		case 2:
			System.out.println ("Lunes");
			break;
		case 3: 
			System.out.println ("Martes");
			break;
		case 4:
			System.out.println ("Mi�rcoles");
			break;
		case 5: 
			System.out.println ("Jueves");
			break;
		case 6:
			System.out.println ("Viernes");
			break;
		case 7:
			System.out.println ("Domingo");
			break;
			default:
				System.out.println ("NO INGRESO UN N�MERO DEL 1 AL 7");
				break;
			
		}
	}

}