/* Write a program in C in order to calculate the area and volume of a cylinder 
 of given radius and height*/

package AreaVolumePrograms;

public class program_04 {

	public static void main(String[] args) {

    double radius=5, height=5, a, volume;
    
    a = 2*Math.PI*radius*(radius+height);
    volume = Math.PI*radius*radius*height;
    
    System.out.println("\n The Area of Cylinder = " +a);
    
    System.out.println("\n The Volume of Cylinder = " +volume);
    
	}

}
