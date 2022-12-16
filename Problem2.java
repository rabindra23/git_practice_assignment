import java.util.*;
class Problem2 {
	static int distinct(int[] arr, int len)
	{
		HashSet<Integer> S = new HashSet<>();

		for (int i = 0; i < len; i++) {
			S.add(arr[i]);
		}
		int ans = S.size();
		return ans;
	}
	public static void main(String[] args)
	{
		int arr[] = {3,4,4,3,5,6,1,1,2,3,8,9,33};
		int l = arr.length;
		int dis_elements = distinct(arr, l);
		System.out.print(dis_elements + "\n");
	}
}

