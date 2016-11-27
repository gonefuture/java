package 奇偶分离;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		separate(n);
	}
	private static void separate(int num) {
		List<Integer> ji=new ArrayList<Integer>();
		List<Integer> ou=new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			if(i%2==0)
			{
				ou.add(i);
			}else {
				ji.add(i);
			}
		}
		for (Iterator<Integer> iterator = ji.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer+" ");
		}
		System.out.println();
		for (Iterator<Integer> iterator = ou.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer+" ");
		}
		System.out.println();
	}
}
