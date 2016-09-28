public class Wiersz {
    static {
        while (Ewa.isPerfect()) {
            Do.somethingWonderfull();
        }
    }

    public static void main(String[] args) {}

    static class Ewa {static boolean isPerfect(){return true;}}

    static class Do {
        static String[] lines = {"\u004E\u0061\u0020\u0067\u00F3\u0072\u007A\u0065\u0020\u0072\u00F3\u017C\u0065",
                "\u006E\u0061\u0020\u0064\u006F\u006C\u0065\u0020\u0066\u0069\u006F\u0142\u006B\u0069",
                "\u0061\u0020\u006D\u0079\u0020\u0073\u0069\u0119\u0020\u0074\u0075\u006C\u0069\u006D\u0079",
                "\u006A\u0061\u006B\u0020\u0064\u0077\u0061\u0020\u0061\u006E\u0069\u006F\u0142\u006B\u0069"};
        static int c = 0;
        static void somethingWonderfull() {
            System.out.println(lines[c]);
            c = c==3 ? 0 : ++c;
            try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
        }
    }
}
