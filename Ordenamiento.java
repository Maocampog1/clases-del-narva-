public class Ordenamiento {
    public static void main(String[] args) {
        int[] arr = {6, 4, 5, 15, 7, 2};
        insertionSort(arr);
        for (int e : arr) {
            System.out.print(e + ", ");
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
        }
    }
}
// 