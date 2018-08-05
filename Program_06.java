/* Write a program to read three integer values from the keyboard and displays the output 
   stating that they are the sides of right-angled triangle*/

import java.util.Scanner;

public class Program_06 {
	
	private static Scanner kb;
	
	public static void main(String[] args) {
		
		int x, y, z;
		
		kb= new Scanner(System.in);
		
		System.out.println("Enter Three Integer Values: ");
		
		x= kb.nextInt();
		
		y= kb.nextInt();
		
		z= kb.nextInt();
		
		if((x^2)==(y^2)+(z^2)||(y^2)==(z^2)+(x^2)||(z^2)==(x^2)+(y^2))


              System.out.print("They are the sides of a right_angled triangle");
          
        else 
        	  
        	  System.out.print("They are not the sides of a right_angled triangle");
	}

}
