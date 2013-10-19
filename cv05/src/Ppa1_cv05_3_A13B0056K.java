import java.util.*;

/**
 * @author Pavel Stryc strycpa@students.zcu.cz
 *
 */
public class Ppa1_cv05_3_A13B0056K 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Zadej realne cislo:");
		Double number = vstupCisla();

		System.out.println("---Vysledky---");
		
		if( jeLiche( number.intValue() ) ) {
			System.out.println("Cela cast " + number + " je liche cislo");
		}
		else {
			System.out.println("Cela cast " + number + " je sude cislo");
		}
		
	}
	
	private static double vstupCisla()
	{
		sc.useLocale( new Locale( "en_US" ) );
		return sc.nextDouble();
	}
	
	private static boolean jeLiche(int cislo) 
	{
		return cislo % 2 != 0;
	}
}
