package Sorting_techniques;
public class ImproveInsertionSort {
    static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2,6,1,3,8,9,5,4};
        shellSort(arr);
        for(int ar : arr) System.out.print(ar+" ");
    }
}
