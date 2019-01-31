package desarrollo.unidad1;

import java.util.Scanner;

public class Programa13 {
	public static void main (String args []){
Scanner leer = new Scanner (System.in);
int np,i, a=0, c=0;
String n;
System.out.println ("Ingrese el total de números");
np = leer.nextInt();
do{
for (i=0; c<=np; i=i+2){
	a+=i;
	System.out.println(a);
	c++;
}
System.out.println("La suma de los números es: " + a);
System.out.println("¿Desea ingresar más números?");
n=leer.next();
}while (n=="si");
}
}