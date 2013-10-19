import java.util.*;

public class Ppa1_cv04_3_A13B0056K {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main( String[] args ) {
		
		System.out.println("Zadejte cele cislo jako uhel ve stupnich pro vypocteni tangens.");

		Integer angle = Math.abs( sc.nextInt() );
		
		System.out.println("---Vysledky---");
		
		if( angle % 90 == 0 && angle % 180 != 0 ) {
			System.out.println( "tangens nedefinovan" );
		}
		else {
			Double tangens = Math.tan( Math.toRadians( angle ) );
			System.out.println( "tan(" + angle + ") = " + tangens );
		}
	}
}
