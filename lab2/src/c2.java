public class c2 {
    public static void main(String[] args) {

        double a = 2.54;
        double b = 1.23;
        double c = -2.14;
        double d = -0.23;
        
        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
        System.out.println("The value of c: " + c);
        System.out.println("The value of d: " + d);

        double term1 = 2 * Math.cos(Math.pow(a, b));
        double term2 = Math.abs(Math.acos(-Math.sqrt(c / d)));

        // Compute the final result
        double y = term1 + term2;   

        // Output the result
        System.out.println("The result is: " + y);
    }
}
