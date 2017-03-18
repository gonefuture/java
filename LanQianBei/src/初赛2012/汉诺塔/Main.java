package 初赛2012.汉诺塔;

public class Main {
	public static void main(String[] args) {
		System.out.println(f(64));     
		System.out.println(Math.pow(2, 64)); 
	}
	
	 static Double f(int n){  
	        if(n==2){  
	            return 3.0;   //当等于2时，就直接返回  
	        }  
	        else {  
	            return 2*f(n-1)+1;   
	        }
	 }
}
