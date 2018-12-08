package if_else;

import java.io.IOException;

public class Switch_case {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Concorda ou não? (s/n) ");

		char c = (char) System.in.read();

		switch (c) {
		case 's':
			System.out.println("Concorda");
			break;
		case 'n':
			System.out.println("Não concorda");
			break;
		default:
			System.out.println("Resposta inválida");
			break;
		}
	}

}
