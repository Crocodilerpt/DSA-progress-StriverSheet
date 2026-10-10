class Hehe02{ //rotate array by d places
    static int[] rotByD(int[] num,int n, int d){
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++)
            temp[i] = num[i];

        for (int i = d; i < num.length; i++)
            num[i-d] = num[i];

        for (int i = n-d; i < n; i++)
            num[i] = temp[i-(n-d)];

        return num;
    }
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,6,7};
        int[] nums = rotByD(num,7,4);
        for (int a:nums) System.out.print(a+" ");
    }
}

