package ���̳ʺ�켱Ž��;

public class Ÿ�ٳѹ� {
    public int solution(int[] numbers, int target) {
        return dfs(numbers,0,0, target);
    }

    public int dfs(int []number, int node, int sum, int target){

        if(node == number.length){
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }

        return dfs(number, node+1, sum+number[node], target) + dfs(number, node+1, sum-number[node], target);
    }

    public static void main(String[] args) {
        Ÿ�ٳѹ� a = new Ÿ�ٳѹ�();
        int []numbers={1,1,1,1,1};
        System.out.println(a.solution(numbers, 3));
    }
}
