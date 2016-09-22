import java.util.Scanner;

/**
 * Created by Ewunia on 2016-09-15.
 */
public class Kalkulator {
    public static void main(String[] args) {
        Scanner kalkulator = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int PierwszaLiczba = kalkulator.nextInt();

        String Znak = null;
        System.out.println("Podj znak");
        Znak = kalkulator.next();

        int DrugaLiczba = 0;
        System.out.println("Podaj liczbe");
        String TekstowaDrugaLiczba = kalkulator.next();
        DrugaLiczba = Integer.parseInt(TekstowaDrugaLiczba);

        if (Znak.charAt(0) == '+') {
            int Suma = PierwszaLiczba + DrugaLiczba;
            System.out.println("Twój wynik to:");
            System.out.println(Suma);
        }
        if (Znak.charAt(0) == '-'){
            int Różnica = PierwszaLiczba - DrugaLiczba;
            System.out.println("Twój wynik to:");
            System.out.println(Różnica);
        }
        if (Znak.charAt(0)== '/'){
            int Iloraz = PierwszaLiczba / DrugaLiczba;
            System.out.println("Twój wynik to");
            System.out.println(Iloraz);
        }
        if (Znak.charAt(0)== '*')
        {
        int Iloczyn = PierwszaLiczba * DrugaLiczba;
        System.out.println("Twój wynik to:");
        System.out.println(Iloczyn);}
    }
}