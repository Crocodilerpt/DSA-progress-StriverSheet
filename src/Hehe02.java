class Hehe02{ // longest sub array sum == k -- optimal
    static int sumEq(int[] num, int k) {
        int sum = 0, len = 0, left = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];

            while (sum > k && left <= i)
                sum -= num[left++];

            if (sum == k)
                len = Math.max(len, i - left + 1);
        }
        return len;
    }
    public static void main(String[] args){
        int[] arr = {10,2,1,2,6,2,15,1,6,15};
        int ans = sumEq(arr,15);
        System.out.println(ans);
    }
}
