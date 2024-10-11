package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Path_Finding {
    
    public static Boolean Search_Path( ArrayList<Boolean> Visited, int Source, int Destination, ArrayList<ArrayList<Integer>> data)
    {
        if( Source == Destination ) return true;
        if( Visited.get(Source) == true ) return false;

        Visited.add(Source, true);

        for( int i=0; i<data.get(Source).size(); i++ )// i = Intermediate Node
        {
            if(Visited.get(i) == false  && data.get(Source).get(i) == 1)
            {
                boolean Destination_Foud = Search_Path(Visited,i,Destination,data);

                if(Destination_Foud==true) return true;
            }
        }

        return false;
    }
    
    public static void main(String[] args) {

        int Source, Destination;
        
        // Creating a 2D ArrayList
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();

        // Adding data from the image
        data.add(new ArrayList<>(List.of(0, 1, 1, 0, 0, 0, 0, 0, 0)));
        data.add(new ArrayList<>(List.of(1, 0, 1, 1, 0, 0, 0, 0, 0)));
        data.add(new ArrayList<>(List.of(1, 1, 0, 0, 0, 0, 0, 0, 0)));
        data.add(new ArrayList<>(List.of(0, 1, 0, 0, 0, 0, 0, 0, 0)));
        data.add(new ArrayList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0)));
        data.add(new ArrayList<>(List.of(0, 0, 0, 0, 0, 0, 1, 1, 0)));
        data.add(new ArrayList<>(List.of(0, 0, 0, 0, 0, 1, 0, 1, 1)));
        data.add(new ArrayList<>(List.of(0, 0, 0, 0, 0, 1, 1, 0, 1)));
        data.add(new ArrayList<>(List.of(0, 0, 0, 0, 0, 0, 1, 1, 0)));


        Source=0;
        Destination=3;

        int vis_len = data.size();
        ArrayList<Boolean> Visited = new ArrayList<>( );
        for (int i = 0; i < vis_len; i++) {
            Visited.add(false);
        }

        Boolean Ans = Search_Path(Visited, Source, Destination, data);

        System.out.println(Ans);


    }

}

/*
 *         if( Visited.get(Source) == true ) return false;

        Visited.add(Source, true);
        
        for( int i=Source; i<data.get(Source).size(); i++ )
        {
            if( Visited.get(i) != true )
            {
                Boolean x = Search_Path( Visited, i, Destination, data );

                if( x == true ) return true;
            }
        }

        return false;
 */
