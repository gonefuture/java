
package 递归.折半查找;


/**
 * @author zyw 
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 6, 8, 11, 23, 32, 65, 66, 66, 120,121 };// length==10
		int idx = find(arr, 121, 0, arr.length - 1);
		System.out.println(idx);
	}

	private static int find(int[] arr, int target, int low, int high) {
		// TODO Auto-generated method stub

		int mid=(low+high)/2;
		
		if (arr[mid] > target)
			return find(arr, target, low , mid-1);
		else if (arr[mid] < target)
			return find(arr, target, mid+1, high);
		else {
			return low;
		}

	}

}
