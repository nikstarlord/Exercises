public class Lower_Percent {
    public static void main(String args[]){
        String str="Nikhil@1999";
        char [] ch=str.toCharArray();
        int lower_count=0,capital_count=0,number_count=0,special_count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(ch[i]))
                lower_count++;
            else if(Character.isUpperCase(ch[i]))
                capital_count++;
            else if(Character.isDigit(ch[i]))
                number_count++;
            else
                special_count++;
        }
        float n=ch.length;
        float lower_percent=((lower_count)/n)*100;
        float capital_percent=((capital_count)/n)*100;
        float number_percent=((number_count)/n)*100;
        float special_percent=((special_count)/n)*100;
        System.out.println("Lowercase Letters count:"+lower_count+" Percentage:"+lower_percent);
        System.out.println("Capital Letters count:"+capital_count+" Percentage:"+capital_percent);
        System.out.println("Numbers count:"+number_count+" Percentage:"+number_percent);
        System.out.println("Special Letters count:"+special_count+" Percentage:"+special_percent);
    }
}
