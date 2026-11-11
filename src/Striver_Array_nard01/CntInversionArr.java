package Striver_Array_nard01;// count the pair where i element is larger
public class CntInversionArr {
    static int mergeSort(int[] num,int low, int high){
        int count = 0;
        if (low >= high){
            return count;
        }
        int mid = (low + high)/2;
        count += mergeSort(num,low,mid);
        count += mergeSort(num,mid+1,high);
        count += merge(num,low,mid,high);
        return count;
    }
    static int merge(int[] num,int low, int mid, int high){
        int count =0;
        int[] temp = new int[high - low + 1];
        int i = low; int j = mid+1;
        int k = 0;
        while (i <= mid && j <= high){
            if (num[i] <= num[j])
                temp[k++] = num[i++];
            else{
                temp[k++] = num[j++];
                count += (mid - i + 1);
            }
        }
        while (i <= mid) temp[k++] = num[i++];
        while (j <= high) temp[k++] = num[j++];

        for (int x=0; x < temp.length; x++){
            num[low+x] = temp[x];
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {5,3,2,4,1};
        int ans = mergeSort(arr,0,arr.length-1);
        System.out.println(ans);
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