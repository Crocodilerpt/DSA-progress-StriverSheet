class Hehe02{ // most consecutive one's -- brute force
    static int consecutiveOne(int[] num) {
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
        int[] num = {1,1,0,1,1,1,1,1,1,1,0,0,0};
        int ans = consecutiveOne(num);
        System.out.println(ans);
    }
}
