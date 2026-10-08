package Striver_Array_easy01;
public class FindMissingNumber {
    static void finding(int[] num){
        int[] hash = new int[num.length+1];

        for(int i=0; i<num.length; i++){
             hash[num[i]]++;
        }
        for(int i=1; i<num.length; i++)
        if(hash[i]==0)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,4};
        finding(arr);
    }
}

/*      tc O(n+m)
static int finding(int[] num){
    int sum=0;
    for (int i = 0; i < num.length+1; i++)
        sum = sum + i;

    for (int i = 0; i < num.length; i++)
        sum = sum - num[i];

    return sum;
} */


/* brute force ---  tc O(n^2)
    static void finding(int[] num){
        for (int i = 0; i <= num.length; i++) {
            int flag=0;
            for (int j = 0; j < num.length; j++) {
                if (num[j] == i){
                    flag = 1;
                break;
                }
            }
            if (flag==0)
                System.out.println(i);
        }
    }
 */

/* optimal(XOR)
static int funl(int[] num){
    int xor1 =0;    int xor2 =0;
    for (int i = 0; i < num.length+1; i++)
        xor1 = xor1 ^ i;

    for (int i=0; i<num.length; i++)
        xor2 = xor2 ^ num[i];

    return xor1 ^ xor2;
}*/

/* for 0 to n -- not for 1 to n
static int misiNum(int[] num){
    int xor = num.length;
    for (int i = 0; i < num.length; i++) {
        xor ^= i ^ num[i];

    }
    return xor;
}*/