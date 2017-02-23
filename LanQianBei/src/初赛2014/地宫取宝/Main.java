package 初赛2014.地宫取宝;

import java.util.Scanner;

public class Main {
	private static int count = 0;
	public void remove (int start, int end,int max,int s1[][],int x,int y, int x1, int y1 ){
		if(start > end) return ;
		if(x == x1-1 && y==y1-1){
			if(start == end){
				count++;
			} else{
				if(start == end-1 && s1[x][y] > max)
					count++;
			}
		}
		if(x+1 < x1){
			if(s1[x][y] > max){
				remove(start+1, end, s1[x][y], s1, x+1,y,x1,y1);
				remove(start,end,max,s1,x+1,y,x1,y1);
			}else{
				remove(start,end,max,s1,x+1,y,x1,y1);
			}
		}
		if(y+1 < y1){
			if(s1[x][y] > max){
				remove(start+1,end,s1[x][y],s1,x,y+1,x1,y1);
				remove(start, end, max, s1,x,y+1,x1,y1);
			} else {
				remove(start,end,max,s1,x,y+1,x1,y1);
			}
		}
	}
	
	public static void main(String[] args){
		int a,b,c;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		int[][] s = new int[a][b];
		for(int i = 0; i<a; i++ ){
			for(int j = 0; j<b; j++){
				s[i][j] = input.nextInt();
			}
		}
		Main main = new Main();
		main.remove(0, c, -1, s, 0, 0, a,b);
		System.out.println(count%1000000007);
	}
}
