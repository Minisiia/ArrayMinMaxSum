import java.util.Random;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введіть N");
        int N = scanner.nextInt();
        int[] myArray = new int[N];
        for (int i = 0; i < N; i++) {
            myArray[i] = random.nextInt(100); // заповнюємо масив цілими числами від 0 до 100
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println("Найбільше значення масиву: " + maxValue(myArray));
        System.out.println("Найменше значення масиву: " + minValue(myArray));
        System.out.println("Загальна сума всіх елементів: " + sum(myArray));
        System.out.println("Середнє арифметичне всіх елементів: " + average(myArray));
        System.out.print("Всі непарні значення: ");
        odd(myArray);
    }

    static int maxValue(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (result < array[i]) result = array[i];
        }
        return result;
    }

    static int minValue(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (result > array[i]) result = array[i];
        }
        return result;
    }

    static int sum(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    static double average(int[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        result = result / array.length;
        return result;
    }

    static void odd(int[] array) {
        for (int j : array) {
            if (j % 2 != 0) System.out.print(j + " ");
        }
    }

}
