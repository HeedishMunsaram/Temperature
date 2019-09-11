import java.util.Scanner;
/**
 * 
 */

/**
 * @author Andish
 *
 */
public class DEGREE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double farh1;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your temperature in fahrenheit: ");
		farh1 = keyboard.nextDouble();
		
		farh1 = (((farh1-32)*5)/9);
		System.out.println("farh1 to celcius :" + farh1);
		
		keyboard.close();

	}

}
