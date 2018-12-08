package if_else;
import java.util.Scanner;

public class Expressao_condicional_ternaria {

	/* 
	 Sitntaxe:
	  
	( condição ) ? Valor_se_verdadeo : valor_se_falso
	
	*/
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco *0.05;
		
		System.out.println(desconto);;
		
		sc.close();
		
		
	}

}
