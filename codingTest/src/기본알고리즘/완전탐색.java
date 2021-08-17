package 기본알고리즘;

public class 완전탐색 {

	public void perm(int []arr, int depth) {
		
		if(depth == arr.length) {
			for(int a = 0; a < arr.length; a++) {
				System.out.print(arr[a]);
			}
			System.out.println();
		}
		
		for(int a = depth; a < arr.length; a++) {
			swap(arr, a, depth);
			perm(arr, depth+1);
			swap(arr, depth,a);
		}
	}
	
	public void swap(int []arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	
	public static void main(String[] args) {
		int[] list = { 1, 2, 3 };

		완전탐색 a = new 완전탐색();

		a.perm(list, 0);

	}

}
