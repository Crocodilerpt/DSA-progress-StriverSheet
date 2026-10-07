package Striver_Array_easy01;
public class MostConsecutiveOnes {
    static int consOnes(int[] num){
        int cnt=0;
        int maxLen=0;
            for (int j = 0; j < num.length; j++) {
                if(num[j] == 1){
                    cnt++;
                    if(maxLen <= cnt)
                        maxLen = cnt;
                }else
                    cnt = 0;
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[] num = {1,1,0,1,1,0,1,0,1,1,0,0,0};
        System.out.println(consOnes(num));
    }
}
