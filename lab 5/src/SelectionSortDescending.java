// File: SelectionSortDescending.java
public class SelectionSortDescending {
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;

            // Знаходимо максимальний елемент в не відсортованій частині масиву
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }

            // Обмін максимального елемента з першим елементом
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
