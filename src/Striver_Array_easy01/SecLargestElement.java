package Striver_Array_easy01;
public class SecLargestElement {
    static int large(int[] arr){
        int max=0;
        int secMax=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                secMax = max;
                max = arr[i];
            }else if
            (secMax < max && max > arr[i])
                secMax = arr[i];
        }
        if (0 == secMax) return -1;

        return secMax;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,4,4};
        System.out.println(large(arr));
    }
}