package 稍大点的串;

	/* 
	 * 标题：稍大的串 
	 * 串可以按照字典序进行比较。例如： 
	 * abcd 小于 abdc 
	 * 如果给定一个串，打乱组成它的字母，重新排列，可以得到许多不同的串，在这些不同的串中，有一个串刚好比给定的串稍微大一些。 
	 * 科学地说：它是大于已知串的所有串中最小的串。你的任务就是求出这个“稍大的串”。 
	 * 例如： 
	 * 输入串： 
	 * abfxy 
	 * 程序应该输出： 
	 * abfyx 
	 * 再例如： 
	 * 输入串： 
	 * ayyyxxff 
	 * 程序应该输出： 
	 * fafxxyyy 
	 *  
	 *  数据规模约定： 
	 *  输入的串不超过1000个字符。 
	 *  特例： 
	 *  如果已知的串已经是所有重组串中最大的，则原样输出读入的那个串。
	 */	

	/**
	  找到某个排列的下一个相邻排列
	  比本排列大的所有排列中，选字典序最小的
	  
	  1. 逆向搜索一对相邻的元素，[x1,x2] 满足 [x1] < [x2], 若失败，则不存在下一个排列（本排列最大）
	  2. 逆向搜索一个元素 [y] 满足 [y]>[x1], 显然，最坏情况下，x2就是y，所以一定能找到
	  3. 交换: [x1] <--> [y]
	  4. [x2,...] x2以后的序列翻转
	*/

	import java.util.*;
	
	public class Main
	{
		static boolean f_next(char[] a){
			int x1 = -1;
			for(int i=a.length-1; i>0; i--) //逆向搜索
			{
				if(a[i-1]<a[i]){//如果后一个大于前一个
					x1 = i-1;//索引等于前一个
					break;
				}
			}
			    
			if(x1<0) return false;//如果找不到
			
			int x2 = x1 + 1;//x2存储后一个的索引
			int y = -1;
			
			for(int i=a.length-1; i>0; i--){
				if(a[i]>a[x1]){
					y = i;
					break;
				}
			}
			
			{char t = a[x1]; a[x1] = a[y]; a[y] = t;}
			
			y = a.length-1;
			while(true){
				if(x2>=y) break;
				char t = a[x2];
				a[x2] = a[y];
				a[y] = t;
				x2++;
				y--;
			}
			
			return true;
		}
		
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			
			char[] a = scan.nextLine().trim().toCharArray();
			f_next(a);  
			System.out.println();
			for(int i=0; i<a.length; i++){
				System.out.print(a[i]);
			}
			System.out.println();
		}
	}