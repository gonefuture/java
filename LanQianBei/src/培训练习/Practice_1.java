package 培训练习;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
	/*
	 * @钱伟健
	 * 
	 * 键盘录入数组然后排序输出
	 */
public class Practice_1 {
	/*
	 * 输入数组：{5,2,3,1,10},排序后输出
	 */
	
	static int[] num= new int[5];  //全局变量数组
	static ArrayList<Integer> numberList = new ArrayList<Integer>(); 
	
	public static void main(String[] args) {
		Practice_1 practice_1 = new Practice_1();  //面向对象就是那么麻烦，总是要New一个对象出来。
		//practice_1.input_1();
		practice_1.bufferedReader();
		
		//practice_1.bubbleSort();	//冒泡排序法
		//practice_1.arrayListSort(num); //整型数组的排序方法
		//Collections.sort(numberList);  //因为munberList里面的是Integer，所以不用重写compare			
		//practice_1.output_1(practice_1.insertSort(numberList));   //直接插入排序法
		//practice_1.output_1(practice_1.shellSort(numberList));       //希尔排序
		//practice_1.output_1(practice_1.selectSort(numberList));		  //选择排序
		practice_1.output_1(practice_1.heapSort(numberList));
		
		//practice_1.output_1();	//整型数组用增强逐个输出
		//System.out.print(numberList);
	}

//////////////////////                控制台获取数据和控制台显示数据的方法                      /////////////////////
	/*
	 * 利用Scanner输入，输入一个数字回车一次
	 */
	public void input_1(){                          
		System.out.println("请输入数字后回车，限定5个");
		for(int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            num[i]=(int)sc.nextInt(); 
		}	
	}
	/*
	 * 	java IO 、异常、正则的应用
	 */
	public void bufferedReader(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String read  =null;
		System.out.println("请输入数组，以 “，” 分隔，回车完成输入");
		try{
			read = br.readLine();
		} catch (IOException e){
			new RuntimeException(e);
		}
		
		//String [] array =read.split(",");     //利用split过滤掉“,”
		//numberList = Arrays.asList(array);

		Pattern pattern = Pattern.compile("[0-9]{1,12}");
		Matcher matcher = pattern.matcher(read);
		while(matcher.find()){
			numberList.add(Integer.valueOf(matcher.group()));
		}
	}
	
	
	public void output_1(){
		for(int j:num){				//增强for
			System.out.print(j+"\t");
		}
	}										
													//重载
	public void output_1(int[] num){
		for(int j:num){
			System.out.print(j+"\t");
		}
	}
	
	/*
	 * 		List变Array
	 */
	public int[] listToArray(ArrayList<Integer> list){  
        int[] array=new int[list.size()];
		for(int i=0;i<list.size();i++){  
	            array[i]=(int)list.get(i);  
	        }  
		return array;
	}	
	
/////////////////////////////          排序方法                           /////////////////////////////
	
	/*
	 * 	经典冒泡排序法  Bubble Sort
	 */
	public void bubbleSort(){
		int temp=0;
		for(int i =num.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(num[j] > num[j+1]){
					temp = num[j+1];
					num[j+1] = num[j];
					num[j] = temp;
				}
			}
		}
	}
	
	/*
	 * 	经典直接插入排序法
	 */
	public int[] insertSort(ArrayList<Integer> list){
		int[] array = listToArray(list);
		int temp=0;
		for(int i=1; i<array.length ; i++){
			int j = i-1;
			temp = array[i];
			for(;j>=0 && temp<array[j]; j-- ){
				array[j+1] = array[j];			//将大于temp的值整体后移一个单位				
			}
			array[j+1] = temp;
		}
		return array;
	}
	
	/*
	 * 	经典希尔排序法（最小增量排序法）
	 */
	public int[] shellSort(ArrayList<Integer> list){
		int[] array = listToArray(list);
		double d1 = array.length;
		int temp = 0;
		while(true){
			d1 = Math.ceil(d1/2);
			int d = (int) d1;
			for(int x=0; x<d; x++){
				for(int i=x+d; i<array.length; i+=d){
					int j = i-d;
					temp = array[i];
					for(; j>=0 && temp<array[j]; j-=d){
						array[j+d] = array[j];
					}
					array[j+d] = temp;
				}
			}
			if(d ==1) break;
		}
		
		return array;
	}
	
	
	/*
	 * 简单选择排序
	 */
	public int[] selectSort(ArrayList<Integer> list){
		int[] array = listToArray(list);
		int position = 0;
		for(int i = 0; i<array.length;i++){
			int j = i+1;
			position = i;
			int temp = array[i];
			for(; j<array.length; j++){
				if(array[j] < temp){
					temp =array[j];
					position =j;
				}
			}
			array[position] = array[i];
			array[i] = temp;
		}
		return  array;
	}
	
	
	/*
	 * 	堆排序	 (虽然学了堆和二叉树，但是这个排序算法还是不太懂)
	 */
	public int[] heapSort(ArrayList<Integer> list){
		int[] array = listToArray(list);
		//循环建堆
		for(int i=0; i<array.length-1; i++){
			//建堆
			buildMaxHeap(array,array.length-1-i);
			//交换堆顶和最后的一个元素
			swap(array,0,array.length-1-i);
		}	
		return array;
	}
	
	private void swap(int[] data, int i, int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	//对data数组从0到到lastIndex建大顶堆
	private void buildMaxHeap(int[] data, int lastIndex){
		//从lastIndex处节点（最后一个节点）的父节点开始
		for(int i=(lastIndex-1)/2; i>0; i--){
			
			//k处保存正在判断的节点
			int k=i;
			
			//如果当前k节点的子节点存在
			while(k*2+1 <= lastIndex){
				
				//k节点的左子节点的索引
				int biggerIndex = 2*k+1;
				
				//如果biggerIndex小于lastIndex,即biggerInddex+1代表的k节点的做子节点存在
				if(biggerIndex < lastIndex){
					
					//如果右子节点的值较大
					if(data[biggerIndex] < data[biggerIndex+1]){
						
						//biggerIndex总是记录较大子节点的索引
						biggerIndex++;
					}
				}
				
				//如果k节点的值小于其较大的子节点的值
				if(data[k] < data[biggerIndex]){
					
					//交换他们
					swap(data,k,biggerIndex);
					
					//将biggerIndex赋予k,开始while循环的下一次循环，重新保证k节点的值大于其左右节点的值
					k=biggerIndex;
				}else{
					break;
				}
			}
		}
	}

	/*
	 * 归并排序
	 */

	/*
	 * 	List的排序方法 
	 */
	public void arrayListSort(int[] num){
		/*ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(num));   //先将num转化为List，在转化为ArrayList
		Collections.sort(arrayList,new Comparator(){
			public int compare(Object o1, Object o2) {
				if( Integer.valueOf(o1.toString())> Integer.valueOf(o2.toString()))
					return 1;
				else if( Integer.valueOf(o1.toString())< Integer.valueOf(o2.toString()))
					return -1;
				else return 0;
				}
            });	*/	//本想通过Comparator来排序，事实证明那样既吃力又不讨好。
		
		Arrays.sort(num);        // 直接将整数数组排序的方法，一句搞定
	}
	
	
	
}
	
	