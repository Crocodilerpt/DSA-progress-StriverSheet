import java.util.HashMap;
import java.util.Map;
class Hehe02{// sum of xor
    static int practice(int[] num, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int cnt = 0, xor = 0;
        for (int n : num) {
            xor ^= n;
            cnt += hm.getOrDefault(xor ^ k, 0);

            hm.put(xor, hm.getOrDefault(xor, 0) + 1);
        }
        return cnt;
    }
    public static void main(String[] args){
        int[] num = {4,2,2,6,4};
        int an = practice(num,6);
        System.out.println(an);
    }
}