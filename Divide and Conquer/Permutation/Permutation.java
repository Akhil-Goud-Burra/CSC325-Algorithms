import java.util.ArrayList;

public class Permutation{

    public static ArrayList<String> permute( ArrayList<String> list , int list_size , int index , ArrayList<String> temp_list )
    {
        ArrayList<String> final_list = new ArrayList<>();

        if( list_size == 1 || index == 0) return temp_list;
        else
        {
            for( int i=0; i<=index; i++ )
            {
                ArrayList<String> _list= new ArrayList<>();
                _list.addAll(list);

                ArrayList<String> _temp= new ArrayList<>();
                _temp.addAll(temp_list);
                
                _temp.add( _list.get(i) );                
                _list.remove(i);
                final_list.addAll( permute(_list , (_list.size()) , (index-1) , _temp) );
            }
        }

        return final_list;
    }

public static void main(String[] args){
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> temp_list = new ArrayList<>();

    list.add("a");
    list.add("b");
    list.add("c");
    
    ArrayList<String> data = new ArrayList<>();
    data = permute(list , list.size() , (list.size()-1) , temp_list);

    for( int i=0; i<data.size(); i++)
    {
        System.out.println("<" + data.get(i) + ">");
    }
}

}