package Striver_Array_midium02;// count the sub-array sum == k
import java.util.HashMap;
public class CntSubArrSumEqK {
    static int cntArray(int[] num, int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum=0; int cnt=0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];

            int need = sum - target;
            if (hm.containsKey(need))
                cnt += hm.get(need);

            hm.put(sum, hm.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        System.out.print(cntArray(arr,3));
    }
}



/*  brute  tc- o(n^2)
static int cntArray(int[] num, int target){
    int cnt=0;
    for (int i=0; i < num.length; i++) {
        int sum=0;
        for (int j = i; j < num.length; j++) {
            sum = sum + num[j];
            if (sum == target)
                cnt++;
        }
    }
    return cnt;
}
*/