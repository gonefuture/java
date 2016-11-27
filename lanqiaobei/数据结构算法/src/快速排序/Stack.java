package 快速排序;

import java.util.LinkedList;

public class Stack<E> {

	LinkedList<E> list;
	public Stack()
	{
		list=new LinkedList<E>();
	}
	public void push(E e)
	{
		list.add(e);
	}
	public E pop()
	{
		return list.removeLast();
	}
	
	public boolean empty()
	{
		return list.size()==0;
	}
}
