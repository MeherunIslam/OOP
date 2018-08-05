/*Find the greatest common divisor (gcd) of the given two 
  integer numbers.
  Sample Input: 12 18
  Sample Output(gcd) 6*/

package Lab_3;




public class Question_6_Point_2 {

		public static void main(String[] args) {
			int a,b,remainder;
			a=12;
			b=18;
			
			while(b!=0)
			{
				remainder=a%b;
				a=b;
				b=remainder;
			}
			System.out.println("\n GCD : "+a);

	}
	}

