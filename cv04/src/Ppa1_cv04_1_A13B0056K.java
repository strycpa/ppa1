import java.util.*;

/**
 * @author Pavel Stryc strycpa@students.zcu.cz
 *
 */
public class Ppa1_cv04_1_A13B0056K 
{
	
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("a * x + b = 0");
		System.out.println("a: ");
		int a = sc.nextInt();
		System.out.println("b: ");
		int b = sc.nextInt();

		Random r = new Random();
		Boolean randomBoolean = r.nextBoolean();
		
		System.out.println( randomBoolean ? "ifem" : "switchem" );
		
		System.out.println("---Vysledky---");
		System.out.println("Rovnice: " + a + " * x + " + b +" = 0");
		
		if( randomBoolean ) {	//just for fun
			usingIf( a, b );
		}
		else {
			usingSwitch( a, b );
		}
	}
	
	/**
	 * @param a
	 * @param b
	 */
	private static void usingIf( Integer a, Integer b ) 
	{	
		if( a == 0 ) {
			if( b == 0 ) {
				printInfiniteResults();
			}
			else {
				printNoResult();
			}
		}
		else {
			if( b == 0 ) {
				printResultZero();	
			}
			else {
				printResult( a, b );
			}
		}
	}
	
	/**
	 * @param a
	 * @param b
	 */
	private static void usingSwitch( Integer a, Integer b ) 
	{	
		switch ( ( "" + b2i( a == 0 ) ) + ( "" + b2i( b == 0 ) ) ) {
		case "11":
			printInfiniteResults();
			break;
		case "10":
			printNoResult();
			break;
		case "01":
			printResultZero();
			break;
		default:
			printResult( a, b );
			break;
		}
	}
	
	/**
	 * @param b
	 * @return
	 */
	private static Integer b2i ( Boolean b )
	{
		return b ? 1 : 0;
	}
	
	private static void printInfiniteResults() 
	{
		System.out.println("ma nekonecne reseni");
	}
	
	private static void printNoResult() 
	{
		System.out.println("nema reseni v R");
	}
	
	private static void printResultZero() 
	{
		System.out.println("ma reseni x = 0.0");
	}
	
	private static void printResult( Integer ia, Integer ib ) 
	{
		Double fa = (double) ia;
		Double fb = (double) ib;
		System.out.println("ma reseni x = " + ( -fb / fa ) );
	}
}
