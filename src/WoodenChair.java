public class WoodenChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("Stress Test Failed");
    }

    @Override
    public void fireTest() {
        System.out.println("Fire test Failed");
    }

    @Override
    public String chairtype() {
        String s="Wooden Chair";
        return s;
    }
}
