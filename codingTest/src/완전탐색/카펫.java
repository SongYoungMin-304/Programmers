package ¿ÏÀüÅ½»ö;

public class Ä«Æê {
	
	 public int[] solution(int brown, int yellow) {
	        int[] answer = new int[2];
	        
		for (int a = 1; a <= yellow; a++) {
			if(yellow%a == 0) {
				// 2 1 
				if(brown == (a+yellow/a)*2 + 4) {
					answer[0] = a+2; 
					answer[1] = yellow/a+2;
				}
			}

		}
	        return answer;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ä«Æê a = new Ä«Æê();
		int[] k = a.solution(10, 2);
		System.out.println(k[0]);
		System.out.println(k[1]);

	}

}
