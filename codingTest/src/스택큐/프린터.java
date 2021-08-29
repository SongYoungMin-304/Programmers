package ����ť;

import java.util.LinkedList;
import java.util.Queue;

public class ������ {
	
	public static class printer {
		int idx;
		int priority;
		
		public printer(int idx, int priority) {
			super();
			this.idx = idx;
			this.priority = priority;
		}

		public int getIdx() {
			return idx;
		}

		public void setIdx(int idx) {
			this.idx = idx;
		}

		public int getPriority() {
			return priority;
		}

		public void setPriority(int priority) {
			this.priority = priority;
		}
		
	}
	
	public int solution(int[] priorities, int location) {
		
		LinkedList<printer> queue = new LinkedList<printer>();
		int answer = 1;
		
		// ť�� ���
		for(int a = 0; a < priorities.length; a++) {
			printer p = new printer(a, priorities[a]);
			queue.add(p);
		}
		
		

		while(queue.size()!=0) {
			printer p = queue.getFirst();
			// 7 1 3 2
			for (int a = 0; a < queue.size(); a++) {
				
				if (p.priority < queue.get(a).priority) {
					queue.add(queue.getFirst());
					queue.removeFirst();
					p = queue.getFirst();
					a = 0;
				}
			}
			printer p2 = queue.poll();
			System.out.println("�ۿ��� üũ�ε���"+p2.idx);
			System.out.println("�ۿ��� üũ�켱����"+p2.priority);
			answer++;
			
			if(p2.idx == location) {
				return answer-1;
			}

		}
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                   //
		int [] priorities = {1, 1, 9, 1, 1, 1};   //3 2 2 1   2 2 1 
		//int [] priorities = {7, 1, 3, 2};
		//int location = 1;
		int location = 0;
		
		������ a = new ������();
		
		System.out.println(a.solution(priorities, location));

	}

}
