package ����Ž��;

import java.util.LinkedList;
import java.util.Queue;

public class ���ǰ�� {
	
	public int[] solution(int[] answers) {
        
        int []n1 = {1,2,3,4,5};
        int []n2 = {2,1,2,3,2,4,2,5};
        int []n3 = {3,3,1,1,2,2,4,4,5,5};
        
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        
        for(int a = 0; a < answers.length; a++) {
        	
        	if(n1[a%5] == answers[a]) {
        		t1++;
        	}
        	if(n2[a%8] == answers[a]) {
        		t2++;
        	}
        	if(n3[a%10] == answers[a]) {
        		t3++;
        	}
        }
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        if(t1 >= t2 && t1 >= t3) {
        	queue.add(1);
        }
        if(t2 >= t1 && t2 >= t3) {
        	queue.add(2);
        }
        if(t3 >= t2 && t3 >= t1) {
        	queue.add(3);
        }
        
        int i = 0;
        
        int[] answer = new int[queue.size()];
        
        while(queue.size()!=0) {
        	System.out.println("üŷ");
        	answer[i++] = queue.poll();
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ���ǰ�� a = new ���ǰ��();
		 int []answer = {1,2,3,4,5};
		 
		 int[] song = a.solution(answer);
		 
		 /*for(int k : song) {
			 System.out.println(k);
		 }*/

	}

}
