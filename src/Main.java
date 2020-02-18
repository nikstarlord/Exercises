import jdk.jfr.StackTrace;

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }

    public synchronized Throwable fillInStackTrace(){
        return this;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("This is Custom Exception ");
        }
        catch (MyException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
