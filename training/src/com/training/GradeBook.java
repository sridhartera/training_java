package com.training;
import java.util.Scanner;


public class GradeBook {
	private String courseName;
	
	public GradeBook(String name){
		courseName = name;
	}
	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public void displayMessage(String courseName){
		System.out.printf("Welcome to Grade Book\n%s!!", getCourseName());
	}
	
	public void determineClassAverage(){
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		double avg = 0.0;
		int inc = 0;
		int grade;
		System.out.println("Enter value or -1 to quit grade:");
		grade = input.nextInt();
		
		while(grade != -1){
			total = total + grade;
			inc++;
			System.out.println("incr:"+inc);
			
			System.out.printf("Enter value or -1 to quit grade%d:", inc+1);
			grade = input.nextInt();
						
		}
		if(inc != 0){
			avg = (double)total/inc;
		}
		else{
			System.out.println("grade is not entered");
		}
		
		System.out.printf("Sum of all grades:%d\n", total);
		System.out.printf("Avg of all grades:%f\n", avg);
		
	}

}
