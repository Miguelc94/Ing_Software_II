package software2.calculadora;

import java.util.Scanner;

public class Main {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System .in);
		Calcular c = new Calcular();
		System.out.println("Ingrese la operación");
		String operar = sc.next();
		System.out.println("El resultado es: " + c.operacion(operar));
		sc.close();
	}
}
