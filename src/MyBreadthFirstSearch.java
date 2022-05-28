
    import java.util.LinkedList;

import java.util.Map;
import java.util.Queue;

    public class MyBreadthFirstSearch<T> extends Search<T>{
        public void BFS(MyWeightedGraph<Vertex> graph) {
            Map<T, Vertex<T>> map = graph.vertexDictionary();
            for (Vertex<T> vertex : map.values()) {
                if (!vertex.isVisited()) {
                    bfc(graph, vertex);
                }

            }

        }

        public void bfc(MyWeightedGraph<T> graph, T current) {
            current.setDistance(0);
            current.setPrevious(null);
            Queue<T> queue = new LinkedList<Vertex>();
            queue.add(T);
            while (queue.size() > 0) {
                current = queue.remove();

                System.out.println(current);
                for (Item v : current.adjList()) {
                    Vertex<Item> vertexObject = graph.getVertex(v);
                    if (!vertexObject.isVisited()) {
                        vertexObject.setVisited();
                        vertexObject.setDistance(vertexObject.getDistance() + 1);
                        vertexObject.setPrevious(vertex);
                        queue.add(vertexObject);
                    }

                }
            }

        }
}
