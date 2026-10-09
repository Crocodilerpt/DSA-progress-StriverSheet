package Striver_Array_easy01;
public class MostConsecutiveOnes {
    static int consOnes(int[] num){
        int maxLen=0;   int count=0;
        for(int i=0; i<num.length;i++){
            if (num[i]==1)
                count++;
            else
                count=0;

            maxLen = Math.max(count,maxLen);
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[] num = {1,1,0,1,1,0,1,0,1,1,0,0,0,0};
        System.out.println(consOnes(num));
    }
}


/*
static int consecutiveOne(int[] num) {
    int maxLen=0;
    for (int i = 0; i < num.length; i++) {
        int cnt=0;
        for (int j = i; j < num.length; j++) {
            if (num[j] == 1)
                cnt++;
            else
                break;
            maxLen = Math.max(maxLen,cnt);
        }
    }
    return maxLen;
}*/