package 완전탐색;

import java.util.LinkedList;
import java.util.Queue;

public class 소수찾기 {
	
	static int answer = 0;
	 
	public int solution(String numbers) {

		String[] song = new String[numbers.length()];
		

		for (int a = 0; a < numbers.length(); a++) {
			song[a] = numbers.substring(a, a + 1);
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		perm(song, 0, queue);

	
		return answer;
	}
	
	public void perm(String []arr, int depth, Queue<Integer>queue) {
		
		String s = "";

		for(int b = 0; b < depth; b++) {
			s+=arr[b];
		}
		
		if (s != null && s!="" && !queue.contains(Integer.parseInt(s))) {
			//System.out.println(s);
			System.out.println(Integer.parseInt(s));
			if(judge(Integer.parseInt(s))) {
				System.out.println("판단");
				answer++;
			}
			
			queue.add(Integer.parseInt(s));
		}
		for(int a = depth; a < arr.length; a++) {
			swap(arr, a, depth);
			perm(arr, depth+1,queue);
			swap(arr, depth,a);
		}
	}
	
	public boolean judge(int song) {
		if(song == 1 || song == 0) {
			return false;
		}
		
		for(int a = 2; a < song; a++) {
			if(song%a == 0)
				return false;
			}
		return true;
	}
	
	public void swap(String[]arr, int a, int b) {
		String t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		소수찾기 a = new 소수찾기();
		
		System.out.println(a.solution("011"));
		//System.out.println(a.solution("17"));

	}

}
