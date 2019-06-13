package sortings;

/**
 * Пузырьковая сортировка
 */
public class BubbleSort {

    /**
     * @param array неотсортированный массив чисел
     * @return отсортированный массив чисел
     */
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Без использования вспомогательной переменной
     * @param array неотсортированный массив чисел
     * @return отсортированный массив чисел
     */
    public static int[] sortInt(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    array[j+1] += array[j];
                    array[j] = array[j+1] - array[j];
                    array[j+1] -= array[j];

                    // Or With XOR
//                    array[j+1] ^= array[j];
//                    array[j] ^= array[j+1];
//                    array[j+1] ^= array[j];
                }
            }
        }
        return array;
    }
}