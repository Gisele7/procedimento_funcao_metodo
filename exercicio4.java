package procedimento_metodo_funcao;

public class exercicio4 {

	
		
		public static void conta (int x, int y , String a) {
			
			
			if (a != "+" && a != "-" && a != "*" && a != "/") {
			
				System.out.println("Operador inválido");
			}
			else if (a == "+") {
				int soma = x + y;
				System.out.println("A soma entre os dois números é: " +soma);
			}
		
			else if (a == "-") {
				int sub = x - y;
				System.out.println("A subtração entre os dois números é: " +sub);
			}
			else if (a == "*") {
				int mult = x * y;
				System.out.println("A multiplicação entre os dois números é: " +mult);
			}
			
				else if (a == "/") {
					int div = x / y;
					System.out.println("A divisão entre os dois números é: " +div);
				}	
			
		}
			
			public static void main(String[] args) {
				
				conta(100, 20 , "*");
				
		
	}		

	}
