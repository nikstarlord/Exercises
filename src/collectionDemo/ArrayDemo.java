package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        long start=System.currentTimeMillis();
        for(int i=0;i<1E6;i++){
            list.add(i);
        }
       // System.out.println(list.get(0));
        long end=System.currentTimeMillis();
        System.out.println("Size of the list:"+list.size()+" Time taken is:"+(end-start)+" MS");
    }
}
