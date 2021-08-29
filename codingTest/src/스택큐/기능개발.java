package ����ť;

import java.util.LinkedList;
import java.util.Queue;

// [93, 30, 55]	[1, 30, 5]	[2, 1]
// [7,  3,  9]
// 

public class ��ɰ��� {

	public int[] solution(int[] progresses, int[] speeds) {

		Queue<Integer> remain = new LinkedList<Integer>();
		Queue<Integer> result = new LinkedList<Integer>();

		// step 1 ���� ���� �� ��ŭ �迭�� ��´�.
		for (int a = 0; a < progresses.length; a++) {
			if ((100 - progresses[a]) % speeds[a] != 0)
				remain.add((100 - progresses[a]) / speeds[a] + 1);
			else {
				remain.add((100 - progresses[a]) / speeds[a]);
			}
		}
        
        // step  queue ���� �����͸� �;Ƽ� �������� ���� �������̸� ���ڸ� ���ϰ� �ƴϸ� ť�� ���Ѵ�.
		
		int first = remain.poll();
		int temp = 1;
		
		//       7 3 9 
		while(remain.size()!=0) {
			
			int queue = remain.peek();
			if(first >= queue) {
				temp++;
				remain.poll();
				if(remain.size()==0) {
					result.add(temp);
				}
			}else {
				result.add(temp);
				temp = 0;
				first = queue;
			}
		}

        
        int[] answer = new int[result.size()];
        
        int i =0;
        while(result.size()!=0) {
        	answer[i] = result.poll();
        	i++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		��ɰ��� a = new ��ɰ���();
		int []progresses = {97,96};
		int []speeds = {1,1};
		//         7 3 9
		int [] result = a.solution(progresses, speeds);
		
		for(int c = 0; c <result.length; c++) {
			System.out.println(result[c]);
		}

	}

}
