package 回溯算法;
/****
 *    a(1)          a(4)          a(7)
 *   ————————  +  ————————   =  ————————
 *   a(2)(3)      a(5)a(6)       a(8)a(9)
 * 
 *a(1)~a(9)是1~9
 */

public class Demo1 {
	public static void main(String[] args ){
		int[] a = new int[10];
		int  g,i=1,s=0,m1,m2,m3;
		 a[1] = 1;
		
		while(true) {
			g=1;
			for(int k=i-1; k>=1;k--) 
				if(a[i]==a[k]) {g=0; break;}  //两个数相同，标记g=0
				if(i==9 && g==1 && a[1]<a[4]) {
					 m1= a[2]*10+a[3];
					 m2= a[5]*10+a[6];
					 m3= a[8]*10+a[9];
					 if(a[1]*m2*m3+a[4]*m1*m3 == a[7]*m1*m2) {  //判断等式
						 s++;
						 System.out.println(s);          //输出一个解
					 }
					 if(i<9 && g==1) {
						 i++;
						 a[1]= 1;
						 continue;
					 } //不到九个数继续
					 while(a[i] == 9 && i>1) i--;   //往前回溯
					 if(a[i] == 9 && i==1) break;
					 else a[i]++;   //至第1个数为9结束
					 }	
		}
	}	
}
