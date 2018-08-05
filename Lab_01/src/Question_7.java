package Lab_3;

import java.util.Scanner;

public class Question_7 {

		public static void main(String[] args) {
			int n, i, j;
			Scanner KIM = new Scanner(System.in);
			
			System.out.println("Enter the value of n: ");
		    n = KIM.nextInt();
			
			
			
			for(i=0;i<=n;i++)
				
			   {
				
				for(j=0;j<i;j++)
					System.out.print(" "+i);
				System.out.print("\n");
			
		}
			
			System.out.println("\n\n\n");
			
			for(i=1;i<=n;i++)
				
			   {
				
				for(j=1;j<=i;j++)
					System.out.print(" "+j);
				System.out.print("\n");
			
		}

			System.out.println("\n\n\n");

			
			for(i=n;i>=1;i--)
				
			   {
				
				for(j=i;j>=1;j--)
					System.out.print(" "+j);
				System.out.print("\n");
			
		}
			
			System.out.println("\n\n\n");
			
			for(i=1;i<=n;i++)
				
			   {
				
				for(j=1;j<=i;j++)
					System.out.print("*");
				System.out.print("\n");
			
		}

			System.out.println("\n\n\n");
			
			for(i=n;i>=1;i--)
				
			   {
				
				for(j=i;j>=1;j--)
					System.out.print("*");
				System.out.print("\n");
			
		}	
			System.out.println("\n\n\n");
			
			 for(i=1;i<=n;i++)
			    {
			    	for(j=1;j<=n;j++)
			    	{
			    		System.out.print(" ");
			    		if(i==1||i==n||j==1||j==n) {
			    			
			    	
			    		System.out.print("*");
			    		}
			    		else {
			    		
			    		System.out.print(" ");
			    		}
			    	}
			    	System.out.println(" ");
			    }
			    
		}
}
