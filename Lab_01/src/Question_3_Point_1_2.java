/*Using for/while/do...while loop calculate the output each of the followings:
 (i) 2+4+6+ ... +n 
 (ii) 3+6+9+ ... +n*/

package Lab_3;

import java.util.Scanner;

public class Question_3_Point_1_2 {
	
		public static void main(String[] args) {
			
			Scanner KIM = new Scanner(System.in);
			
			System.out.println("Enter the first number: ");
			int a = KIM.nextInt();
			
			System.out.println(" ");
			
			System.out.println("Enter the second number: ");
			int b = KIM.nextInt();
				
			System.out.println(" ");
			
			System.out.println("Enter the value of n: ");
			int n = KIM.nextInt();
			
			System.out.println(" ");
			
			int d = b-a;
				
			for(int i=1; i<=n; i++){				
				
				if( i!=1)
					
				System.out.print("+");
				
				System.out.print(a);
			
				a = a + d;
				
			}
		}
	}

