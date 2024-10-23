import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        // Завдання 2: Знайти суму елементів, що більші за 3
        int[] array1 = {1, 5, 2, 8, 3};  // 5 + 8 = 13
        int[] array2 = {10, 0, 6, -2};   // 10 + 6 = 16
        
        System.out.println("Завдання 2: Сума елементів більше 3");
        System.out.println(SumGreaterThanThree.calculateSum(array1));  // 13
        System.out.println(SumGreaterThanThree.calculateSum(array2));  // 16
        
        // Завдання 32: Сума парних елементів на непарних місцях
        int[] array3 = {1, 4, 3, 6, 5};  // 4 + 6 = 10
        int[] array4 = {2, 8, 9, 4};     // 8 + 4 = 12
        
        System.out.println("\nЗавдання 32: Сума парних елементів на непарних місцях");
        System.out.println(EvenElementsAtOddIndexes.calculateSum(array3));  // 10
        System.out.println(EvenElementsAtOddIndexes.calculateSum(array4));  // 12
        
        // Завдання 62: Перетворення масиву за допомогою поділу на мінімальний елемент
        int[] array5 = {8, 4, 2, 7};       // [4, 2, 1, 3]
        int[] array6 = {3, 6, 0, 9};       // [-10, -10, -10, -10]
        
        System.out.println("\nЗавдання 62: Перетворення масиву");
        System.out.println(Arrays.toString(TransformArray.transform(array5)));  // [4, 2, 1, 3]
        System.out.println(Arrays.toString(TransformArray.transform(array6)));  // [-10, -10, -10, -10]
    }
}
