import java.util.Scanner;

public class KolkoIKrzyzyk {
    public static void main(String[] args) {
 String [] tablica = new String[9] ;
    tablica [0] = "0"; tablica [1] = "1"; tablica [2] = "2";
        tablica [3] = "3"; tablica [4] = "4"; tablica [5] ="5";
        tablica [6] = "6"; tablica [7] = "7"; tablica [8] = "8";
        drukPlanszy(tablica);

        boolean zwyciestwo = true;
        while (zwyciestwo) {
            System.out.println("gracz x wybierz pole");
            Scanner czytanie= new Scanner(System.in);
            int numerPola = czytanie.nextInt();
            tablica [numerPola] = "X";
            drukPlanszy(tablica);

            if (tablica [0] == "X" ||tablica [0] == "O"){
                break;
            }



            System.out.println("gracz O wybierz pole");
            numerPola = czytanie.nextInt();
            tablica [numerPola] = "O";
            drukPlanszy(tablica);
        }
    }

    public static void drukPlanszy(String[] tablica) {
        System.out.print( tablica [0]);
        System.out.print("|");
        System.out.print(tablica [1]);
        System.out.print("|");
        System.out.println(tablica [2]);
        System.out.print(tablica [3]);
        System.out.print("|");
        System.out.print(tablica [4]);
        System.out.print("|");
        System.out.println(tablica [5]);
        System.out.print(tablica [6]);
        System.out.print("|");
        System.out.print(tablica [7]);
        System.out.print("|");
        System.out.println(tablica [8]);
    }
}
