public class SumGreaterThanThree {

    public static int calculateSum(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути пустим");
        }

        int sum = 0;
        for (int value : array) {
            if (value > 3) {
                sum += value;
            }
        }
        return sum;
    }
}
