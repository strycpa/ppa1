import java.util.*;

/**
  * Vypocet aritmetickeho prumeru celych cisel
  * nactenych z klavesnice
  * pojmenovana konstanta a pretypovani
  * @author P.Herout
  */
public class Ppa1_cv04_4_A13B0056K {
  static final int POCET = 3;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Zadej 1. cislo: ");
    int a1 = sc.nextInt();
    System.out.println("Zadej 2. cislo: ");
    int a2 = sc.nextInt();
    System.out.println("Zadej 3. cislo: ");
    int a3 = sc.nextInt();
	System.out.println("---Vysledky---");
    double prumer = (1 / Math.sqrt(POCET)) * Math.sqrt(Math.pow(a1, 2) + Math.pow(a2, 2) + Math.pow(a3, 2));
    System.out.println("Kvadraticky prumer = " + prumer);
  }
}
