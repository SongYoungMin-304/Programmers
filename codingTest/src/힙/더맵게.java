package ��;

import ���̳ʺ�켱Ž��.Ÿ�ٳѹ�;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ���ʰ� {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();

        for(int scov : scoville){
            queue.add(scov);
        }

        while(queue.peek() < K){
            if(queue.size()==0){
                return -1;
            }
            int t1 = queue.poll();
            int t2 = queue.poll();
            int s = t1 + t2*2;
            queue.add(s);
            answer++;
        }

        return answer;
    }



    public static void main(String[] args) {
        int []a ={1, 2, 3, 9, 10, 12};

        ���ʰ� b = new ���ʰ�();

        System.out.println(b.solution(a,7));
    }
}
