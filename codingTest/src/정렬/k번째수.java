package ����;

import ���̳ʺ�켱Ž��.Ÿ�ٳѹ�;

import java.util.Arrays;

public class k��°�� {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int a = 0; a < commands.length; a++){
            int []temp = new int[commands[a][1]-commands[a][0]+1];

            int start = commands[a][0];
            int end = commands[a][1];
            int k = commands[a][2];

            int t = 0;

            for(int b = commands[a][0] -1; b <= commands[a][1]-1; b++)
            {
                temp[t++] = array[b];
            }

            Arrays.sort(temp);

            answer[a] = temp[k-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("�ۿ���");
        int [] array = {1, 5, 2, 6, 3, 7, 4};
        int [][] commands ={
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };

        k��°�� a = new k��°��();
        System.out.println(a.solution(array, commands));

        for(int b : a.solution(array, commands)){
            System.out.println(b);
        }
    }
}
