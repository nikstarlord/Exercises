public class Cloning implements Cloneable {
    int age;
    String name;

    Cloning(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    protected java.lang.Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String args[]){
        try{
            Cloning cloning=new Cloning(20,"Nikhil");
            Cloning cloning1=(Cloning)cloning.clone();

            System.out.println(cloning.name+" is "+cloning.age+" years old");
            System.out.println(cloning1.name+" is "+cloning1.age+" years old");
        }
        catch (CloneNotSupportedException e){
        }
    }
}
