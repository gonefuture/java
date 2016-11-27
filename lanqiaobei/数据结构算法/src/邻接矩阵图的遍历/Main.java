package 邻接矩阵图的遍历;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 * @author zyw
 *无向邻接矩阵表示法的图的遍历
 */

public class Main {
	/*
	 *  1.matrix 为无向图的邻接矩阵的一个例子
	 *  2.每一行表示一个顶点
	 *  3.每一行的各个元素表示该顶点与其他顶点的关系
	 *  4.无向图的数据按对角线对称
	 *  5.矩阵中0表示该顶点与所对应的顶点没有边相连，1则表示有
	 *  6.该图的深度优先遍历的顺序应为：A B D C E F
	 *  7.该图的广度优先遍历的顺序应为：A B C D E F
	 */
  private static int matrix[][]=
		{
				{0,1,1,1,0,0},//A
				{1,0,0,1,0,0},//B
				{1,0,0,1,1,0},//C
				{1,1,1,0,0,1},//D
				{0,0,1,0,0,1},//E
				{0,0,0,1,1,0}//F
		};
   
  //每个顶点的数据表示，方便查看
  private static String str="ABCDEF";

	/**
	 * 非递归广度优先遍历邻接矩阵图
	 * @param line 遍历的起点
	 */
	public static void BFS(int line)
	{
		boolean[] isVisit=new boolean[6];//保存每个顶点是否访问过
		Arrays.fill(isVisit, false);
		int temp;
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.offer(line);//插入队列
		while (!queue.isEmpty()) {
			temp=queue.poll();
			
			if(!isVisit[temp])//如果没有访问过
			System.out.print(str.charAt(temp)+" ");//打印结果
			
			isVisit[temp]=true;//打完结果设为已访问
			for (int i = 0; i < isVisit.length; i++) {
				if(matrix[temp][i]==1&&!isVisit[i])
				{
					queue.offer(i);
				}
				
			}
			
		}
	}
	
	/**
	 * 非递归深度优先遍历邻接矩阵图
	 * @param line 遍历的起点
	 */
	public static void DFS2(int line) {
		Stack<Integer> stack=new Stack<Integer>();
		boolean[] isVisit=new boolean[6];//保存每个顶点是否访问过
		Arrays.fill(isVisit, false);
		stack.push(line);//第一个顶点入栈
		int temp;
		int cur = 0;
		boolean isFirst;
		while(!stack.empty()){//如果栈不为空
			temp=stack.pop();
			if(!isVisit[cur])
			System.out.print(str.charAt(temp)+" ");
			isFirst=true;//记录元素在矩阵的行中是否为第一个节点

			isVisit[temp]=true;
			for (int i = 0; i<isVisit.length; i++) {
				if (matrix[temp][i]==1&&!isVisit[i]) {//1说明有通路
					if (isFirst) {
						isFirst=false;
						cur=i;
					}else{
						stack.push(i);
					}
				}
			 }
			//每行第一个未被访问的顶点最后入栈
			if(!isVisit[cur])
			stack.push(cur);

		}

	}
	
	/**
	 * 递归法深度优先遍历邻接矩阵图
	 * @param line 遍历的起点
	 */
	static boolean[] isVisit=new boolean[6];
	
	public static void DFS1(int line) {
		  isVisit[line]=true;
		  System.out.print(str.charAt(line)+" ");
		for (int i= 0; i < isVisit.length; i++) {
				if(matrix[line][i]==1&&!isVisit[i])
				{
					DFS1(i);
				}
		}
	}
	
	/**
	 * 主函数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.fill(isVisit, false);
		System.out.println("递归式深度优先遍历邻接矩阵图");
		DFS1(0);
		
		System.out.println();
		System.out.println("非递归式深度优先遍历邻接矩阵图");
		DFS2(0);
		
		System.out.println();
		System.out.println("广度优先遍历邻接矩阵图");
		BFS(0);
	}
}
