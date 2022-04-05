public class Main {

    public static void main(String[] args) {
       // here we display the graph
        AdjacencyGraph adjDirectedG = electricityGrid();
        //uncomment to see the graph
       // adjDirectedG.PrintGraph();
        adjDirectedG.PrintMST();

    }
// here we add the cities and the paths to the graph
    public static AdjacencyGraph electricityGrid(){
        AdjacencyGraph newG=new AdjacencyGraph();
        Vertex Eskildstrup =new Vertex("Eskildstrup");
        Vertex Haslev=new Vertex("Haslev");
        Vertex Holbæk=new Vertex("Holbæk");
        Vertex Jærgerspris=new Vertex("Jærgerspris");
        Vertex Kalundborg=new Vertex("Kalundborg");
        Vertex Korsør=new Vertex("Korsør");
        Vertex Køge=new Vertex("Køge");
        Vertex Maribo=new Vertex("Maribo");
        Vertex Nakskov=new Vertex("Nakskov");
        Vertex Nykøbing_F=new Vertex("Nykøbing F");
        Vertex Næstved=new Vertex("Næstved");
        Vertex Ringsted=new Vertex("Ringsted");
        Vertex Roskilde=new Vertex("Roskilde");
        Vertex Slagelse=new Vertex("Slagelse");
        Vertex Sorø=new Vertex("Sorø");
        Vertex Vordingborg=new Vertex("Vordingborg");
        newG.addVertex(Eskildstrup);
        newG.addVertex(Haslev);
        newG.addVertex(Holbæk);
        newG.addVertex(Jærgerspris);
        newG.addVertex(Kalundborg);
        newG.addVertex(Korsør);
        newG.addVertex(Køge);
        newG.addVertex(Maribo);
        newG.addVertex(Nakskov);
        newG.addVertex(Nykøbing_F);
        newG.addVertex(Næstved);
        newG.addVertex(Ringsted);
        newG.addVertex(Roskilde);
        newG.addVertex(Slagelse);
        newG.addVertex(Sorø);
        newG.addVertex(Vordingborg);

        newG.addEdge(Eskildstrup,Maribo,28);
        newG.addEdge(Eskildstrup,Nykøbing_F,13);
        newG.addEdge(Eskildstrup,Vordingborg,24);
        newG.addEdge(Haslev,Korsør,60);
        newG.addEdge(Haslev,Køge,24);
        newG.addEdge(Haslev,Næstved,25);
        newG.addEdge(Haslev,Ringsted,19);
        newG.addEdge(Haslev,Roskilde,47);
        newG.addEdge(Haslev,Slagelse,48);
        newG.addEdge(Haslev,Sorø,34);
        newG.addEdge(Haslev,Vordingborg,40);
        newG.addEdge(Holbæk,Jærgerspris,34);
        newG.addEdge(Holbæk,Kalundborg,44);
        newG.addEdge(Holbæk,Korsør,66);
        newG.addEdge(Holbæk,Ringsted,36);
        newG.addEdge(Holbæk,Roskilde,32);
        newG.addEdge(Holbæk,Slagelse,46);
        newG.addEdge(Holbæk,Sorø,34);
        newG.addEdge(Jærgerspris,Korsør,95);
        newG.addEdge(Jærgerspris,Køge,58);
        newG.addEdge(Jærgerspris,Ringsted,56);
        newG.addEdge(Jærgerspris,Roskilde,33);
        newG.addEdge(Jærgerspris,Slagelse,74);
        newG.addEdge(Jærgerspris,Sorø,63);
        newG.addEdge(Kalundborg,Ringsted,62);
        newG.addEdge(Kalundborg,Roskilde,70);
        newG.addEdge(Kalundborg,Slagelse,39);
        newG.addEdge(Kalundborg,Sorø,51);
        newG.addEdge(Korsør,Næstved,45);
        newG.addEdge(Korsør,Slagelse,20);
        newG.addEdge(Køge,Næstved,45);
        newG.addEdge(Køge,Ringsted,28);
        newG.addEdge(Køge,Roskilde,25);
        newG.addEdge(Køge,Vordingborg,60);
        newG.addEdge(Maribo,Nakskov,27);
        newG.addEdge(Maribo,Nykøbing_F,26);
        newG.addEdge(Næstved,Roskilde,57);
        newG.addEdge(Næstved,Ringsted,26);
        newG.addEdge(Næstved,Slagelse,37);
        newG.addEdge(Næstved,Sorø,32);
        newG.addEdge(Næstved,Vordingborg,28);
        newG.addEdge(Ringsted,Vordingborg,58);
        newG.addEdge(Ringsted,Roskilde,31);
        newG.addEdge(Ringsted,Sorø,15);
        newG.addEdge(Slagelse,Sorø,14);

        return newG;
    }

}
