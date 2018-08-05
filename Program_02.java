 /* Write a program which will read a number from the 
    keyboard and display whether it is positive or 
    negative or zero */


import java.util.Scanner;

public class Program_02 {

	private static Scanner kb;

	public static void main(String[] args) {
		
		int num;
		
		kb = new Scanner(System.in);
		
		System.out.println("Enter any integer number: ");
		
		num= kb.nextInt();
		
		if(num>0)
			
			System.out.println("Number is Positive");
		
        if(num<0)
			
			System.out.println("Number is Negative");
		
        if(num==0)
	
	        System.out.println("It's Zero");


	}

}
