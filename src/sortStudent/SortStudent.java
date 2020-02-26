package sortStudent;

import java.util.*;

public class SortStudent {
    private String name;
    private double age;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortStudent that = (SortStudent) o;
        return Double.compare(that.age, age) == 0 &&
                Double.compare(that.score, score) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }

    public static void main(String[] args) {
        SortStudent s1 = new SortStudent();
        SortStudent s2 = new SortStudent();
        SortStudent s3 = new SortStudent();
        SortStudent s4 = new SortStudent();
        s1.setAge(20);
        s1.setName("Aman");
        s1.setScore(435.6);
        s2.setName("Nikhil");
        s2.setScore(478.9);
        s2.setAge(20);
        s3.setScore(375.8);
        s3.setAge(23);
        s3.setName("Nitish");
        s4.setScore(375.8);
        s4.setAge(23);
        s4.setName("Nihal");
        List<SortStudent> list = new ArrayList<SortStudent>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.sort(list, new Comparator<SortStudent>() {
            @Override
            public int compare(SortStudent o1, SortStudent o2) {
                if(o1.getScore()>o2.getScore()){
                    return -1;
                }
                else if(o1.getScore()<o1.getScore()){
                    return 1;
                }
                else{
                    return o1.getName().compareTo(o2.getName());

                    }
                }
            });
        for(SortStudent s:list){
            System.out.println(s.getName()+" having Score:"+s.getScore());
        }
    }
}