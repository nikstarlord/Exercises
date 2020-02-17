public class Count_Repeat {
    public static void main(String args[]){
        int count=1;
        String str="Australia is a country whoose continent is also Australia";
        str = str.toLowerCase();
        String single[] = str.split(" ");
        int n=single.length;
        for(int i=0;i<n;i++)
        System.out.print(single[i]+" ");
        System.out.println("");
        for(int i=0;i<n;i++){
            count=1;
            for(int j=i+1;j<n;j++){
                if(single[i].equals(single[j])){
                    count++;
                    single[j]="0";
                }
            }
            if(count>1 && single[i]!="0")
                System.out.println(single[i]+" Having Count "+count);
        }

    }
}
