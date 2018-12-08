package if_else;
import java.util.Scanner;


public class Quadrante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if (a == 0 && b == 0) {
			System.out.println("Coordenada pertence à origem");
		}
		else if (a < 0 && b < 0) {
			System.out.println("Coordenada pertence ao quadrante Q3!");
		}
		else if (a < 0 && b > 0) {
			System.out.println("Coordenada pertence ao quadrante Q2!");
		}
		else if (a > 0 && b > 0) {
			System.out.println("Coordenada pertence ao quadrante Q1!");
		}
		else  {
			System.out.println("Coordenada pertence ao quadrante Q4!");
		}
	sc.close();
	}

}
