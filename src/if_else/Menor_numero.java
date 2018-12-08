package if_else;
import java.util.Scanner;

public class Menor_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < c) {
			System.out.println("Menor = " + a);
			}
		else if (b < c) {
			System.out.println("Menor = " + b);
			}
		else {
			System.out.println("Menor = " + c);
		}
			
		sc.close();

	}

}
