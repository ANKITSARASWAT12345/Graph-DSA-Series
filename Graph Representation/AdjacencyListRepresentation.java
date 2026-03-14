import java.util.*;

class AdjacencyListRepresentation{



   // WAY 1: Array of ArrayLists (most common in interviews)

    static void buldWithArray(int V){
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(4).add(0);

      for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");

            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }

            System.out.println();
        }


    }


    //Way 2 HashMap<Integer, List<Integer>> (for non-integer or sparse nodes)
    static void buildWithHashMap(int V){
        Map<Integer,List<Integer>>adj=new HashMap<>();

        for(int i=0;i<V;i++){
            adj.put(i,new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);          
        adj.get(0).add(3);
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);

        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");

            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        buldWithArray(5);
        System.out.println();
        buildWithHashMap(5);
    }
}