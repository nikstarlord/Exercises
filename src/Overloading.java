public class Overloading {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public float mul(float a,float b){
        return a*b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public String fun(String a, String b){
        return a+b;
    }
    public String fun(String a,String b,String c){
        return a+b+c;
    }
    public static void main(String args[]){
        Overloading ovr=new Overloading();
        System.out.println(ovr.add(5,6));
        System.out.println(ovr.add(5.4,6.5));
        System.out.println(ovr.mul((float)2,(float) 4));
        System.out.println(ovr.mul(5,6));
        System.out.println(ovr.fun("Nikhil","Sharma"));
        System.out.println(ovr.fun("Nikhil","Sharma","Is"));
    }
}
