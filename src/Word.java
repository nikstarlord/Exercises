import java.util.Scanner;

public class Word {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your words:");
        String str=sc.next();
        int i=0;
        do {
            if(str.charAt(0)==str.charAt(str.length()-1))
                System.out.println(str+" has First and last characters equal");
            else
                System.out.println(str+" has First and last characters not equal");
            str=sc.next();
        }while (!str.equals("done"));
    }
}
