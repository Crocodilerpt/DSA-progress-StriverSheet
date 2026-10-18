package Striver_Array_midium02;
import java.util.HashMap;
import java.util.Map;
public class CntSubArrXorEqK {
    static int Xork(int[] num, int k){
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int cnt=0; int xor=0;
        for(int i=0; i<num.length;i++){
            xor = xor ^ num[i];

            int value = xor ^ k;
            if(hm.containsKey(value))
                cnt = cnt + hm.get(value);

            hm.put(xor,hm.getOrDefault(xor,0)+1);
        }
        return cnt;
    }
    public static void main(String[] args){
        int[] arr = {4,2,2,6,4};
        int ans = Xork(arr,6);
        System.out.println(ans);
    }
}


/* brute force o(n^2)
static int Xork(int[] num, int k){
    int cnt=0;
    for(int i=0;i<num.length;i++){
        int xor=0;
        for(int j=i;j<num.length;j++){
            xor = xor ^ num[j];
            if(xor == k)
                cnt++;
        }
    }
    return cnt;
}*/