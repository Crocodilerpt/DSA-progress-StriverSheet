package Pattern_famous;// Longest subarray sum == K
import java.util.HashMap;
public class Prefix_Sum {// Hashing + prefixSum
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
    }
    public static void main(String[] args) {
        int[] arr = {10,5,2,6,2,15,1,6,15,8,1,1,1,1,1,1,1};
        System.out.println(funk(arr,15));
    }
}