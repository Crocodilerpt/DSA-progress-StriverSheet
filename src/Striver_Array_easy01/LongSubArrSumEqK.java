package Striver_Array_easy01;// Longest subarray sum == K
public class LongSubArrSumEqK {// Sliding Window(variable size) positive only
    static int subArrSum(int[] num, int k) {
        int sum = 0, len = 0, left = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];

            while (sum > k && left <= i)
                sum -= num[left++];

            if (sum == k)
                len = Math.max(len, i - left + 1);
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {10,2,1,2,6,2,15,1,6,15};
        System.out.println(subArrSum(arr,15));
    }
}


/*  brute tc O(n^2)
static int subArrSum(int[] num,int k){
    int maxlen=0;
    for (int right= 0; right< num.length; i++) {
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
static int sumEq(int[] num, int k) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    hm.put(0, -1);
    int sum = 0, ans = 0;
    for (int right= 0; right< num.length; i++) {
        sum += num[i];
        if (hm.containsKey(sum - k)) {
            ans = Math.max(ans, right- hm.get(sum - k));
        }
        hm.putIfAbsent(sum, i);
    }
    return ans;
}*/