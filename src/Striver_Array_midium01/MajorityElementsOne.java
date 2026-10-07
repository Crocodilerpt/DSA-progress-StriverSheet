package Striver_Array_midium01;//majority element 1 -- appears more the len/2
public class MajorityElementsOne {// Boyer-Moore Voting Algorithm
    static void majority(int[] num){
        int val = num[0];
        int cnt=1;
        for(int i=1; i<num.length; i++){
            if (val == num[i])
                cnt++;
            else if (cnt == 0) {
                cnt=1;
                val = num[i];
            }else
                cnt--;
        }int count=0;
        for (int i = 0; i < num.length; i++) {
            if (val == num[i])
                count++;
        }if (count > num.length/2) System.out.print(val);
    }
    public static void main(String[] args){
        int[] num = {3,2,3,3,1,2,3};
        majority(num);
    }
}


/* better  tc worst(n), sc worst(n)
static void majority(int[] num){
    HashMap<Integer,Integer> hm = new HashMap<>();
    for (int i = 0; i < num.length; i++) {
        int count = hm.getOrDefault(num[i],0)+1;
        hm.put(num[i], count);

        if (count > num.length / 2) {
            System.out.println(num[i]);
            return;
        }
    }
}  */


/*  brute O(n^2)
static void majority(int[] num){

    for (int a = 0; a < num.length; a++) {
        int cnt=0;
        for (int b = 0; b < num.length; b++) {
            if (num[a]==num[b])
                cnt++;
        }
        if (cnt > num.length/2)
            System.out.println(num[a]);
        return;
    }
} */