package Striver_Array_nard01;
import java.util.ArrayList;
import java.util.List;
public class FindRepeatAndMissing {
    static List<Integer> findMnR(int[] num){
        List<Integer> al = new ArrayList<>();
        for(int i=1; i < num.length; i++){
            int cnt =0;
            for(int j=0; j < num.length; j++){
                if (num[j] == i)
                    cnt++;
            }
            if (cnt==0) al.add(i);
            else if (cnt == 2) al.add(i);
        }
        return al;
    }
    public static void main(String[] args){
        int[] arr = {4,3,6,2,1,1};
        List<Integer> ans = findMnR(arr);
        System.out.println(ans);
    }
}

/* brute force
static List<Integer> findMnR(int[] num){
    List<Integer> al = new ArrayList<>();
    for(int i=1; i < num.length; i++){
        int cnt =0;
        for(int j=0; j < num.length; j++){
            if (num[j] == i)
                cnt++;
        }
        if (cnt==0) al.add(i);
        else if (cnt == 2) al.add(i);
    }
    return al;
}*/


/*   o(n)+o(n), o(n)
static void findMnR(int[] num){
    int[] hash = new int[num.length+1];
    for(int i=0; i < num.length; i++){
        int x = num[i];
        hash[x] += 1;       //hash[num[i]]++;
    }
    for (int i = 1; i < hash.length; i++) {
        if(hash[i]==2) System.out.println(i +" repeat ");
        else if (hash[i]==0) System.out.println(i+ " miss");
        // if (repeat != -1 && miss != -1) break;
    }
}*/

/* optimal : using math formula
static int[] findMnR(int[] num) {
    long n = num.length;
    long s = 0, s2 = 0;
    long sn = n * (n + 1) / 2;                  // expected sum
    long s2n = n * (n + 1) * (2 * n + 1) / 6;   // expected sum of squares
    for (int i=0; i < n; i++) {
        s += num[i];
        s2 += (long) num[i] * num[i];
    }
    long val1 = s - sn;      // R - M
    long val2 = s2 - s2n;    // R² - M²
    val2 = val2 / val1;      // R + M

    long x = (val1 + val2) / 2;  // repeating
    long y = x - val1;           // missing

    return new int[]{(int) x, (int) y};  // {repeating, missing}
}*/


/* optimal xor trick
static int[] findMnR(int[] num) {
    int xor=0;
    for(int i=0; i<num.length;i++){
        xor ^= num[i] ^ (i+1);
    }
    int bit = xor & -xor;
    int a=0;   int b=0;
    for (int i = 0; i < num.length; i++) {
        if ((num[i] & bit) != 0)
            a ^= num[i];
        else b ^= num[i];
        if (((i + 1) & bit) != 0)
            a ^= (i + 1);
        else b ^= (i + 1);
    }
    return new int[]{a,b};
}*/