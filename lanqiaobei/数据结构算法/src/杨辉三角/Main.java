package 杨辉三角;
import java.util.*;

public class Main
{
	/*
	*      1
	*     1 1
	*    1 2 1
	*   1 3 3 1
	*  1 4 6 4 1
	*
	*以上，就是杨辉三角的实例
	*
	*/
	public static void main(String[] args)
	{
		Queue<Integer> queue=new LinkedList<Integer>();
		int m=5;
		int temp,x;
		queue.offer(1);
		for(int i=1;i<=m;i++)
		{
			queue.offer(1);
			for(int j=1;j<=i-2;j++)
			{
				temp=queue.poll();
				System.out.print(temp+" ");
				x=queue.peek();
				temp=temp+x;
				queue.offer(temp);
				
			}
			temp=queue.poll();
			System.out.print(temp+" ");
			System.out.println();
			queue.offer(1);
		}
		while(!queue.isEmpty())//打印最后一行
		{
			x=queue.poll();
			System.out.print(x+" ");
		}
	}
}
