package ejer16T6Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejer16T6Listas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//2, Array
		List<String> lista = new ArrayList<>();
		
		int cadena=7;
		for(int i=0;i<cadena;i++) {
			System.out.println("Introduce palabra: ");
			lista.add(entrada.nextLine());
			
		}
		System.out.println(lista);
		
		for(String palabra:lista) {
			int longitud=palabra.length();
			
			System.out.println("tiene: "+longitud);
		}
		
		
		
		
		
		
	}
}



