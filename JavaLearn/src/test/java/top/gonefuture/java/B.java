package top.gonefuture.java;
import top.gonefuture.java.B;

/**  
 * 
class B{    
	public static B t1 = new B();    
	public static B t2 = new B();  
	{        
		
		System.out.println("构造块");    }   
	static    {        System.out.println("静态块");    }    
	public static void main(String[] args)   
	{        B t = new B();    }
	
}  * @Title:  B.java   
 * @Package    
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: qianweijian gonefuture@qq.com   
 * @date:   2018年7月9日 下午4:19:08   
 * @version V1.0 
 */

/**
 * @author gonefuture
 *
 */
public class B {
 
		public static B t1 = new B();    
		public static B t2 = new B();  
		{        
			
			System.out.println("构造块");   
		} 
		
	static { 
		System.out.println("静态块");  
		}    
	
	
	public static void main(String[] args)   
	{        B t = new B();    }


}
