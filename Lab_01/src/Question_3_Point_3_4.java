/*Using for/while/do...while loop calculate the output each of the followings:
 (iii) 1^2+2^2+3^2+ ... +n^2 
 (iv)  1^2+3^2+5^2+ ... +n^2*/

package Lab_3;

import java.util.Scanner;

public class Question_3_Point_3_4 {

	public static void main(String[] args) {
			
			Scanner KIM = new Scanner(System.in);
			
			System.out.println("Enter the first base number: ");
			int a = KIM.nextInt();
			
			System.out.println("Enter the second base number: ");
			int b = KIM.nextInt();
					
			System.out.println("Enter the value of n: ");
			int n = KIM.nextInt();
			
			int d = b-a;
				
			for(int i=1; i<=n; i++) {
				
				if( i!=1)
					
				System.out.print("+");
				
				System.out.print(a);
				
				System.out.print("^2");
			
				a = a + d;
				
			}
			
		}
	}

