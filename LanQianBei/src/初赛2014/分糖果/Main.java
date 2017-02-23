package 初赛2014.分糖果;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int i, b, count = 0,sum =0;
		for(i = 0; i < n; i ++){
			a[i] = sc.nextInt();
		}
		sc.close();
		while(true){
			for( i=0; i< n; i++){
				a[i] /=2;
			}
			b = a[0];
			for(i = 0; i< n-1; i++){
				a[i] += a[i+1];
			}
			a[n - 1]  += b;
			
			for(i =0; i< n; i++){
				if(a[i] %2 != 0){
					a[i] ++;
					count ++;
				}
			}
				for(i =1; i<n;i++){
					if(a[0] != a[i]){
						break;
					} else {
						sum++;
					}
				}
				if(sum == n-1){
					System.out.println(count);
					break;
				}
		}
	}

	
}
