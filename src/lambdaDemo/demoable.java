package lambdaDemo;

@FunctionalInterface
public interface demoable {
    boolean compare(int a ,int b);

}

class Demo{
    public static void main(String[] args) {
        demoable demoable = (int a , int b)->{
          if(a>b)
              return true;
          else
              return false;
        };
        System.out.println(demoable.compare(4,6));
    }
}
