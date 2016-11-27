package 二叉树.翻转;

import java.util.LinkedList;

class BitNode
{
	//声明一颗树的节点
	char data;
	BitNode LChild;
	BitNode RChild;
}
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitNode root=new BitNode();
		createTree(root);
		reverse1(root);
		//reverse2(root);
		pre(root);
	}
	/**
	 * 翻转二叉树非 递归实现
	 * 
	 * @param root 
	 * 
	 * 反转后的二叉树的结构应该是这样子的
	 * 
	 *     R
	 *    / \
	 *   B   A
	 *  	/ \
	 *     D   C
	 */
	private static void  reverse2(BitNode root) {
		LinkedList<BitNode> stack=new LinkedList<BitNode>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			BitNode tempRoot=stack.pop();
			BitNode temp=tempRoot.LChild;
			tempRoot.LChild=tempRoot.RChild;
			tempRoot.RChild=temp;
			if(tempRoot.LChild!=null)
			{
				stack.push(tempRoot.LChild);
			}
			if(tempRoot.RChild!=null) 
			{
				stack.push(tempRoot.RChild);
			}
		}
	}
	/**
	 * 翻转二叉树递归实现
	 * 
	 * @param root 
	 * 
	 * 反转后的二叉树的结构应该是这样子的
	 * 
	 *     R
	 *    / \
	 *   B   A
	 *  	/ \
	 *     D   C
	 */
	private static void  reverse1(BitNode root) {
		if(root!=null)
		{
			BitNode temp=root.LChild;
			root.LChild=root.RChild;
			root.RChild=temp;
			reverse1(root.LChild);
			reverse1(root.RChild);
		}
	}
	
	/**
	 * 前序遍历
	 * 
	 * @root
	 */
	public static  void pre(BitNode root)
	{
		if (root == null)
			return;
		visit(root);
		pre(root.LChild);
		pre(root.RChild);
	}
	
	/**
	 * 访问节点
	 * @param bit
	 */
	public static void visit(BitNode bit)
	{
		System.out.print(bit.data);
	}
	static BitNode[] bits=new BitNode[4];
	
	/**
	 * 构造一棵二叉树
	 * 树的结构
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
}
