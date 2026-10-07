package Striver_Array_easy01;
import java.util.HashMap;
public class AllNoAppears2only1noOnce {
    static void appearOnce(int[] num){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            if(hm.containsKey(num[i])){
                hm.put(num[i],hm.get(num[i])+1);
            }
            else hm.put(num[i],1);
        }
        for (int i = 0; i < num.length; i++) {
            if(hm.get(num[i])==1)
                System.out.println(num[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,2,4,5,3,4};
        appearOnce(arr);
    }
}

/* optimal XOR tc O(n)
static void appearOnce(int[] num){
    int xor=0;
    for (int i = 0; i < num.length; i++) {
        xor ^= num[i];
    }
    System.out.println(xor);
} */


/* brute tc O(n^2)
    static void funl(int[] num){
        for (int i = 0; i < num.length; i++) {
            int no = num[i]; int cnt=0;
            for (int j = 0; j < num.length; j++) {
                if (num[j] == no) cnt++;
            }
            if (cnt ==1) System.out.println(num[i]);
        }
    }
 */