package n皇后;


public class Main {
	final static int N=8;
	static int[] col=new int[N+1];//记录列
	static int d=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stu

		int k=1;//记录行
		col[1]=0;
		while(k>0)
		{
			col[k]=col[k]+1;
			while((col[k]<=N)&&!place(k))
				col[k]=col[k]+1;
			if(col[k]<=N)
			{
				if(k==N){
					d++;
					print(col);
				}else{
					k=k+1;
					col[k]=0;
				}
			}else{
				k=k-1;
			}
		}
	}

	private static void print(int[] col) {
		// TODO Auto-generated method stub
		System.out.println(N+"皇后的解：");
		for (int i = 0; i < col.length; i++) {
			System.out.print(col[i]+" ");
		}
		System.out.println("d:"+d);
	}

	private static boolean place(int k) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<k)
		{
			if(col[i]==col[k]||Math.abs(col[i])==Math.abs(i-k))
			{
				return false;
			}
			i++;
		}
		return true;
	}

}
