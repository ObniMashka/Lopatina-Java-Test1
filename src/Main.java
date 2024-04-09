
public class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        int sum;
        int difference;
        int product;
        int quotient;
        if (a > b) {
            System.out.println(String.format(" %d > %d", a, b));
        } else if (a == b) {

            System.out.println(String.format(" %d = %d", a, b));
        }
        else {

            System.out.println(String.format(" %d < %d", a, b));

        }

        sum = a + b;
        System.out.println( a + " + " + b + " = " + sum );

        difference = a - b;
        System.out.println( a + " - " + b + " = " + difference );

        product = a * b;
        System.out.println( a + " * " + b + " = " + product );

        quotient = a / b;
        System.out.println( a + " / " + b + " = " + quotient );
    }
}