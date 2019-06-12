package algorithms;

/**
 * Бинарный поиск
 */
public class BinarySearch {

    /**
     * Реализация метода для поиска элемента в массиве
     *
     * @param array отсортированный массив чисел
     * @param find искомое число
     * @return индекс искомого числа в массиве, либо -1, если его нет в массиве
     */
    public static int findElement(int[] array, int find) {
        int start = 0;
        int end = array.length - 1;
        int middle;

        while(end >= start) {
            middle = (start + end) / 2;

            if (find == array[middle]) return middle;
            else if (find > array[middle]) start = middle + 1;
            else end = middle - 1;
        }

        return - 1;
    }
}
