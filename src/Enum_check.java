public class Enum_check {
    public static void main(String args[]){

        for(House house:House.values()){
            System.out.println(house+" Having Cost:"+house.getPrice()+"M$");
        }

    }
}
