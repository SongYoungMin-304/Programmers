package ����ť;

import java.util.LinkedList;
import java.util.Queue;

public class �ֽİ��� {
	public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int max;
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        
        for(int a = 0; a < prices.length; a++) {
        	max = 0;
        	
        	for(int b = a+1; b < prices.length; b++) {
        		if(prices[a] > prices[b]) {
        			max++;
        			break;
        		}else {
        			max++;
        		}
        	}
        	queue.add(max);
        }
        
        int k = queue.size();
		System.out.println("�ۿ���"+k);
		
		for(int a = 0; a < k; a++) {
			
			answer[a] =  (int) queue.poll();
		}
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices = {1,2,3,2,3};
		�ֽİ��� a = new �ֽİ���();
		
		a.solution(prices);

	}

}
