package Striver_Array_easy01;// Longest subarray sum == K
public class LongSubArrSumEqK {// Sliding Window(variable size) positive only
    static int subArrSum(int[] num,int k){
        int maxlen=0;   int sum=0;  int left=0;

        for (int right=0; right < num.length; right++) {
            sum = sum + num[right];

            while (sum > k)
                sum = sum - num[left++];

            if (sum == k)
                maxlen = Math.max(right-left+1,maxlen);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,2,6,2,15,1,6,15};
        System.out.println(subArrSum(arr,15));
    }
}


/*  brute tc O(n^2)
static int subArrSum(int[] num,int k){
    int maxlen=0;
    for (int i = 0; i < num.length; i++) {
        int sum=0;
        for (int j = i; j < num.length; j++) {
            sum += num[j];
            if (sum == k)
                maxlen = Math.max(maxlen,j-i+1);
        }
    }
    return maxlen;
}  */

/* better by hashmap + Prefix sum for pos & negative
static int funk(int[] num,int k){
    HashMap<Integer,Integer> hm = new HashMap<>();
    int maxlen=0;   int sum=0;
    for(int i=0; i < num.length; i++){
        sum = sum + num[i];

        int need = sum - k;
        if (hm.containsKey(need)){
            int len = i - hm.get(need);
            maxlen = Math.max(maxlen,len);
        }
        hm.put(sum,i);
    }
    return maxlen;
}*/
