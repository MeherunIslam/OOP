/*Write a program in C in order to calculate the area and 
  circumference/ perimeter of a circle of given radius*/

package AreaCircumferencePrograms;

public class program_06 {

	public static void main(String[] args) {
		
    int radius = 3;
    
    double area = Math.PI*(radius*radius);
    double circumference = 2*Math.PI*radius;
    
    System.out.println("\nThe Area of Circle is: " +area);
    
    System.out.println("\nThe Circumference of Circle is: " +circumference);
    
	}

}
