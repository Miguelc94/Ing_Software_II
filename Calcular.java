package software2.calculadora;

public class Calcular extends Operaciones {
	
	public double operacion(String operacion){
		String[] numeros = operacion.split("[*,/,+,-]");
		String[] operadores = operacion.split("[0-9]");
		int[] number = new int[50];
		for(int i = 0; i < numeros.length; i++ ){
			number[i] = Integer.parseInt(numeros[i]);
		}
		double total = number[0];
		int i =1;
		for(int j = 0; j < operadores.length; j++){
			if(operadores[j].equals("+")){
				total = sumar(total, number[i]);
				i++;
			}else if(operadores[j].equals("-")){
				total = restar(total, number[i]);
				i++;
			}else if(operadores[j].equals("*")){
				total = multiplicar(total, number[i]);
				i++;
			}else if(operadores[j].equals("/")){
				total = dividir(total, number[i]);
				i++;
			}
		}
		System.out.println("El resultado es: " + total);
		return total;
	}
}
