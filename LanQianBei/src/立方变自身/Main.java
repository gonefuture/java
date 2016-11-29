package 立方变自身;

			/*
			 * 立方变自身
			
			观察下面的现象,某个数字的立方，按位累加仍然等于自身。
			1^3 = 1 
			8^3  = 512    5+1+2=8
			17^3 = 4913   4+9+1+3=17
			...
			
			请你计算包括1,8,17在内，符合这个性质的正整数一共有多少个？
			
			请填写该数字，不要填写任何多余的内容或说明性的文字。
			 */
public class Main {
	
	public static void main(String[] args){
		int number = 0;
		Main main = new Main();
		for(int i=1; i<Integer.MAX_VALUE;i++){
			int s = i*i*i;
		if(i == main.sumDig(s)){
			System.out.println(i);
			number+=1;
		}
			
		}
		System.out.println("总数是："+number);
	}
	
	public int sumDig(int s){
		int result = 0;
		while( s != 0){
			result+=s%10;
			s/=10;
		}
		return result;
	}
}
