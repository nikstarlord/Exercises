import java.util.Arrays;

public class Reverse_String {
    public static void main(String args[]){
        String ar="Nikhil Sharma";
        StringBuilder br=new StringBuilder();
        br.append(ar);
        System.out.println("Reversed string:"+br.reverse());
        StringBuffer abr=new StringBuffer();
        abr.append(br);
        //System.out.println(abr);
        StringBuffer nn=new StringBuffer();
        nn.append(abr.substring(0,4));
        nn.append(abr.substring(9));
        //abr=st1;
        System.out.println("Removed String:"+nn);
    }
}
