package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Student_pass_or_failed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Student student = new Student();
		System.out.println(" Enter the student's name and quarterly grade: ");
		System.out.print("name : ");
		student.name = sc.nextLine();
		
		System.out.print("Note1: ");
		student.note1 = sc.nextDouble();
		
		System.out.print("Note2: ");
		student.note2 = sc.nextDouble();
		
		System.out.print("Note3: ");
		student.note3 = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Final Grade: %.2f%n", student.finalGrade());
		
		sc.close();
		
		if(student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf( "MISSING %.2f POINTS%n", student.missingPoints());
		}
		else {
			System.out.println("PASS");
				
		}
		
		
		}
		
		
		
	}


