package 스택큐;

import java.util.LinkedList;
import java.util.Queue;

// [93, 30, 55]	[1, 30, 5]	[2, 1]
// [7,  3,  9]
// 

public class 기능개발 {

	public int[] solution(int[] progresses, int[] speeds) {

		Queue<Integer> remain = new LinkedList<Integer>();
		Queue<Integer> result = new LinkedList<Integer>();

		// step 1 각자 남은 일 만큼 배열에 담는다.
		for (int a = 0; a < progresses.length; a++) {
			if ((100 - progresses[a]) % speeds[a] != 0)
				remain.add((100 - progresses[a]) / speeds[a] + 1);
			else {
				remain.add((100 - progresses[a]) / speeds[a]);
			}
		}
        
        // step  queue 에서 데이터를 뽕아서 기존보다 작은 데이터이면 숫자를 더하고 아니면 큐를 더한다.
		
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
		기능개발 a = new 기능개발();
		int []progresses = {97,96};
		int []speeds = {1,1};
		//         7 3 9
		int [] result = a.solution(progresses, speeds);
		
		for(int c = 0; c <result.length; c++) {
			System.out.println(result[c]);
		}

	}

}
