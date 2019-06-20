package sortings;

/**
 * Пузырьковая сортировка
 */
public class BubbleSort {

    /**
     * @param array неотсортированный массив чисел
     */
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * Без использования вспомогательной переменной
     * @param array неотсортированный массив чисел
     */
    public static void sortInt(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    array[j+1] += array[j];
                    array[j] = array[j+1] - array[j];
                    array[j+1] -= array[j];

                    /* Или с помощью XOR */
//                    array[j+1] ^= array[j];
//                    array[j] ^= array[j+1];
//                    array[j+1] ^= array[j];
                }
            }
        }
    }
}
