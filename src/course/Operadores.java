package course;

public class Operadores {
	
		public static void main(String[] args) {
		
			int n3 = 17 % 3;
			double a = 1.0;
			double b = -3.0, c = -4.0;
			double x1 = ((-b + Math.sqrt(b*b - 4.0*a*c)))/(2.0 * a);
			
			System.out.println(x1);
			System.out.println(n3); 
			System.out.println("---------------------------------");
			
			//Operadores de Atribuição 
			
			System.out.println("Operadores de Atribuição");
			double n1 = 10;
			double n2 = 30;
			String s = "ABC";
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(s);
			System.out.println("---------------------------------");
			n1 *= 2; // 20
			n2 += n1; //50
			s += "DEF";
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(s);
			System.out.println("---------------------------------");
			
			int aaa = 10;
			int bbb = aaa++;
			
			System.out.println(aaa);
			System.out.println(bbb);
			
			System.out.println("---------------------------------");
			
			int ddd = 10;
			int eee = ++ddd;
			
			System.out.println(ddd);
			System.out.println(eee);
			
		}

}
