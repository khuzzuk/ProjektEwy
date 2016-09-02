import java.io.IOException;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        System.out.println("Podaj wzrost");
        Scanner klaw = new Scanner(System.in);
        /* do czytaniazklawiatury */
        float wzrost = klaw.nextInt();

        System.out.println("Podaj wage");
        float waga = klaw.nextInt();

        float bmi = waga / wzrost; //masa/wzrost(m)^2

        System.out.println ("Twoje bmi=");
        System.out.println(bmi);



    }

    public static void wczytajWzrost (String wzrost){

    }
}
