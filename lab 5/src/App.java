// File: Main.java
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] arr1 = {64, 25, 12, 22, 11};
        int[] arr2 = arr1.clone();

        System.out.println("Масив: " + Arrays.toString(arr1));

        // Тестуємо Selection Sort
        long startTime = System.nanoTime();
        SelectionSortDescending.selectionSortDescending(arr1);
        long endTime = System.nanoTime();
        System.out.println("\nSelection Sort: " + Arrays.toString(arr1));
        System.out.println("Time taken (Selection Sort): " + (endTime - startTime) + " nanoseconds\n");

        // Тестуємо Insertion Sort
        startTime = System.nanoTime();
        InsertionSortDescending.insertionSortDescending(arr2);
        endTime = System.nanoTime();
        System.out.println("Insertion Sort: " + Arrays.toString(arr2));
        System.out.println("Time taken (Insertion Sort): " + (endTime - startTime) + " nanoseconds");
    }
}
