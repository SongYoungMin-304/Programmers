package ����;

import ��.���ʰ�;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ����ū�� {
    public String solution(int[] numbers) {
        String answer = "";

        String[] k = new String[numbers.length];

        for(int a = 0; a < numbers.length; a++){
            k[a] = String.valueOf(numbers[a]);
        }

        Arrays.sort(k, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        for(String num : k){
            answer+=num;
        }

        if(answer.startsWith("0")){
            answer ="0";
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("�ۿ���");
        int []numbers = {6,10,2};
        ����ū�� a = new ����ū��();

        System.out.println(a.solution(numbers));
    }
}
