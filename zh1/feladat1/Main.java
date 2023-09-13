public class Main {
    public static void main(String[] args){ 
        DirectedGraph dg = new DirectedGraph();
        dg.addVertice('a');
        dg.addVertice('b');
        dg.addVertice('c');
        dg.addVertice('b');
        dg.addEdge('a', 'b');
        dg.addEdge('a', 'c');
        dg.addEdge('c', 'b');
        System.out.println(dg);
        System.out.println(dg.getVertices());
        System.out.println(dg.getNumberOfVertices());
        System.out.println(dg.getNumberOfEdges());
    }
}
