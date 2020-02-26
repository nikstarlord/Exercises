package stringOccurance;

import java.util.Scanner;

public class StringOccurance {
    public void show(StringBuilder sbr){
        for(int i=0;i<sbr.length();i++){
            int count=1;
            for(int j=i+1;j<sbr.length();j++){
                if(sbr.charAt(i) == sbr.charAt(j)){
                    count++;
                    sbr.deleteCharAt(j);
                    j--;
                }
            }
            System.out.println(sbr.charAt(i)+" Has Frequency:"+count);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter String...");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        StringOccurance stringOccurance = new StringOccurance();
        stringOccurance.show(sb);

    }
}
