import java.util.ArrayList;

class Data
{
    String From;
    String To;

    Data(String From , String To)
    {
        this.From = From;
        this.To = To;
    }

}


public class Tower_of_Hanoi {

    public static ArrayList<Data> Towers( int N , String from , String to , String via)
    {

        ArrayList<Data> moves = new ArrayList<>();

        if( N == 1 )
        {
            moves.add(new Data(from, to));
        }

        else
        {
            moves.addAll( Towers( N-1 , from , via , to ) );
            moves.addAll( Towers( 1 , from , to , via ) );
            moves.addAll( Towers( N-1 , via , to , from ) );
        }

        return moves;
    }

    public static void main(String[] args) {

        int N=3;

         ArrayList<Data> list = Towers( N , "A" , "B" , "C" );

         for( int i=0; i<list.size(); i++)
         {
            System.out.println( "Move <" + list.get(i).From + " , " + list.get(i).To + ">");
         }

    }
}
