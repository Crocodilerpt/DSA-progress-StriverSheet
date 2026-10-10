package Striver_Array_easy01;// sorted array remove duplicate
public class RemoveDuplicateArr {
    static int rmvDupli(int[] num) {
        int i=0;
        if (num.length == 0) return 0;
        for (int j = 1; j < num.length; j++) {
            if (num[i] != num[j]){
                num[i+1]=num[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        int[] num = {1,1,2,2,2,3,4,4,5};
        int an = rmvDupli(num);
        for (int a=0;a<an;a++) System.out.print(num[a]+" ");

    }
}

/* better tc o(n), sc o(n).
static void rmvDupli(int[] num) {
    HashSet<Integer> hs = new HashSet<>();
    for (int i = 0; i < num.length; i++) {
        hs.add(num[i]);
    }
    System.out.println(hs);
}*/

/*
static void rmvDupli(int[] num) {
    for (int i = 0; i < num.length; i++) {
        if (i==0 || num[i] != num[i-1])
            System.out.print(num[i]+" ");
    }
}*/