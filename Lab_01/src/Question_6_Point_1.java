/*The numbers in the sequence 1 1 2 3 5 8 13 21 ..... are called Fibonacci numbers.
  Write a program to generate and print first n Fibonacci numbers*/

package Lab_3;


import java.util.Scanner;

public class Question_6_Point_1 {
	
		public static void main(String[] args) {
			
		int a=0,b=1,c,n;
		
		Scanner KIM = new Scanner(System.in);
		
		System.out.println("Enter the value of n\n");
		n = KIM.nextInt();
		
			
		System.out.println(a);
		
		System.out.println(b);
		
		c=a+b;
		System.out.println(c);
		
		while(c<n)
			
		{
			
		a=b;
		b=c;
		c=a+b;
		System.out.println(c);
		
		}
		
		}

	}

