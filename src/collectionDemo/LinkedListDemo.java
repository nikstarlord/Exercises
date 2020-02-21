package collectionDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        List<Integer> linked = new LinkedList<Integer>();
        long current = System.currentTimeMillis();
        for(int i=0;i<1E6;i++){
            linked.add(i);
        }
        long end= System.currentTimeMillis();
        System.out.println("Size of linked lIst:"+linked.size()+" Time taken is:"+(end-current)+" MS");
    }
}
