public class WoodenTable extends Table {
    @Override
    public void stressTest() {
        System.out.println("Stress Test Passed....");
    }

    @Override
    public void fireTest() {
        System.out.println("Fire Test failed.... ");
    }

    @Override
    public String tableType() {
        String s="Wooden Table";
        return s;
    }
}
