import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Data
{
    int Items;
    int Profit;
    int Weight;
    double P_by_W; // Profit / Weight.

    Data(int Items , int Profit , int Weight , double P_by_W )
    {
        this.Items=Items;
        this.Profit=Profit;
        this.Weight=Weight;
        this.P_by_W=P_by_W;
    }
}


public class Knapsack {
    
    public static void main(String[] args) {
        
        int Bag_weight = 15;

        ArrayList<Data> Bag = new ArrayList<>();

        Bag.add( new Data(1, 10, 2, 5) );
        Bag.add( new Data(2,5,3,1.3) );
        Bag.add( new Data(3,15,5,3) );
        Bag.add( new Data(4,7,7,1) );
        Bag.add( new Data(5,6,1,6) );
        Bag.add( new Data(6,18,4,4.5) );
        Bag.add( new Data(7,3,1,3) );


        // Sort items by profit-to-weight ratio in descending order
        Collections.sort
        (
            Bag, new Comparator<Data>() 
            {
                @Override
                public int compare(Data d1, Data d2) 
                {
                    return Double.compare(d2.P_by_W, d1.P_by_W);
                }
            }
        );


        double profit = 0;
        for( int i=0; i<Bag.size(); i++ )
        {
            if( Bag.get(i).Weight <= Bag_weight )
            {
                profit+=Bag.get(i).Profit;
                Bag_weight-=Bag.get(i).Weight;
            }
        }

        System.out.println(profit);
    }

}
