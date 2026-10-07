package Striver_Array_nard01;// Majority element -- moore voting algo - twice
public class MajorityElementTwo {
    static void funnc(int[] num) {
        int cnt1=0; int ele1=Integer.MIN_VALUE;
        int cnt2=0; int ele2=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (cnt1==0 && num[i] != ele2){
                ele1 = num[i];
                cnt1=1;
            } else if (cnt2==0 && num[i] != ele1) {
                ele2 = num[i];
                cnt2=1;
            }
            else if (num[i]==ele1) cnt1++;
            else if (num[i]==ele2) cnt2++;
            else{
                cnt1--; cnt2--;
            }
        }
        cnt1=0; cnt2=0;
        for (int i = 0; i < num.length; i++) {
            if (ele1==num[i]) cnt1++;
            if (ele2==num[i]) cnt2++;
        }
        if (cnt1 >= num.length/3+1) System.out.print(ele1+" ");
        if (cnt2 >= num.length/3+1) System.out.print(ele2+" ");
    }
    public static void main(String[] args) {
        int[] num = {4,4,4,3,1,3,3};
        funnc(num);
    }
}


/* brute o(n log n) + o(n)
static void func(int[] num){
    int cnt=1; int val = num[0];
    Arrays.sort(num);
    for(int i=1; i < num.length; i++){
        if (val == num[i])
            cnt++;
        else{
            cnt=1;
            val = num[i];
        }
        if (cnt == num.length/3+1) System.out.print(val+" ");
    }
} */
/* brute 2
static void funnc(int[] num) {
    List<Integer> al = new ArrayList<>();
    for (int x : num) {
        if (al.contains(x))
            continue;
        int cnt = 0;
        for (int y : num)
         if (x == y)
            cnt++;
        if (cnt > num.length / 3)
            al.add(x);
        if (al.size() == 2)
            break;
    }
    System.out.println(al);
}*/



/* better sc- (n), tc- (n)
static void funnc(int[] num){
    HashMap<Integer,Integer> hm = new HashMap<>();
    for (int i = 0; i < num.length; i++) {
        int count = hm.getOrDefault(num[i],0)+1;
        hm.put(num[i],count);

        if (count == num.length/3 + 1)
            System.out.print(num[i]+" ");
    }
}*/
