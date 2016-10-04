import java.util.Scanner;

public class KolkoIKrzyzyk {
    public static void main(String[] args) {
        String[] tablica = new String[9];
        tablica[0] = "0";
        tablica[1] = "1";
        tablica[2] = "2";
        tablica[3] = "3";
        tablica[4] = "4";
        tablica[5] = "5";
        tablica[6] = "6";
        tablica[7] = "7";
        tablica[8] = "8";
        drukPlanszy(tablica);

        boolean kontynuacja = true;
        while (kontynuacja) {
            System.out.println("gracz x wybierz pole");
            Scanner czytanie = new Scanner(System.in);
            int numerPola = czytanie.nextInt();
            tablica[numerPola] = "X";
            drukPlanszy(tablica);

            if (czyWygral(tablica, "X")) {
                break;
            }

            System.out.println("gracz O wybierz pole");
            numerPola = czytanie.nextInt();
            tablica[numerPola] = "O";
            drukPlanszy(tablica);
            if (czyWygral(tablica, "O")){
                break;
            }
        }
    }

    public static void drukPlanszy(String[] tablica) {
        System.out.print(tablica[0]);
        System.out.print("|");
        System.out.print(tablica[1]);
        System.out.print("|");
        System.out.println(tablica[2]);
        System.out.print(tablica[3]);
        System.out.print("|");
        System.out.print(tablica[4]);
        System.out.print("|");
        System.out.println(tablica[5]);
        System.out.print(tablica[6]);
        System.out.print("|");
        System.out.print(tablica[7]);
        System.out.print("|");
        System.out.println(tablica[8]);
    }

    public static boolean czyWygral(String[] tablica, String symbolGracza) {
        if (tablica[0] == symbolGracza && tablica[1] == symbolGracza && tablica[2] == symbolGracza) {
            System.out.println("X zwyciezyles");
            return true;
        }
        if (tablica[3] == symbolGracza && tablica[4] == symbolGracza && tablica[5] == symbolGracza) {
            System.out.println("X zwyciezyles");
            return true;
        }
        if (tablica[6] == symbolGracza && tablica[7] == symbolGracza && tablica[8] == symbolGracza) {
            System.out.println("X zwyciężyłeś");
            return true;
        }

        if (tablica[0].equals(symbolGracza) && tablica[3] == symbolGracza && tablica[6] == symbolGracza) {
            System.out.println (symbolGracza + " zwyciężyłeś");
            return true;
        }
        if (tablica[1] == symbolGracza && tablica[4] == symbolGracza && tablica[7] == symbolGracza) {
            System.out.println("X zwyciezyles");
            return true;
        }
        if (tablica[2] == symbolGracza && tablica[5] == symbolGracza && tablica[8] == symbolGracza) {
            System.out.println("X zwyciezyles");
            return true;
        }
        if (tablica[0] == symbolGracza && tablica[4] == symbolGracza && tablica[8] == symbolGracza) {
            System.out.println("X zwyciezyles");
            return true;
        }
        return false;
    }

}
/* ctrl + k -> ctrl shift k */