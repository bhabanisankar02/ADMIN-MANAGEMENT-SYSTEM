import java.util.*;

public class DFS {
    private int numVertices;
    private List<List<Integer>> adLists;
    private Stack<Integer> stack;
    private int[] colors;
    private boolean[] visited;

    public DFS(int numvertices){
        this.numVertices=numvertices;
        this.adLists=new ArrayList<>();
        this.stack=new Stack<>();
        this.colors = new int[numvertices];
        this.visited = new boolean[numvertices];
    
        for(int i =0; i < numVertices;i++){
            this.adLists.add(new ArrayList<>());
        }
    }
        public void addEdge(int src , int dest) {
            this.adLists.get(src).add(dest);
        }

        public void DFSVisit(int vertex){
            this.colors[vertex] = 1;
            this.visited[vertex]=true;

            System.out.print(vertex + " ");

            for(int neighbor : this.adLists.get(vertex)){
                if (!this.visited[neighbor]){
                    this.DFSVisit(neighbor);
                }
            }

            this.colors[vertex]=2;
            this.stack.push(vertex);
        }

        public void DFSTwo(){
            for(int i=0; i< this.numVertices;i++){
                if(!this.visited[i]){
                    this.DFSVisit(i);
                }
            }

            while (!this.stack.isEmpty()){
                System.out.print(this.stack.pop() + " ");
            }
        }
         public static void main (String[]args){

            DFS dfs = new DFS(5);
            dfs.addEdge(0,1);
            dfs.addEdge(0,2);
            dfs.addEdge(1,3);
            dfs.addEdge(1,4);

            System.out.println("Depth-First Search: ");
            dfs.DFSTwo();
            return;
         }
        
    }



