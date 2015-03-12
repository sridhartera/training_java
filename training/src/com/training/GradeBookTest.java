package com.training;
import java.util.Scanner;

@SuppressWarnings("unused")
public class GradeBookTest {
	public static void main(String args[]) {
		//create obj for scanner
		//Scanner sc = new Scanner(System.in);
		
		//create GB obj and call constructor
		GradeBook gb1 = new GradeBook("CS101 Java");
		//GradeBook gb2 = new GradeBook("CS102 Adv Java");
		
		/*
		 GradeBook gb = new GradeBook();
		 System.out.print("Enter a course name:");
		String cName = sc.nextLine();	
		gb.setCourseName(cName);
		gb.displayMessage(cName);
		*/
		
		System.out.printf("grade book1 course name is:%s!! \n", gb1.getCourseName());
		//System.out.printf("grade book2 course name is:%s!! \n", gb2.getCourseName());
		
		gb1.determineClassAverage();
		
	}

}
