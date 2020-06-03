

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

abstract class Cost {

    public static double cost(@NotNull HashMap<String, Double> n, String product){

       double cost=n.get(product);
       return cost;




    }

}
