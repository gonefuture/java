package 初赛2013.振兴中华;
/**
	从我做起振
	我做起振兴
	做起振兴中
	起振兴中华
	
 *	1.建立二维数组，文字以整数方式录入。
 *  2.递归算法，判断四个方向是否是通路，dfs
 *  3.用数组记录路径，若路径相同，则继续递归
 */

public class Main {
	
	static int [][] s={ {1,2,3,4,5},
						{2,3,4,5,6},
						{3,4,5,6,7},
						{4,5,6,7,8}
	};
	
	static int a=0;
	static int b=0;
	static int[] temp = new int[8];
	
	public static void main(String[] args){
		kfc(0,0,s);
		System.out.println(b);
		
	}
	
	public static void kfc(int y, int x, int s[][]){
		//如果x或y等于界限，返回
		if(y==4 || x==5)
			return;
		int i;
		temp[a]=s[y][x];
		a++;
		if(y==3 && x==4){
			for( i=0;i<7;i++){
				if(temp[i] != i+1)
					break;
			}
			if(i == 7){
				b++;
			}
			kfc(y+1,x,s);  
		    kfc(y,x+1,s);  
		    if(y!=3 && x!=4)  
		        a--;  
		}
		
		
	}

}
