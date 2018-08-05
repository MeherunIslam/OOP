/*Two numbers x, y are entered through the keyboard. 
  Write a program to find the value of one number 
  raised of the power of another i.e. x^y*/

package Lab_3;

import java.util.Scanner;

public class Question_5 {
	
		public static void main(String[] args) {
		int x=1;
			Scanner KIM = new Scanner(System.in);
			
			System.out.println("Enter the first number: ");
			int a = KIM.nextInt();
			
			System.out.println("Enter the second number: ");
			int b = KIM.nextInt();
			for(int i=1;i<=b;i++)
			{
				x=x*a;
			}
			System.out.println(x);
			
			
		}

	}


