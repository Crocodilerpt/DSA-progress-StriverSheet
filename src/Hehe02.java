class Hehe02{
    static int prac(int[] a){
        int count=0;
        for(int i=0; i < a.length; i++){
            for (int j=i+1; j < a.length; j++){
                if (i < j && a[i] > (a[j]*2))
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {40,25,19,12,9,6,2};
        System.out.println(prac(arr));

    }
}
