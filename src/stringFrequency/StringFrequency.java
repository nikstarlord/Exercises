package stringFrequency;

import java.util.*;

public class StringFrequency {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(23);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(1);
        list.add(34);
        list.add(87);
        System.out.println(list);
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                    list.remove(j);
                    j--;
                }
            }
            map.put(list.get(i), count);
        }
        List<Map.Entry<Integer, Integer>> ls = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
        //System.out.println(ls);
        Collections.sort(ls, new Comparator<Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue()>o2.getValue()){
                    return  -1;
                }
                else if(o1.getValue()<o2.getValue()){
                    return 1;
                }
                else{
                    return 0;
                }
            }

        });
        for(Map.Entry<Integer,Integer> mp:ls){
            System.out.println(mp.getKey()+" Has Frequency:"+mp.getValue());
        }
    }
}
