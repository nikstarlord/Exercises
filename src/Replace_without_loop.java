public class Replace_without_loop {
    public static void main(String args[]){
        String var="nikhil is good";
        int c=var.length()-var.replace("i","").length();
        System.out.println("Count of i is:"+c);
    }
}
