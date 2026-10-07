package Striver_Array_midium02; // core of qn : combination (nCr)
public class PascalsTriangleOne {
    static void func(int row){
        // generate the pascals triangle :)
        for (int i = 0; i < row; i++) {
            int ans=1;
            for (int j=0; j <= i; j++) {
                System.out.print(ans+" ");
                ans = (ans * (i-j)) / (j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 5;
        func(row);
    }
}


/* element of that position -- brute factorial(r)
static int pascal(int r, int c) {
    int nFac = factorial(r);
    int rFac = factorial(c);
    int nMr = factorial(r - c);
    return nFac / (rFac * nMr);
}
static int factorial(int n) {
    int result = 1;
    for (int i = 2; i <= n; i++)
        result *= i;

    return result;
}
System.out.println(pascal(row, col));
*/

/* element of that position -- optimal o(n)
static int pascal(int r, int c) {
    int ans = 1;
    for(int i=0; i < c; i++)
        ans = ans * (r - i) / (i + 1);

    return ans;
}*/


/* print nth row of the triangle -- brute o(n*r)
static void pascal(int r) {
    for (int c = 0; c <= r; c++)
        System.out.print(func(r, c) + " ");
}
static int func(int r,int c){
    int ans = 1;
    for (int i=0; i < c; i++)
        ans = (ans * (r - i)) / (i + 1);

    return ans;
}
public static void main(String[] args) {
    int row = 5;
    pascal(row-1);
} */


/* print nth row -- optimal
static int func(int r){
    int ans = 1;
    for (int i=0; i <= r; i++) {
        System.out.print(ans+" ");
        ans = (ans * (r - i)) / (i + 1);
    }
    return ans;
}
public static void main(String[] args) {
    int row = 5;
    func(row-1);
}
--------- alternative -------------------
            int ans = 1;
        System.out.print(1+" ");
            for (int i=1; i < r; i++) {
                ans = ans * (r - i);
                ans = ans/i;
                System.out.print(ans+" ");
        }
 */
