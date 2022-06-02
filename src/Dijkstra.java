import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import java.util.HashMap;

public class Dijkstra {
    public static int dijkstra(String line, String character) {
        char[] chars = line.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        if (character.equals("Human")) {
            map.put('S', 5);
            map.put('T', 3);
            map.put('W', 2);
            map.put('P', 1);
        }
        if (character.equals("Swamper")) {
            map.put('S', 2);
            map.put('T', 5);
            map.put('W', 2);
            map.put('P', 2);
        }
        if (character.equals("Woodman")) {
            map.put('S', 3);
            map.put('T', 2);
            map.put('W', 3);
            map.put('P', 2);
        }
        SimpleWeightedGraph<String, DefaultWeightedEdge> weightedGraph =
                new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
        weightedGraph.addVertex("a");
        weightedGraph.addVertex("b");
        weightedGraph.addVertex("c");
        weightedGraph.addVertex("d");
        weightedGraph.addVertex("e");
        weightedGraph.addVertex("f");
        weightedGraph.addVertex("g");
        weightedGraph.addVertex("h");
        weightedGraph.addVertex("i");
        weightedGraph.addVertex("j");
        weightedGraph.addVertex("k");
        weightedGraph.addVertex("l");
        weightedGraph.addVertex("n");
        weightedGraph.addVertex("m");
        weightedGraph.addVertex("o");
        weightedGraph.addVertex("p");
        DefaultWeightedEdge e1 = weightedGraph.addEdge("a", "b");
        weightedGraph.setEdgeWeight(e1, map.get(chars[i + 1]));
        DefaultWeightedEdge e2 = weightedGraph.addEdge("a", "e");
        weightedGraph.setEdgeWeight(e2, map.get(chars[i + 4]));
        DefaultWeightedEdge e3 = weightedGraph.addEdge("b", "c");
        weightedGraph.setEdgeWeight(e3, map.get(chars[i + 2]));
        DefaultWeightedEdge e4 = weightedGraph.addEdge("b", "f");
        weightedGraph.setEdgeWeight(e4, map.get(chars[i + 5]));
        DefaultWeightedEdge e5 = weightedGraph.addEdge("c", "d");
        weightedGraph.setEdgeWeight(e5, map.get(chars[i + 3]));
        DefaultWeightedEdge e6 = weightedGraph.addEdge("c", "g");
        weightedGraph.setEdgeWeight(e6, map.get(chars[i + 6]));
        DefaultWeightedEdge e7 = weightedGraph.addEdge("d", "h");
        weightedGraph.setEdgeWeight(e7, map.get(chars[i + 7]));
        DefaultWeightedEdge e8 = weightedGraph.addEdge("e", "f");
        weightedGraph.setEdgeWeight(e8, map.get(chars[i + 5]));
        DefaultWeightedEdge e9 = weightedGraph.addEdge("e", "i");
        weightedGraph.setEdgeWeight(e9, map.get(chars[i + 8]));
        DefaultWeightedEdge e10 = weightedGraph.addEdge("f", "g");
        weightedGraph.setEdgeWeight(e10, map.get(chars[i + 6]));
        DefaultWeightedEdge e11 = weightedGraph.addEdge("f", "j");
        weightedGraph.setEdgeWeight(e11, map.get(chars[i + 9]));
        DefaultWeightedEdge e12 = weightedGraph.addEdge("g", "h");
        weightedGraph.setEdgeWeight(e12, map.get(chars[i + 7]));
        DefaultWeightedEdge e13 = weightedGraph.addEdge("g", "k");
        weightedGraph.setEdgeWeight(e13, map.get(chars[i + 10]));
        DefaultWeightedEdge e14 = weightedGraph.addEdge("h", "l");
        weightedGraph.setEdgeWeight(e14, map.get(chars[i + 11]));
        DefaultWeightedEdge e15 = weightedGraph.addEdge("i", "j");
        weightedGraph.setEdgeWeight(e15, map.get(chars[i + 9]));
        DefaultWeightedEdge e16 = weightedGraph.addEdge("i", "m");
        weightedGraph.setEdgeWeight(e16, map.get(chars[i + 12]));
        DefaultWeightedEdge e17 = weightedGraph.addEdge("j", "k");
        weightedGraph.setEdgeWeight(e17, map.get(chars[i + 10]));
        DefaultWeightedEdge e18 = weightedGraph.addEdge("j", "n");
        weightedGraph.setEdgeWeight(e18, map.get(chars[i + 13]));
        DefaultWeightedEdge e19 = weightedGraph.addEdge("k", "l");
        weightedGraph.setEdgeWeight(e19, map.get(chars[i + 11]));
        DefaultWeightedEdge e20 = weightedGraph.addEdge("k", "o");
        weightedGraph.setEdgeWeight(e20, map.get(chars[i + 14]));
        DefaultWeightedEdge e21 = weightedGraph.addEdge("l", "p");
        weightedGraph.setEdgeWeight(e21, map.get(chars[i + 15]));
        DefaultWeightedEdge e22 = weightedGraph.addEdge("m", "n");
        weightedGraph.setEdgeWeight(e22, map.get(chars[i + 13]));
        DefaultWeightedEdge e23 = weightedGraph.addEdge("n", "o");
        weightedGraph.setEdgeWeight(e23, map.get(chars[i + 14]));
        DefaultWeightedEdge e24 = weightedGraph.addEdge("o", "p");
        weightedGraph.setEdgeWeight(e24, map.get(chars[i + 15]));
        DijkstraShortestPath dijkstraShortestPath
                = new DijkstraShortestPath(weightedGraph);
        int shortestPath = (int) dijkstraShortestPath.getPathWeight("a", "p");
        return shortestPath;
    }
}
