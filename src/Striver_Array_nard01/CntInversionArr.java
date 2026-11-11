package Striver_Array_nard01;// count the pair where left element is larger
public class CntInversionArr {
    int count=0;
    static void mergeSort(int[] num,int low, int high){
        if (low >= high) return;
        int mid = low + (high - low)/2;
        mergeSort(num,low,mid);
        mergeSort(num,mid+1,high);
        merge(num,low,mid,high);
    }
    static void merge(int[] num,int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int left = low; int right = mid+1;
        int t = 0;
        while (left <= mid && right <= high){
            if (num[left] <= num[right]){
                temp[t++] = num[left++];
            }else{
                temp[t] = num[right];
                t++; right++;
            }
        }
        while (left <= mid) temp[t++] = num[left++];
        while (right <= high) temp[t++] = num[left++];
        System.arraycopy(temp, 0,num, low, temp.length);
    }
    public static void main(String[] args){
        int[] arr = {5,3,2,4,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(java.util.Arrays.toString(arr));
    }
}


/* brute
static int invCnt(int[] num){
    int count=0;
    for(int i=0; i < num.length; i++){
        for (int j = i+1; j < num.length; j++) {
            if (num[i] > num[j])
                count++;
        }
    }
    return count;
}*/