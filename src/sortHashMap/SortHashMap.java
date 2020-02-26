package sortHashMap;

import java.util.*;

public class SortHashMap {

    public void sorting(Map<String,Integer> hash){
        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(hash.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("Sorted Map:"+list);

    }
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<String,Integer>();
        map.put("First",23);
        map.put("Second",43);
        map.put("Third",63);
        map.put("Fourth",13);
        map.put("Fifth",93);
        map.put("Sixth",3);
        SortHashMap sortHashMap = new SortHashMap();
        sortHashMap.sorting(map);

    }
}
