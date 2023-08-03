package servicedb;

public class MagicNumber {
    @Deprecated
    public void testMagicNumber() {
        for(int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    }

    @Deprecated
    public static String myAge () {
        int age = 18;
        if (age < 5 ) {
            return "Balita";
        } else if (age > 6 && age <= 12) {
            return "SD";
        } else if (age > 12 && age < 15) {
            return "SMP";
        }
        return "SMA";
    }

}
