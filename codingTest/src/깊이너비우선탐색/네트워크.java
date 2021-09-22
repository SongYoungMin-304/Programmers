package 깊이너비우선탐색;

public class 네트워크 {

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean []visited = new boolean[computers.length];

        for(int a = 0; a < computers.length; a++){
            if(visited[a]!=true){
                answer++;
                dfs(computers, visited, a);
            }
        }



        return answer;
    }

    public void dfs(int [][]computers, boolean[]visited, int a){
        visited[a] = true;
        for(int b = 0; b < computers.length; b++){
            if(visited[b]!=true && computers[a][b]==1){
                dfs(computers, visited, b);
            }
        }
    }



    public static void main(String[] args) {
        int [][] a = {{1,1,0},{1,1,0},{0,0,1}};

        네트워크 네트워크 = new 네트워크();

        System.out.println(네트워크.solution(3,a));

    }
}
