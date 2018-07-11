/**  
 * 
 * @Title:  HelloB.java   
 * @Package xin.gonefuture.java   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: qianweijian gonefuture@qq.com   
 * @date:   2018年7月9日 下午4:55:24   
 * @version V1.0 
 */
package xin.gonefuture.java;

/**
 * @author gonefuture
 *
 */
public class HelloB extends HelloA{
	
	{
		System.out.println("B的构造代码块");
	} 
	
	public HelloB() {
		System.out.println("B的构造器");
	}
	
	static {
		System.out.println("B的静态代码块");
	}
	

	//static HelloB helloB = new HelloB();
	
	public static void main(String[] args) {
		new HelloB();
	}
}


class HelloA {
	{
		System.out.println("A的构造代码块");
	}
	
	public HelloA() {
		System.out.println("A的构造器");
	}
	
	static {
		System.out.println("A的静态代码块");
	}
	

	
}
