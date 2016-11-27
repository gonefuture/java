package 字符串组合;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t=System.currentTimeMillis();
		String line="temp.log";
		
		System.out.println(System.currentTimeMillis()-t);
	}
	public static void f(String s){
		char[] cc = s.toCharArray();
		
		g(cc, 0);
	}
	public static void test(char[] cc){
		for(char c: cc) System.out.print(c + " ");
		System.out.println();
	}
	public static void g(char[] x, int k)
	{
		if(k==x.length-1){
			test(x);
			return;
		}
		
		for(int i=k; i<x.length; i++){
			//  所有元素都在k位置出现
			//System.out.println("in----");
			{ char t=x[i]; x[i]=x[k]; x[k]=t; }  //交换
			g(x, k+1);
			//System.out.println("out----");
			{ char t=x[i]; x[i]=x[k]; x[k]=t; }  //回溯
		}
	}
	
	

}
