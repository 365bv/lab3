import java.util.Arrays;

public class TransformArray {

    public static int[] transform(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути пустим");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути пустим");
        }

        int minElement = Arrays.stream(array).min().orElseThrow(IndexOutOfBoundsException::new);
        int[] newArray = new int[array.length];

        if (minElement == 0) {
            Arrays.fill(newArray, -10);
        } else {
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i] / minElement;
            }
        }
        return newArray;
    }
}

