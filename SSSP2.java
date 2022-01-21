public class SSSP2{

    private int nNodes;
    private int nEdges;
    private int[][] edges;
    
    final int MAX_NODES = 1000;
    final int MAX_EDGES = 1000000;

    public SSSP2(int nNodes, int nEdges, int[][] edges) throws IllegalArgumentException{

        if(nNodes < 0 || nNodes > MAX_NODES)
            throw new IllegalArgumentException("Number of nodes must be postive and no greater than 1,000");
        if(nEdges < 0 | nEdges > MAX_EDGES)
            throw new IllegalArgumentException("Number of edhes must be positive and no greater than 1,000,000");
        if( !(checkEdgeList(nNodes,nEdges,edges)) )
            throw new IllegalArgumentException("Invalid EdgeList");
        this.nNodes = nNodes;
        this.nEdges = nEdges;
        //Create 2D int arr with appropriate size
        int[][] e = new int[nEdges][3];
        //assign it to the edge list instance var
        e = edges;
        //and copy the contents of the 2D array into this new array  ------> for loop may be written the other way around
        for(int i = 0; i < e.length; i++){
            for(int j = 0; j < e[i].length; j++){
                e[i][j] = edges[i][j];
            }
        }

    }
    //======================================
    //Accessor
    public int getNumNodes(){
        return this.nNodes;
    }
    //Accessor
    public int getNumEdges(){
        return this.nEdges;
    }
    //======================================

        //int[][] edges;
        //edges = new int[5][10]
        //int row = edges.length;   <---- 5
        //int col = edges[0].length;<---- 10
    private boolean checkEdgeList(int nNodes, int nEdges, int[][] edges){
        if(edges == null || edges.length != nEdges)
            return false;
        for()
    }


    /*
    First line: four space seperated integers, n    m   q   s
                n = numNodes(1 <= n <= 1000)
                m = numEdges (directed) (0 <= m <= 1000000)
                q = numQueries(1 <= q <= n)
                s = indexOfStartNode(0 <= s <= (n-1))
    Then: followed by m lines, each contains three space-seperated integers x , y , w 
        (0 <= x,y <= (n-1), -2000 <= w 2000)
        Indicating that there is a directed edge from node x to node y with weight w

    Then: followed by q lines, each contains 1 integer x(0 <= x <=(n-1))
        Indicating a query of the form "what is the lenght of the shortest path from s to x ???"
    */
}