public class ClassNotFound {
    public static void main(String args[]){
        try{
            Class.forName("Nikhil");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
