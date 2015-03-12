package com.training;
import java.util.Scanner;


public class AccountTest {
	public static void main(String args[]) {
		Account acc1 = new Account(20.10);
		Account acc2 = new Account(-10.20); 
		
		System.out.printf("account1 balance:%.2f\n", acc1.getBalance());
		System.out.printf("account2 balance:%.2f\n", acc2.getBalance());
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter credit to Account1:");
		double crAcc1 = input.nextDouble(); 
		
		System.out.println("Adding credit to Acc1...");
		acc1.credit(crAcc1);
		
		System.out.printf("account1 balance:%.2f\n", acc1.getBalance());
		System.out.printf("account2 balance:%.2f\n", acc2.getBalance());
				
		System.out.print("Enter credit to Account2:");
		double crAcc2 = input.nextDouble(); 
		
		System.out.println("Adding credit to Acc2....");
		acc2.credit(crAcc2);
		
		System.out.printf("account1 balance:%.2f\n", acc1.getBalance());
		System.out.printf("account2 balance:%.2f\n", acc2.getBalance());
		
	}

}
