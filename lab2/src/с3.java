public class с3 {
    public static void main(String[] args) {

        double a = -1.23;
        double b = -0.34;
        double c = 0.707;
        double d = 2.312;
        
        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
        System.out.println("The value of c: " + c);
        System.out.println("The value of d: " + d);

        double term1 = Math.log10(Math.abs(b / a));
        double term2 = Math.sqrt(Math.sin(c) + Math.pow(Math.E, d));

        // Compute the final result
        double y = 3 * (term1 + term2);

        // Output the result
        System.out.println("The result is: " + y);
    }
}
