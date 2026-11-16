package Striver_Array_nard01;
class ReversePairs{
    static int mergeSort(int[] num,int low, int high){
        if (low >= high) return 0;
        int mid = low + (high - low) / 2;
        int count = mergeSort(num,low,mid);
        count += mergeSort(num,mid+1,high);
        count += cntPairs(num,low,mid,high);
        merge(num,low,mid,high);
        return count;
    }
    static int cntPairs(int[] num,int low, int mid, int high){
        int count=0; int right = mid+1;
        for (int i = low; i <= mid; i++) {
            while (right <= high && num[i] > 2L*num[right])
                right++;
                count += right - (mid+1);
        }
        return count;
    }
    static int merge(int[] num,int low, int mid, int high){
        int count = 0;
        int[] temp = new int[high - low + 1];
        int i = low; int j = mid+1;
        int k = 0;
        while (i <= mid && j <= high)
            temp[k++] = num[i] <= num[j] ? num[i++] : num[j++];
        while (i <= mid) temp[k++] = num[i++];
        while (j <= high) temp[k++] = num[j++];
        for (int t = 0; t < temp.length; t++) num[low + t] = temp[t];
        return count;
    }
    public static void main(String[] args){
        int[] arr = {40,25,19,12,9,6,2};
        System.out.println(mergeSort(arr,0, arr.length-1));
    }
}


/* brute o(n^2)
static int prac(int[] a){
    int count=0;
    for(int i=0; i < a.length; i++){
        for (int j=i+1; j < a.length; j++)
            if (i<j && a[i] > (a[j]*2))
            count++;
    }
    return count;
}*/
