import java.io.IOException;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        System.out.println("Podaj wzrost w centymetrach");
        Scanner klaw = new Scanner(System.in);
        /* do czytaniazklawiatury */
        String wzrost = klaw.next();
boolean poprawnyWzrost = wczytajWzrost(wzrost);
        if (!poprawnyWzrost) return;
        float wzrostWMetrach = Float.parseFloat(wzrost);
        wzrostWMetrach = wzrostWMetrach / 100;
        System.out.println("Podaj wage");
        float waga = klaw.nextInt();

        float bmi = waga / (wzrostWMetrach*wzrostWMetrach); //masa/wzrost(m)^2

        System.out.println ("Twoje bmi=");
        System.out.println(bmi);



    }

    public static boolean wczytajWzrost (String wzrost)
    {
        if (wzrost.length() != 3) {
            System.out.println("bład"); return false;
        }
        if (wzrost.charAt(0)<'1' || wzrost.charAt(0)>'9'){
            System.out.println("bład");
            return false;
        }
if (wzrost.charAt(1)>='0')
{} else {
    System.out.println("bład");
} if (wzrost.charAt(1)>'9'){
        System.out.println("bład");
        return false;
    }
    if (wzrost.charAt(2)>'9')
    {return false;}
    if (wzrost.charAt(2) <'0')
    {return false;}


return true;



    }
public static void interpretacja (float wynik){
    if (wynik <= 18) {
        System.out.println("jedz wiecej paczkow");
    }
if (wynik > 18 && )


}}

