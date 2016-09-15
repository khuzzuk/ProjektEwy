import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner kalkulator = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int PierwszaLiczba = kalkulator.nextInt ();

        String Znak = null;
        System.out.println("Podj znak");
        Znak = kalkulator.next();

        int DrugaLiczba = 0;
        System.out.println("Podaj liczbe");
        String TekstowaDrugaLiczba = kalkulator.next();
        DrugaLiczba = Integer.parseInt(TekstowaDrugaLiczba);

        if (Znak.charAt(0)== '+'){
            int Suma = PierwszaLiczba + DrugaLiczba;
            System.out.println("Twój wynik to:");
            System.out.println(Suma);
            }

    }

}
