package procedimento_metodo_funcao;

public class exercicio4 {

	
		
		public static void conta (int x, int y , String a) {
			
			
			if (a != "+" && a != "-" && a != "*" && a != "/") {
			
				System.out.println("Operador inv�lido");
			}
			else if (a == "+") {
				int soma = x + y;
				System.out.println("A soma entre os dois n�meros �: " +soma);
			}
		
			else if (a == "-") {
				int sub = x - y;
				System.out.println("A subtra��o entre os dois n�meros �: " +sub);
			}
			else if (a == "*") {
				int mult = x * y;
				System.out.println("A multiplica��o entre os dois n�meros �: " +mult);
			}
			
				else if (a == "/") {
					int div = x / y;
					System.out.println("A divis�o entre os dois n�meros �: " +div);
				}	
			
		}
			
			public static void main(String[] args) {
				
				conta(100, 20 , "*");
				
		
	}		

	}
