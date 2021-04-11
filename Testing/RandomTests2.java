import java.util.Arrays;

public class RandomTests2 {
    public static void main(String[] args) {
        printAllRecursive(3,new Integer[]{1,2,3},'\n');
    }
    public static <T> void printAllRecursive(
            int n, T[] elements, char delimiter) {

        if(n == 1) {
            printArray(elements, delimiter);
        } else {
            for(int i = 0; i < n-1; i++) {
                printAllRecursive(n - 1, elements, delimiter);
                if(n % 2 == 0) {
                    swap(elements, i, n-1);
                } else {
                    swap(elements, 0, n-1);
                }
            }
            printAllRecursive(n - 1, elements, delimiter);
        }
    }
    public static <T> void swap(T[] input, int a, int b) {
        T tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }
    public static <T> void printArray(T[] input, char delimiter) {
        System.out.print(delimiter);
        for (T t : input) {
            System.out.print(t);
        }
    }
public static <T> void printAllIterative(int n, T[] elements, char delimiter){
    int[] indexes = new int[n];
    for (int i = 0; i < n; i++) {
        indexes[i] = 0;
    }

    printArray(elements, delimiter);

    int i = 0;
    while (i < n) {
        if (indexes[i] < i) {
            swap(elements, i % 2 == 0 ?  0: indexes[i], i);
            printArray(elements, delimiter);
            indexes[i]++;
            i = 0;
        }
        else {
            indexes[i] = 0;
            i++;
        }
    }
}
}

