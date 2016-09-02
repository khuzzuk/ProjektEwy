import java.io.IOException;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        System.out.println("Podaj wzrost");
        Scanner klaw = new Scanner(System.in);
        /* do czytaniazklawiatury */
        String wzrost = klaw.next();
        wczytajWzrost(wzrost);

        System.out.println("Podaj wage");
        float waga = klaw.nextInt();

        float bmi = waga / 3; //masa/wzrost(m)^2

        System.out.println ("Twoje bmi=");
        System.out.println(bmi);



    }

    public static void wczytajWzrost (String wzrost)
    {
        if (wzrost.charAt(0)=='1'){
            System.out.println("wzrost poprawny");
        } else if (wzrost.charAt(0)=='2'){
            System.out.println("jestes wysoki");
        } else {
            System.out.println("bład");
        }

    }
}
