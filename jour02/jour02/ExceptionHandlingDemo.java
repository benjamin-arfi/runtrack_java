package jour02;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // NullPointerException
        try {
            String str = null;
            int length = str.length(); // Cela lancera une NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException capturée : " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int element = arr[3]; // Cela lancera une ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException capturée : " + e.getMessage());
        }

        // ArithmeticException
        try {
            int result = 10 / 0; // Cela lancera une ArithmeticException (division par zéro)
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException capturée : " + e.getMessage());
        }

        System.out.println("Le programme continue après la gestion des exceptions.");
    }
}

