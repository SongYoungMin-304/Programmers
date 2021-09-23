package Èü;

import ±íÀÌ³Êºñ¿ì¼±Å½»ö.Å¸°Ù³Ñ¹ö;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ´õ¸Ê°Ô {
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

        ´õ¸Ê°Ô b = new ´õ¸Ê°Ô();

        System.out.println(b.solution(a,7));
    }
}
