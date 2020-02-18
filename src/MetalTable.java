public class MetalTable extends Table {
    @Override
    public void stressTest() {
        System.out.println("Stress Test Passed....");
    }

    @Override
    public void fireTest() {
        System.out.println("Fire Test Passed....");
    }

    @Override
    public String tableType() {
        String s="Metal Table";
        return s;
    }
}
