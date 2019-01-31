package desarrollo.unidad1;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Programa03 {
public static void main (String args []){
Scanner leer = new Scanner (System.in);
String nombre;
int edad;
double estatura;
System.out.println ("Ingrese su nombre ");
nombre = leer.nextLine();
System.out.println ("Ingrese tu edad ");
edad = leer.nextInt();
System.out.println ("Ingresa tu estatura ");
estatura = leer.nextDouble();
System.out.println("Hola " + nombre + ", tu edad es de " + edad + " años" + " y tu estatura es de " + estatura);
}
}