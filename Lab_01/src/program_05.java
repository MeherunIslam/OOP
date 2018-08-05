/* Write a program in C in order to calculate the area and volume of a 
   sphere of given radius*/

package AreaVolumePrograms;

public class program_05 {

	public static void main(String[] args) {
		
		double radius = 15, a, volume;
		
		a = 4*Math.PI*radius*radius;
		volume = (4/3)*Math.PI*radius*radius*radius;
		
	System.out.println("\nThe Area of Sphere:" +a);
	
	System.out.println("\nThe Volume of Sphere:" +volume);

	}

}
