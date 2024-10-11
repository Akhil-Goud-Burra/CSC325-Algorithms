import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Depth_First_Search
{
    ArrayList<ArrayList<Integer>> data;
    
    Stack<Integer> stack;
    
    int vis_len;
    
    ArrayList<Boolean> Visited;
    
    public Depth_First_Search()
    {
        data = new ArrayList<>();
        
        data.add(new ArrayList<>(List.of(0,0,0,1,1)));
        data.add(new ArrayList<>(List.of(0,0,0,1,1)));
        data.add(new ArrayList<>(List.of(0,0,0,1,1)));
        data.add(new ArrayList<>(List.of(1,1,1,0,0)));
        data.add(new ArrayList<>(List.of(1,1,1,0,0)));
        
        vis_len = data.size();
        Visited = new ArrayList<>( );
        for (int i = 0; i < vis_len; i++) {
            Visited.add(false);
        }
        
        stack = new Stack<>();
    }
    
    public void DFS(int Source)
    {
        //Step1: Add node to the visited Array.
        Visited.set(Source,true);
        
        //Step2: Add node in to the stack.
        stack.push(Source);
        
        System.out.println(stack);
        
        //Step3: Explore the Connected Edges
        for(int i=0; i<data.get(Source).size(); i++)
        {
            if(Visited.get(i) == false && data.get(Source).get(i) == 1)
            {
                DFS(i);
            }
            
        }
        
        stack.pop();
        return;
    }
}

public class DepthFirstSearch 
{
    
    public static void main(String[] args) {
        
        int Source =4;
        
        Depth_First_Search obj = new Depth_First_Search();
        
        obj.DFS(Source);
    }
}
