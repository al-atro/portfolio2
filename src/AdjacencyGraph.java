import java.util.ArrayList;

public class AdjacencyGraph {
    ArrayList<Vertex> Vertices;

    public AdjacencyGraph() {
        Vertices = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex v) {
        Vertices.add(v);
    }

    // here we add a way to create the path between two cities. IMPORTANT: the path is undirected
    public void addEdge(Vertex from, Vertex to, Integer distance) {
        if (!(Vertices.contains(from) && Vertices.contains(to))) {
            System.out.println("Vertices missing from graph");
            return;
        }
        Edge newE = new Edge(from, to, distance);
        from.OutEdge.add(newE);
        Edge newE2 = new Edge(to, from, distance);
        to.OutEdge.add(newE2);
    }

    // here we create a way for out graph to be displayed
    public void PrintGraph() {
        for (int i = 0; i < Vertices.size(); i++) {
            System.out.println("City " + Vertices.get(i).name + " is connected to: ");
            Vertex current = Vertices.get(i);
            for (Edge e : current.OutEdge) {
                System.out.println(e.to.name + ", the distance is " + e.weight);
            }
        }
    }

// here we implement the Prim's algorithm
    public int PrimsMST() {
        Vertices.get(0).distance = 0;
        MinHeap<Vertex> Q = new MinHeap<>();
        for (int i = 0; i < Vertices.size(); i++) {
            Q.Insert(Vertices.get(i));
        }
        int MST = 0;
        while (!Q.isEmpty()) {

            Vertex u = Q.extractMin();
            MST = MST + u.distance;
            u.visited = true;
            //uncomment these lines to see the structure of the graph
            //System.out.println(MST+", "+u.distance+", "+u.name);
            //System.out.println();
            for (Edge iterator : u.OutEdge) {
                if (!iterator.to.visited) {
                    if (iterator.to.distance > iterator.weight) {
                        iterator.to.distance = iterator.weight;
                        int pos = Q.getPosition(iterator.to);
                        Q.decreasekey(pos);
                        //uncomment this line to see the structure of the MST
                        //System.out.println(iterator.weight+", "+ iterator.to.distance+", "+ iterator.to.name);
                    }
                }
            }

        }
        return MST;

    }
    // here we display the final distance between all cities, as well as the total cost of the electric grid
    public void PrintMST(){
        int MST = PrimsMST();
        System.out.println("The total distance is "+MST+".");
        System.out.println("The total cost is "+MST*1000000+" DKK.");
    }

}



// here we add the class for the cities
class Vertex implements Comparable<Vertex> {
    Integer distance=Integer.MAX_VALUE;
    Vertex prev = null;
    boolean visited = false;
    String name;
    ArrayList<Edge> OutEdge;
    public Vertex(String name){
        this.name=name;
        OutEdge=new ArrayList<Edge>();
    }

    @Override
    public int compareTo(Vertex o) {
        return this.distance.compareTo(o.distance);
    }

}
// here we add the class for the paths between the cities
class Edge{
    Vertex from;
    Vertex to;
    Integer weight;
    public Edge(Vertex from,Vertex to, Integer weight){
        this.from=from;
        this.to=to;
        this.weight=weight;
        from.OutEdge.add(this);
    }
}

