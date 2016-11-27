package 二叉搜索树;


class BitNode
{
	//声明一颗树的节点
	int data;
	BitNode leftChild;
	BitNode rightChild;
	
	public BitNode(int data)
	{
		this.data=data;
	}
	
	
	/**
	 * 删除比较麻烦
	 * @param data
	 */
	public void remove(int data)
	{
		
	}
	/**
	 * @param node
	 * @param data
	 */
	public void insert(BitNode node,int data) {
		if(node.data==data)
			return;
		else if(data<node.data)
		{
			if(node.leftChild==null)
			{
				node.leftChild=new BitNode(data);
			}else {
				insert(node.leftChild, data);
			}
		}
		else if(data>node.data){
			if(node.rightChild==null)
			{
				node.rightChild=new BitNode(data);
			}else {
				insert(node.rightChild, data);
			}
		}
	}
	public static void pre(BitNode node) {
		if(node!=null)
		{
			pre(node.leftChild);
			System.out.print(node.data+" ");
			pre(node.rightChild);

		}
	}
}

public class Main {

	//	二叉查找树（Binary Search Tree），（又：二叉搜索树，二叉排序树）它或者是一棵空树，或者是具有下列性质的二叉树： 
	//	若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 
	//	若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值；
	//	它的左、右子树也分别为二叉排序树。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitNode root=new BitNode(379);
		root.insert(root, 69);
		root.insert(root, 88);
		root.insert(root, 56);
		BitNode.pre(root);
	}

	
}
