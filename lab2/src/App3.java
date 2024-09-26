public class App3 {

    public void c1(double a, double b, double c, double d) {

        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
        System.out.println("The value of c: " + c);
        System.out.println("The value of d: " + d);

        // Computing the formula
        double numerator = Math.pow(Math.tan(a), 1 / c);
        double denominator = 1 + (Math.sinh(b) / (Math.log(Math.abs(d + c))));
        double y = numerator / denominator;

        // Output the result
        System.out.println("The result is: " + y + "\n");
    }

    static void c2(double a, double b, double c, double d) {

        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
        System.out.println("The value of c: " + c);
        System.out.println("The value of d: " + d);

        double term1 = 2 * Math.cos(Math.pow(a, b));
        double term2 = Math.abs(Math.acos(-Math.sqrt(c / d)));

        // Compute the final result
        double y = term1 + term2;   

        // Output the result
        System.out.println("The result is: " + y + "\n");
    }

    static void c3(double a, double b, double c, double d) {
        
        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
        System.out.println("The value of c: " + c);
        System.out.println("The value of d: " + d);

        double term1 = Math.log10(Math.abs(b / a));
        double term2 = Math.sqrt(Math.sin(c) + Math.pow(Math.E, d));

        // Compute the final result
        double y = 3 * (term1 + term2);

        // Output the result
        System.out.println("The result is: " + y + "\n");
    }

    public static void main(String[] args) {

        App3 obj = new App3();
        obj.c1(3.56, 1.02, 3, 2.43);
        // c1(3.56, 1.02, 3, 2.43);
        c2(2.54, 1.23, -2.14, -0.23);
        c3(-1.23, -0.34, 0.707, 2.312);

    }
}
