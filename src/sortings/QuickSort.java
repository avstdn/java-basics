package sortings;

public class QuickSort {

    /**
     * The main function that implements QuickSort
     * @param a Array to be sorted
     * @param lo Starting index
     * @param hi Ending index
     */
    public static void sort(int[] a, int lo, int hi) {
        if (lo < hi) {
            // pi is partitioning index, a[pi] is
            // now at right place
            int pi = partition(a, lo, hi);

            // Recursively sort elements before
            // partition and after partition
            sort(a, lo, pi - 1);
            sort(a, pi + 1, hi);
        }
    }

    /**
     * This function takes last element as pivot,
     * places the pivot element at its correct
     * position in sorted array, and places all
     * smaller (smaller than pivot) to left of
     * pivot and all greater elements to right of pivot
     * @param a Array to be sorted
     * @param lo Starting index
     * @param hi Ending index
     * @return partitioning index
     */
    private static int partition(int[] a, int lo, int hi) {
        int pivot = a[hi];
        int i = lo - 1; // index of smaller element
        for (int j = lo; j < hi; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (a[j] <= pivot) {
                i++;

                // Swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // Swap a[i+1] and a[hi] (or pivot)
        int temp = a[i+1];
        a[i+1] = a[hi];
        a[hi] = temp;

        return i + 1;
    }
}