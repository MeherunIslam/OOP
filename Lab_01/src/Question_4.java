/*Write a program to compute the factorial of a given integer number*/

package Lab_3;

import java.util.Scanner;

public class Question_4 {

		public static void main(String[] args) {
			
			Scanner KIM = new Scanner(System.in);
			
			System.out.println("Enter the positive number which factorial you want to find: ");
			int a = KIM.nextInt();
			
			int sum = 1;
			
			if(a==0 || a==1)
				System.out.println("The factorial is: 1");
			
			else 
			{
				for(int i=a; i>=1;i--) {
					sum= sum * i;
				}
			
			System.out.println("The factorial is: "+sum);
			}

		}

	}

