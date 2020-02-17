public class Count_twice {
    public static void main(String args[]){
        int [] ar={1,1,2,2,3,4,4,5,5};
        int no=ar[0];
        for(int i=1;i<ar.length;i++){
            no = no^ar[i];
        }
        System.out.println(no);
    }
}
