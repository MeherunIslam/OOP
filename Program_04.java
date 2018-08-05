/* Write a program to select and print the largest/smallest of the three numbers using simple 
   if / nested if / if…else if…else statement */

import java.util.Scanner;

public class Program_04 {

	private static Scanner kb;
	
	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		kb= new Scanner(System.in);
		
		System.out.println("Enter Three Integers: ");
		
		n1= kb.nextInt();
		
		n2= kb.nextInt();
		
		n3= kb.nextInt();
		
		if((n1>n2)&&(n1>n3))
			
			System.out.println("First Number is Largest");
		
		else if(n2>n3)
			
			System.out.println("Second Number is Largest");
		
		else
			
			System.out.println("Third Number is Largest");
		
        if((n1<n2)&&(n1<n3))
			
			System.out.println("First Number is Smallest");
		
		else if(n2<n3)
			
			System.out.println("Second Number is Smallest");
		
		else
			
			System.out.println("Third Number is Smallest");
			
	}

}
