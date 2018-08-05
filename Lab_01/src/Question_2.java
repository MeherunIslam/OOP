/*Write a program to compute the sum of n consecutive numbers 
  i.e. starting from 1 using for/while/do....while loop.*/

package Lab_3;

import java.util.Scanner;

public class Question_2 {

		public static void main(String[] args) {
			
		Scanner KIM = new Scanner(System.in);
			
		System.out.println("Enter the first number of consecutive number: ");
		int a = KIM.nextInt();
		
		System.out.println(" ");
		
		System.out.println("Enter the value of n: ");
		int n = KIM.nextInt();
		
		System.out.println(" ");
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			
			System.out.print(a);
			
			if (i!=n)
		System.out.print(", ");
		
			sum = sum + a;
			
			a++;

		}
		System.out.println(" ");

		System.out.println("\nThe summation is: "+sum);

		
		}

	}

