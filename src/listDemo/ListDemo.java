package listDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        float sum = 0;
        List<Float> list = new ArrayList<Float>();
        list.add(2.0f);
        list.add(3.5f);
        list.add(4.0f);
        list.add(4.5f);
        list.add(5.5f);
        Iterator<Float> iter = list.iterator();
        while(iter.hasNext()){
            sum+=iter.next();
        }
        System.out.println("Sum of List values:"+sum);

    }
}
