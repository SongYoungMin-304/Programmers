package 정렬;

import 힙.더맵게;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 가장큰수 {
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
        System.out.println("송영민");
        int []numbers = {6,10,2};
        가장큰수 a = new 가장큰수();

        System.out.println(a.solution(numbers));
    }
}
