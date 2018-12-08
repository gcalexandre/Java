package course;

public class Operadores_lógicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// && = E ; || = OU ; ! = NÃO
		
		// Precedência : ! > && > ||
		
		boolean c1 = 2 > 3;
		boolean c2 = 2 > 3 || 4!= 5;
		boolean c3 = !(2>3) && 4 != 5;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("------------------");
		
		boolean c5 = c1 || c2 && c3;
		System.out.println(c5);
	}

}
