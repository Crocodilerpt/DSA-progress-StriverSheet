package Striver_Array_midium02;
public class SetMatrixZeros {
    static void setZero(int[][] num) {
        int col0 = 1;
        for (int i=0; i < num.length; i++) {
            for (int j=0; j < num.length; j++) {
                if (num[i][j] == 0){
                    num[i][0] = 0;
                    if (j!=0)
                        num[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }
        for (int i = 1; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if (num[i][j] != 0){
                    if (num[0][j]==0 || num[i][0]==0)
                        num[i][j] = 0;
                }
            }
        }
        if (num[0][0]==0){
            for (int j = 0; j < num.length; j++)
                num[0][j] = 0;
        }
        if (col0==0){
            for (int i = 0; i < num.length; i++)
                num[i][0] = 0;
        }
    }
    public static void main(String[] args) {
        int[][] num = {
                {0,1,1},
                {1,0,1},
                {1,1,1}};
        setZero(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j]);
            }
        }
    }
}



/* brute -- tc o(nxm nxm n+m)
static void setZero(int[][] num){
    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num.length; j++) {
            if(num[i][j]==0){
                row(num,j);
                col(num,i);
            }
        }
    }
    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num.length; j++) {
            if(num[i][j]==-1)
                num[i][j]=0;
        }
    }
}
static void row(int[][] num,int j){
    for (int i = 0; i < num.length; i++) {
        num[i][j] = -1;
    }
}
static void col(int[][] num,int i){
    for (int j = 0; j < num.length; j++) {
        num[i][j] = -1;
    }
}*/




/* better -- tc o(2xNxM), sc O(n)
static void setZero(int[][] num){
    int[] row = new int[num.length];
    int[] col = new int[num.length];
    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num.length; j++) {
            if (num[i][j]==0){
                row[i] = 2;
                col[j] = 2;
            }
        }
    }
    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num.length; j++) {
            if (col[j]==2 || row[i]==2)
                num[i][j]=0;
        }
    }
}*/



/*  optimal - chatgpt syntax
static void setZero(int[][] num) {
    int n = num.length;
    int m = num[0].length;
    int col0 = 1;
    for (int i = 0; i < n; i++) {
        if (num[i][0]==0) col0=0;
        for (int j = 0; j < m; j++) {
            if (num[i][j]==0){
                num[i][0] = 0;
                num[0][j] = 0;
            }
        }
    }
    for (int i = n-1; i>=0; i--) {
        for (int j = m-1; j>=1; j--) {
            if (num[0][j]==0 || num[i][0]==0)
                num[i][j] = 0;
        }
        if (col0==0) num[i][0]=0;
    }
}*/
