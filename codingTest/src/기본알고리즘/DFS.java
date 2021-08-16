package 기본알고리즘;

import java.util.LinkedList;

public class DFS {
	
	private int V;
	private boolean[]visited;
	private LinkedList<Integer>[] adj;
	
	public DFS(int V) {
		this.V = V;
		visited = new boolean[V];
		adj = new LinkedList[V];
		
		for(int a = 0; a < V; a++) {
			adj[a] = new LinkedList();
		}
	}
	
	public void connect(int a, int b) {
		adj[a].add(b);
		adj[b].add(a);
	}
	
	public void DFSFunction(int s) {
		System.out.println("값 출력:"+s);
		
		visited[s] = true;
		for(int a = 0; a < adj[s].size(); a++) {
			if(visited[adj[s].get(a)]!=true) {
				visited[adj[s].get(a)]=true;
				DFSFunction(adj[s].get(a));
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS dfs = new DFS(5);
		dfs.connect(0, 1);
		dfs.connect(0, 2);
		dfs.connect(1, 3);
		dfs.connect(2, 4);
		
		dfs.DFSFunction(0);
	}

}
