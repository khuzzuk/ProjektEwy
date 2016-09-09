/**
 * Created by adria on 08.09.2016.
 */
public class test {
    static int x = 0;
    public static void main(String[] args) {
        int z = 0;
        {
            int y = 2 + x + z;
            {
                int ewa = 5 + y;
            }
        }
        x = z;


        if (true) {
            return;
        } else {
            return;
        }
    }
}
