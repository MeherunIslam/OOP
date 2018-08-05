/*Write a program to print n consecutive numbers i.e.1, 2, 3 , .....n 
  using for/while/do....while loop.*/

package Lab_3;

import java.util.Scanner;

public class Question_1 {

			public static void main(String[] args) {
			
		Scanner KIM = new Scanner(System.in);
			
		System.out.println("Enter the first number of consecutive number: ");
		int a = KIM.nextInt();
		
		System.out.println(" ");
		
		System.out.println("Enter the value of n: ");
		int n = KIM.nextInt();
		
		System.out.println(" ");
		
		for(int i=1; i<=n; i++) {
			System.out.print(a);

			if (i!=n)
		System.out.print(", ");
			
			a++;

		}
		
		}
	}

