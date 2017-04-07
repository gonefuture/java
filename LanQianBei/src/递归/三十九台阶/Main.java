package 递归.三十九台阶;
/**
39级台阶，
1. 每步1或2阶
2. 必须是偶数步 
求上台阶的方案数。
------------------
没有偶数限制：
f(n) = f(n-1) + f(n-2)  

f(n)  必须偶数步
g(n)  必须奇数步

f(n) = g(n-1) + g(n-2)
g(n) = f(n-1) + f(n-1)

出口：
f(n)  n==0: 1   n==1: 0
g(n)  n==0: 0   n==1: 1
 */
public class Main {
	/*public static void main(String[] args) {
		System.out.println(f(39));
	}
	// n 级台阶，奇数步
	static int g(int n)
	{
		if(n==1) return 1;
		if(n==2) return 1;
		
		return f(n-1) + f(n-2);
	}
	
	// n 级台阶，偶数步
	static int f(int n)
	{
		if(n==1) return 0;
		if(n==2) return 1;
		//if(n==3) return 2;
		
		return g(n-1) + g(n-2);
	}*/
	 public static int count=0;  
	    public static void main(String[] args)   
	    {  
	     StepN(0,0);//台阶数和步数初始化为零  
	     System.out.println(count);  
	    }  
	    public static void StepN(int Bu, int Tai)   
	    {  
	     if(Tai>39)  
	     {  
	         return ;  
	     }  
	     if(Tai==39)  
	     {  
	         if(Bu%2==0)  
	         {  
	             count++;  
	         }  
	         return ;  
	     }  
	       
	     else  
	     {  
	        StepN(Bu+1,Tai+1);  
	        StepN(Bu+1,Tai+2);  
	     }  
	    }  
}
