package servicedb;

// naming - class
public class newService {

    // naming - method
    public void MyMethod () {
        System.out.println("myMethod");
    }

    public String myAge () {
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

    private static Boolean testBoolean () {
        return false;
    }

    public String myAgeNotReturnEarly () {
        int age = 18;
        String result;

        if (age < 5 ) {
            result =  "Balita";
        } else if (age > 6 && age <= 12) {
            result =  "SD";
        } else if (age > 12 && age < 15) {
            result =  "SMP";
        } else {
            result = "SMA";
        }

        return result;
    }

    private void printTest() {
        System.out.println(testBoolean());
    }
}
