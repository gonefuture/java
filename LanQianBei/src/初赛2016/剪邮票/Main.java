package 初赛2016.剪邮票;
/***
剪邮票

如【图1.jpg】, 有12张连在一起的12生肖的邮票。
现在你要从中剪下5张来，要求必须是连着的。
（仅仅连接一个角不算相连）
比如，【图2.jpg】，【图3.jpg】中，粉红色所示部分就是合格的剪取。

请你计算，一共有多少种不同的剪取方法。

请填写表示方案数目的整数。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
*/
public class Main {
    static int cc[][] = {
            {1,1,0,0,1,0,0,0,0,0,0,0},
            {1,1,1,0,0,1,0,0,0,0,0,0},
            {0,1,1,1,0,0,1,0,0,0,0,0},
            {0,0,1,1,0,0,0,1,0,0,0,0},
            {1,0,0,0,1,1,0,0,1,0,0,0},
            {0,1,0,0,1,1,1,0,0,1,0,0},
            {0,0,1,0,0,1,1,1,0,0,1,0},
            {0,0,0,1,0,0,1,1,0,0,0,1},
            {0,0,0,0,1,0,0,0,1,1,0,0},
            {0,0,0,0,0,1,0,0,1,1,1,0},
            {0,0,0,0,0,0,1,0,0,1,1,1},
            {0,0,0,0,0,0,0,1,0,0,1,1},
    };
    public static void main(String[] args) {
        int a,b,c,d,e,sum=0;
        for(a=0;a<8;a++) {
        for(b=a+1;b<9;b++) {
        for(c=b+1;c<10;c++) {
        for(d=c+1;d<11;d++) {
        for(e=d+1;e<12;e++) {
            int z[] = {a,b,c,d,e};
            if(f(z)){
                System.out.println(a+1+" "+(b+1)+" "+(c+1)+" "+(d+1)+" "+(e+1));
                sum++;
            }
        }
        }
        }
        }
        }
        System.out.println(sum);
    }
    private static boolean f(int[] a) {
        int is[] = new int[5];
        is[0] = 1;
        g(a,0,is);
        int zz=0;
        for(int i:is){
            if(i==1)zz++;
        }
        if(zz==5) return true;
        return false;
    }
    private static void g(int[] a, int b, int[] c){
        for(int i=0;i<c.length;i++){
            if(c[i]==0){
                if(cc[a[b]][a[i]]==1){
                    c[i] = 1;
                    g(a,i,c);
                }
            }
        }
    }
}
