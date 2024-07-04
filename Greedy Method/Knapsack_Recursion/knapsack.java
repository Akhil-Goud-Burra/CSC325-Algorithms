import java.util.ArrayList;

class Data
{
    int Items;
    int Weight;
    int Profit;

    Data(int Items , int Weight , int Profit )
    {
        this.Items=Items;
        this.Weight=Weight;
        this.Profit=Profit;
    }
}

class Compute
{
    Compute() {}

    public int Knapsack(ArrayList<Data> Bag, int Profit, int Bag_weight)
    {
        if( Bag_weight < 0  ) return 0;
        if( Bag.isEmpty()  ) return Profit;
        if( Bag_weight == 0 ) return Profit;

        //Step1: assigning bag to temp bag array.
        ArrayList<Data> Temp_Bag = new ArrayList<>();
        Temp_Bag.addAll(Bag);

        //Step2: Deleting first index from the temp_bag.
        Temp_Bag.remove(0);

        //Step3: Calculating Values for passing to the function call.
        int Current_profit = ( Profit + ( Bag.get(0).Profit ) );
        int Current_Weight = ( Bag_weight - ( Bag.get(0).Weight ) );

        //Step4: Choosing the Item.
        int Profit_A = Knapsack( Temp_Bag , Current_profit, Current_Weight );

        //Step4: Not Choosing the Item.
        int Profit_B = Knapsack( Temp_Bag , Profit, Bag_weight );

        //Step5: Finding Largest Profit.
        int Largest_Profit=0;
        if ( Profit_A > Profit_B ) Largest_Profit = Profit_A;
        else Largest_Profit = Profit_B;

        return Largest_Profit;
    }
}


public class knapsack {
    
    public static void main(String[] args) {
        
        int Bag_weight = 10;

        ArrayList<Data> Bag = new ArrayList<>();

        Bag.add( new Data(1, 1, 5) );
        Bag.add( new Data(2,2,3) );
        Bag.add( new Data(3,4,5) );
        Bag.add( new Data(4,2,3) );
        Bag.add( new Data(5,5,2) );

        Compute obj = new Compute();

        System.out.println("Final Profit:" +  obj.Knapsack(Bag, 0, Bag_weight) );
    }

}
