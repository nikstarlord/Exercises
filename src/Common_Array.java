public class Common_Array {
    public static void main(String [] args){
        int[] a={1,2,3,4,5,6};
        int[] b={3,4,5,6,7,8,9};
        int n;
        if(a.length<b.length){
            n=a.length;
        }
        else
            n=b.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
