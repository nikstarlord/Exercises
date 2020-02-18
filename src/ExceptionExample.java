public class ExceptionExample {
    public static void main(String args[]){
        try{
            int a=30;
            int b=a/0;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("I am in Finally");
        }
    }
}
