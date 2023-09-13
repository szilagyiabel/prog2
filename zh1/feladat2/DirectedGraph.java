import java.util.*;

public class DirectedGraph {
    
    private Map<Character, Set<String>> graf = new HashMap<Character, Set<String>>();

     public DirectedGraph(){}

        public void addVertice(char vertice){
            if(!graf.containsKey(vertice)){
                graf.put(vertice, new HashSet<String>());
            }
        }

        public void addEdge(char a, char b) {
           StringBuilder sb = new StringBuilder();

            sb.append(a);
            sb.append(" -> ");
            sb.append(b);
            graf.get(a).add(sb.toString());
        }

        public String toString(){
            StringBuilder sb = new StringBuilder();
            for(char c : graf.keySet()){
                for(String s: this.graf.get(c)){
                    sb.append(s);
                    sb.append("\n");
                }
            }
            return sb.toString();

        }
        public String getVertices() {
            StringBuilder sb = new StringBuilder();
            sb.append("[ ");

            for(char c : graf.keySet())
            {
                sb.append(c);
                sb.append(", ");
            }
            sb.append("]");
            return sb.toString();
        }

        public int getNumberOfVertices()
        {
            return graf.size();
        }

        public int getNumberOfEdges() {
            int count = 0;

            for(char c : graf.keySet())
            {
                count += graf.get(c).size();
            }
            return count;
        }
}