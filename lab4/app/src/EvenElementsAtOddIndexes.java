public class EvenElementsAtOddIndexes {

    public static int calculateSum(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути пустим");
        }

        int sum = 0;
        for (int i = 1; i < array.length; i += 2) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
