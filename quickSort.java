import java.util.Random;
public class quickSort {
    public static void main(String[] args) {
        int [] A = new int[]{4,3,4,5,7,2,3,5,34,3,2,99,5,33,3,500,5,66,4,3,6};
        quickSort(A);
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
    static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    static void quickSort(int[] array, int low, int high) {
        if (low < high + 1) {
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }
    }

    static int partition(int[] array, int low, int high) {
        swap(array, low, getPivot(low, high));
        int left = low + 1;
        for (int i = left; i <= high; i++) {
            if (array[i] < array[low]) {
                swap(array, i, left++);

            }
        }
        swap(array, low, left - 1);
        return left - 1;
    }
    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    static int getPivot(int low, int high) {
        Random random = new Random();
        return random.nextInt((high - low) + 1) + low;
    }

}
