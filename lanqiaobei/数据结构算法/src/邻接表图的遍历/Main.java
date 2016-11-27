package 邻接表图的遍历;

import java.util.*;


public class Main {

	/**
	 * @author zyw
	 *无向邻接表表示法的图的遍历
	 */
	private static class Vertex{
	    String data;//顶点的数据
		int idx;//顶点的索引
		int[] vertexs;//存储与该顶点所连的顶点
	}//图的顶点的定义,赋值就不要修改他的字段的值

	private static Vertex[] list=new Vertex[6];
	

	/**
	 * 无向邻接表表示法图的深度优先遍历
	 * @param vertex 开始遍历的顶点
	 */
	private static void DFS(Vertex vertex) {
		
		Stack<Vertex> stack=new Stack<Vertex>();//深度优先遍历用栈存储
		Vertex tempVertex,firstVertex = null;
		boolean[] isVisit=new boolean[6];//用于标记每个顶点是否被访问过
		Arrays.fill(isVisit,false);
		
		stack.push(vertex);
		
		boolean isFirst=false;
		
		while(!stack.empty())
		{
			tempVertex=stack.pop();
			//如果没有被访问过才访问
			if(!isVisit[tempVertex.idx]){
				isVisit[tempVertex.idx]=true;
				System.out.print(tempVertex.data+" ");
			}
			isFirst=true;
			for(int i=0;i<tempVertex.vertexs.length;i++)
			{
				
				if(!isVisit[list[tempVertex.idx].vertexs[i]])
				{
					if(isFirst)
					{
						//记录第一个节点
						firstVertex=list[list[tempVertex.idx].vertexs[i]];
						isFirst=false;
						
					}else{
						//表中非第一个节点入栈
						//请注意这个长长的数据访问
						stack.push(list[list[tempVertex.idx].vertexs[i]]);
						
					}
				}
			}
			//第一个节点最后入栈
			if(!isVisit[firstVertex.idx])
			{
				stack.push(firstVertex);
			}
		}
	}
	
	/**
	 * 无向邻接表表示法图的深度优先遍历
	 * @param vertex 开始遍历的顶点
	 */
	private static void BFS(Vertex vertex) {
		Queue<Vertex> queue=new LinkedList<Vertex>();//广度优先遍历用队列存储
		boolean[] isVisit=new boolean[6];//用于标记每个顶点是否被访问过
		Arrays.fill(isVisit,false);
		Vertex tempVertex;
		
		queue.offer(vertex);
		while(!queue.isEmpty())
		{
			tempVertex=queue.poll();
			if(!isVisit[tempVertex.idx])
			{
				isVisit[tempVertex.idx]=true;
			    System.out.print(tempVertex.data+" ");
			}
			for (int i = 0; i < list[tempVertex.idx].vertexs.length; i++) {
				if(!isVisit[list[tempVertex.idx].vertexs[i]]){
					//请注意这个长长的数据访问
					queue.offer(list[list[tempVertex.idx].vertexs[i]]);
				}
			}
		}
	}

	/**
	 * 主函数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		create();
		System.out.println("无向邻接表表示的图的深度优先遍历");
		DFS(list[0]);
		System.out.println("\n无向邻接表表示的图的广度优先遍历");
		BFS(list[0]);
	}

	/**
	 * 构造无向邻接表表示法图
	 */
	private static void create() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < list.length; i++) {
			list[i]=new Vertex();
			list[i].idx=i;
		}
		list[0].vertexs=new int[]{1,2,3};
		list[0].data="A";
		
		list[1].vertexs=new int[]{0,3};
		list[1].data="B";
		
		list[2].vertexs=new int[]{0,3,4};
		list[2].data="C";
		
		list[3].vertexs=new int[]{0,1,2,5};
		list[3].data="D";
		
		list[4].vertexs=new int[]{2,3};
		list[4].data="E";
		
		list[5].vertexs=new int[]{3,4};
		list[5].data="F";
	}

}
