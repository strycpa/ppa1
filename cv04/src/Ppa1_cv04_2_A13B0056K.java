import java.util.*;

/**
 * @author Pavel Stryc strycpa@students.zcu.cz
 *
 */
public class Ppa1_cv04_2_A13B0056K {
	
	private static double BASE = 10;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Zadejte realne cislo jako exponent pro vypocteni vyrazu 10^x.");

		sc.useLocale( new Locale( "en_US" ) );
		Double x = sc.nextDouble();
		
		System.out.println("---Vysledky---");
		
		double zero = 0.0;
				
		if( x > zero ) {
			printPow( x );
		}
		else if( x < zero ) {
			printSqrt( x );
		}
		else {
			printInputZero();
		}
	}
	
	/**
	 * @param x
	 */
	private static void printPow( Double x ) {
		System.out.println( (int) BASE + "^" + x.toString() + " = " + Math.pow( BASE , x ) );
	}
	
	/**
	 * @param x
	 */
	private static void printSqrt( Double x ) {
		double absX = Math.abs( x );
		System.out.println( absX + " odmocnina z " + (int) BASE + " = " + Math.pow( BASE, 1 / absX ) );
	}
	
	private static void printInputZero() {
		System.out.println("Vstup = 0.0");
	}

}
