package uniqueCharacters;

import java.util.Scanner;

public class UniqueCharacters {
    public StringBuilder show(StringBuilder sbr){
        for(int i=0;i<sbr.length();i++){
            int flag=0;
            for(int j=i+1;j<sbr.length();j++){
                if(sbr.charAt(i) == sbr.charAt(j)){
                    sbr.deleteCharAt(j);
                    j--;
                    flag++;
                }
            }
            if(flag>=1){
                sbr.deleteCharAt(i);
                i--;
            }
        }
        return sbr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sbr= new StringBuilder(str);
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        StringBuilder unique=new StringBuilder(uniqueCharacters.show(sbr));
        System.out.println("Unique Characters are:"+unique.toString());

    }
}
