package procedimento_metodo_funcao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		media (8.5, 3.0, 9.0, 7.5);

	}
	
	
	public static void media (double n1, double n2, double n3, double n4) {
		 
		
		float media = (float) ((n1+n2+n3+n4)/4);
		
		System.out.println("Sua média foi: " +media);
		
		if (media < 7.0 ) {
			System.out.println("Reprovado!");
			
		}	else 
			System.out.println("Aprovado!");
		return;
		
		
		
	}
			
}
