

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public void searchAlgorithm(Vertex root){
		
		Queue<Vertex> queue = new LinkedList<>();
		
		root.setVisited(true);
		queue.add(root);
		
		while( !queue.isEmpty() ){
			
			Vertex currentVertex = queue.remove();
			System.out.print(currentVertex+" ");
			
			for( Vertex vertex : currentVertex.getNeighbourList() ){
				if( !vertex.isVisited() ){
					vertex.setVisited(true);
					queue.add(vertex);
				}
			}			
		}
	}
}
