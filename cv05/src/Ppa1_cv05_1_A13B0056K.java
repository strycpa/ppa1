import java.util.*;

/**
 * @author Pavel Stryc strycpa@students.zcu.cz
 *
 */
public class Ppa1_cv05_1_A13B0056K 
{
	private static Scanner sc = new Scanner(System.in);
	private static int[] primeNumbers = {2};
	
	public static void main(String[] args) 
	{
		System.out.println("Zadejte strop pro hledani prvocisel");
		
		int number = vstupMaxCisla();
		
		System.out.println("---Vysledky---");
		
		for( int i = 2; i < number; i++ ) {
			if( jePrvocislo( i ) ) {
				vypisPrvocislo( i );
			}
		}
	}
	
	private static boolean jePrvocislo(int cislo)
	{
		for( int i = 2; i < cislo; i++ ) {
			if( cislo % i == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	private static int vstupMaxCisla()
	{
		return sc.nextInt();
	}
	
	private static void vypisPrvocislo(int prvocislo)
	{
		System.out.print( prvocislo + ", " );
	}
}
