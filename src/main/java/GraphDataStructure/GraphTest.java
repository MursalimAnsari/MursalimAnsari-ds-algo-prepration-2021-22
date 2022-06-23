package GraphDataStructure;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class GraphTest {

	public void doTraversal(int A, int[][] B) {

		ArrayList<Integer>[] adj = new ArrayList[A];

		// List<Integer>[] adj = new LinkedList[A];

		for (int i = 0; i < A; i++) {
			adj[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < B.length; i++) {
			int src = B[i][0];
			int des = B[i][1];
			adj[src].add(des);
			adj[des].add(src);
		}
		boolean[] visited = new boolean[A];
		/************
		 * DFS ************ int component = 0;
		 * 
		 * for (int i = 0; i < A; i++) {
		 * if (visited[i] == false) { dfs(adj, i,visited); component += 1;
		 * }
		 *   }
		 * System.out.println(component);
		 ****************/

		// BFS
		for (int i = 0; i < A; i++) {
			if (visited[i] == false) {
				bfs(adj, i, visited);
			}
		}
	}

	private void bfs(ArrayList<Integer>[] adj, int source, boolean[] visited) {

//	 Queue<Integer> que=new LinkedList<Integer>();
		Queue<Integer> que = new ArrayDeque<Integer>();
		que.offer(source);
		while (!que.isEmpty()) {
			int src = que.poll();
			if (visited[src])
				continue;
			System.out.println(src);
			visited[src] = true;

			for (int des : adj[src]) {
				if (visited[des] == false)
					que.offer(des);
			}
		}
	}
	private void dfs(ArrayList<Integer>[] adj, int src, boolean[] visited) {

		System.out.println(src);
		visited[src] = true;
		ArrayList<Integer> list = adj[src];
		for (int des : list) {
			if (visited[des] == false) {
				dfs(adj, des, visited);
			}
		}
	}

	public static void main(String[] args) {
		int[][] B = { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 3, 4 } };
		new GraphTest().doTraversal(5, B);

	}

}
