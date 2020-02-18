public class Sorting {
    public static void main(String args[]){
        String str="Nikhil";
        str=str.toLowerCase();
        char temp;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if((int)ch[i]>=(int)ch[j]){
                  temp=ch[i];
                  ch[i]=ch[j];
                  ch[j]=temp;
                }
            }
        }
        //for(int i=0;i<ch.length;i++)
        //System.out.println(ch[i]);
        String br=new String(ch);
        System.out.println(br);
    }
}
