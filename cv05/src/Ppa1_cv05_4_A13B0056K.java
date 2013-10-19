import java.util.*;

/**
 * @author Pavel Stryc strycpa@students.zcu.cz
 *
 */
public class Ppa1_cv05_4_A13B0056K 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int firstOperand = vstupCisla();
		char operator = vstupZnaku();
		int secondOperand = vstupCisla();

		System.out.println("---Vysledky---");
		
		if( operator == '+' ) {
			printResult( firstOperand, operator, secondOperand, ( firstOperand + secondOperand ) );
		}
		else if( operator == '-' ){
			printResult( firstOperand, operator, secondOperand, ( firstOperand - secondOperand ) );
		}
		else {
			System.out.println("Znak bude zadan vzdy spravne!");
		}
		
	}
	
	private static int vstupCisla()
	{
		System.out.println("Zadej operand:");
		return sc.nextInt();
	}
	
	private static char vstupZnaku()
	{
		System.out.println("Zadej znak + nebo -:");
		String character = sc.next();
		return character.charAt(0);
	}
	
	private static void printResult( int firstOperand, char operator, int secondOperand, int result )
	{
		System.out.println( firstOperand + " " + operator + " " + secondOperand + " = " + result );
	}
}
