import java.util.*;

/**
 * @author Pavel Stryc strycpa@students.zcu.cz
 *
 */
public class Ppa1_cv05_2_A13B0056K 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Zadej puvodni cislo (max. 999):");
		String number = sc.nextLine();
		System.out.println("Zadej pocet cifer zprava (max. 3):");
		int numerals = sc.nextInt();

		System.out.println("---Vysledky---");
		
		if( numerals > number.length() ) {
			System.out.println("Cisla " + number + " a " + numerals + " jsou chybne zadana");
		}
		else {
			System.out.println( number.substring( number.length() - numerals ) );
		}
		
	}
}
