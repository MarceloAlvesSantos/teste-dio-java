package desafio.java1;

//Abaixo segue um exemplo de c�digo que voc� pode ou n�o utilizar:

import java.io.IOException;
import java.util.Scanner;

public class Problem {
	
public static void main(String[] args) throws IOException {
  Scanner leitor = new Scanner(System.in);
		
   int cod1 = leitor.nextInt();
   int n1 = leitor.nextInt();
   double valor1 = leitor.nextDouble();
   
   int cod2 = leitor.nextInt();
   int n2 = leitor.nextInt();
   double valor2 = leitor.nextDouble();
		
//TODO: Implemente um C�lculo Simples.
//Levando em considera��o a sua preced�ncia de operadores e a defini��o de suas casas decimais:
		
  double total = n1 * valor1 + n2 * valor2;
  System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total)); 
  leitor.close();
//Apenas para utilizar os cod1 e cod2 e sair os avisos.
  System.out.println("\n\nCod1 = " + cod1 + "\nCod2 = " + cod2 );
 }
	
}
