package 初赛2012.奇怪的比赛;

public class Main {
	 public  void core(int[] a,int score,int r){  //以score和r来作为函数的出口。
	        if(r==10){  	//检验是否是出口
	            if(score==100){   //建分数是否达到条件
	                for(int i=0;i<10;i++){  
	                    System.out.print(a[i]);  
	                }  
	                System.out.println();             
	            }  
	            return;  
	        }  
	            a[r]=0;  
	            core(a,score-r-1,r+1);  
	            a[r]=1;  
	            core(a,2*score,r+1);  
	              
	        }  
	      
	    //start 提示：自动阅卷起始唯一标识，请勿删除或增加。   
	    public static void main(String args[])   
	    {   
	        int[] a=new int[10];  
	        new Main().core(a,10,0);  
	    }
}
	/*
    某电视台举办了低碳生活大奖赛。题目的计分规则相当奇怪：

    每位选手需要回答10个问题（其编号为1到10），越后面越有难度。答对的，当前分数翻倍；答错了则扣掉与题号相同的分数（选手必须回答问题，不回答按错误处理）。

    每位选手都有一个起步的分数为10分。

    某获胜选手最终得分刚好是100分，如果不让你看比赛过程，你能推断出他（她）哪个题目答对了，哪个题目答错了吗？

    如果把答对的记为1，答错的记为0，则10个题目的回答情况可以用仅含有1和0的串来表示。例如：0010110011 就是可能的情况。

    你的任务是算出所有可能情况。每个答案占一行。*/