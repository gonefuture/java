package 二叉树.遍历;

import java.util.*;
import java.io.*;
class BitNode
{
//声明一颗树的节点
	char data;
	BitNode LChild;
	BitNode RChild;
}

public class Main
{
	static BitNode[] bits=new BitNode[4];
	/*
	 *树的结构
	 *     R
	 *    / \
	 *   A   B
	 *  / \   
	 * C   D
	 *
	 */
	public static void createTree(BitNode root)
	{

		for (int i=0;i < 4;i++)
		{
			bits[i] = new BitNode();
			bits[i].data = (char)('A' + i);

		}
		root.data = 'R';
		root.LChild = bits[0];
		root.RChild = bits[1];
		bits[0].LChild = bits[2];
		bits[0].RChild = bits[3];
	}
	/*
	 * 后续遍历：
	 *从根节点出发，只要当前节点存在，或者栈不为空，重复下面的操作：
	 *（1）从当前节点开始，进栈并走左子树，直到左子树为空
	 *（2）如果栈顶节点的右子树为空，或者栈顶结点的右孩子为刚才访问过的节点，
	 *    则退栈并访问，然后将当前节点指针置为空。
	 *（3）否则走右子树。
	*/
	public static  void post2(BitNode root)
	{
		Stack<BitNode> stack=new Stack<BitNode>();
		BitNode p,q=null;
		p=root;
		while(p!=null||!stack.empty())
		{
			while(p!=null)
			{
				stack.push(p);
				p=p.LChild;
			}
			if(!stack.empty())
			{
				p=stack.peek();
				if(p.RChild==q||p.RChild==null)
				/*无右孩子，或着右孩子以遍历过*/
				{
					visit(stack.pop());//访问根节点
					q=p;//保存到q,为下一次已处理节点做前驱
					p=null;
				}
				else{
					p=p.RChild;
				}
			}
		}
	}

	public static  void post1(BitNode root)
	{
		if (root == null)
			return;
		post1(root.LChild);
		post1(root.RChild);
		visit(root);
	}
	/*
	* 中序遍历：
	*从根节点出发，只要当前节点存在，或者栈不为空，重复下面的操作：
    *（1）如果当前节点存在，则进栈并走左子树。
    *（2）否则退栈并访问，然后走右子树
	*/
	public static  void inorder2(BitNode root)
	{
		Stack<BitNode> stack=new Stack<BitNode>();
		BitNode p;
		p=root;
		while(p!=null||!stack.empty())
		{
			if(p!=null)
			{
				stack.push(p);
				p=p.LChild;
			}
			else
			{
				p=stack.pop();
				visit(p);
				p=p.RChild;
			}
			
		}
	}
	
	public static  void inorder1(BitNode root)
	{
		if (root == null)
			return;
		inorder1(root.LChild);
		visit(root);

		inorder1(root.RChild);
	}
	
	public static  void pre1(BitNode root)
	{
		if (root == null)
			return;
		visit(root);
		pre1(root.LChild);
		pre1(root.RChild);
	}


	public static  void pre2(BitNode root)
	{
		Stack<BitNode> stack=new Stack<BitNode>();
		stack.push(root);
		while (!stack.empty())
		{
			BitNode node=stack.pop();
			visit(node);
			if (node.RChild != null)
			{
				stack.push(node.RChild);
			}
			if (node.LChild != null)
			{
				stack.push(node.LChild);
			}
		}
	}
	
	public static void visit(BitNode bit)
	{
		System.out.print(bit.data);
	}
	public static void main(String[] args)
	{
		BitNode root=new BitNode();
		createTree(root);
		System.out.println("先序递归遍历");
		pre1(root);
		System.out.println("\n\n先序非递归遍历");
		pre2(root);
		System.out.println("\n\n中序递归遍历");
		inorder1(root);
		System.out.println("\n\n中序非递归遍历");
		inorder2(root);
		System.out.println("\n\n后序递归遍历");
		post1(root);
		System.out.println("\n\n后序非递归遍历");
		post2(root);
	}
}