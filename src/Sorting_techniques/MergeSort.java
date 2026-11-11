package Sorting_techniques;
public class MergeSort {
    static void mergeSort(int[] arr,int low, int high){
        if(low >= high) return;
        int mid = low + (high - low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int i=low; int j=mid+1;
        int t=0;
        while(i <= mid && j <= high){
            if (arr[i] <= arr[j])
                temp[t++] = arr[i++];
            else
                temp[t++] = arr[j++];
        }
        while (i <= mid)  temp[t++] = arr[i++];
        while (j <= high) temp[t++] = arr[j++];
        System.arraycopy(temp, 0, arr, low, temp.length);
    }
    public static void main(String[] args){
        int[] arr  = {5,3,2,4,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
