public class c1 {

    public static void main(String[] args) {

        double a = 3.56;
        double b = 1.02;
        double c = 3;
        double d = 2.43;

        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
        System.out.println("The value of c: " + c);
        System.out.println("The value of d: " + d);

        // Computing the formula
        double numerator = Math.pow(Math.tan(a), 1 / c);
        double denominator = 1 + (Math.sinh(b) / (Math.log(Math.abs(d + c))));
        double y = numerator / denominator;

        // Output the result
        System.out.println("The result is: " + y);
    }
}
