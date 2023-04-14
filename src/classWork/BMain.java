package classWork;

import java.util.ArrayList;
import java.util.List;

public class BMain {

    public static void main(String args[]){
        List<Integer> numList  = new ArrayList<>()
        {{
            add(55);
            add(65);
            add(75);
            add(85);
        }};
        System.out.println(numList);
    }
}
