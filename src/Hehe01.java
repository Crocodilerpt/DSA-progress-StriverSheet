class Hehe01 {// Set Matrix Zero ----------  optimal
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
}
    public static void main(String[] args) {
        int[][] num = {
                {0,1,1},
                {1,1,1},
                {0,1,1}};
        setZero(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++)
                System.out.print(num[i][j]);
        }
    }
}