/* Two numbers are taken as input into two variables C and D. Write a program to 
interchange the contents of C and D. [using third variable and without using third 
variable]*/

package SwapProgram;

public class program_02 {

	public static void main(String[] args) {
		
		int C = 15, D = 30, temp;
		
		System.out.println("After swap: C = " +C+ ", D = " +D);
		
		temp = C;
		C = D;
		D = temp;
		
		
		
		System.out.println("After swap: C = " +C+ ", D = " +D);
}
}