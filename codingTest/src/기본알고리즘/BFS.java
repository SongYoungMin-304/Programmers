package 기본알고리즘;

import java.util.LinkedList;

public class BFS {
	private int V;
	private LinkedList<Integer>[] adj;
	
	public BFS(int V) {
		this.V = V;
		adj = new LinkedList[V];
		for(int a = 0; a < V; a++) {
			adj[a] = new  LinkedList();
		}
	}
	
	public  void connect(int a, int b) {
		adj[a].add(b);
		adj[b].add(a);
	}
	
	public void BFSFunction(int s) {
		boolean[]visited = new boolean[V];
		
		LinkedList<Integer> queue = new LinkedList();
		
		visited[s] = true;
		queue.add(s);
		
		while(queue.size()!=0) {
			int t = queue.poll();
			
			System.out.println("T 출력: "+t);
			
			for(int a = 0; a < adj[t].size(); a++) {
				if(visited[adj[t].get(a)]!= true) {
					visited[adj[t].get(a)]  = true;
					queue.add(adj[t].get(a));
				}
			}
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS bfs = new BFS(5);
		bfs.connect(0, 1);
		bfs.connect(0, 2);
		bfs.connect(1, 3);
		bfs.connect(2, 4);
		
		bfs.BFSFunction(0);
	}

}
