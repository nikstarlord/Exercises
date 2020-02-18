public class MetalChair extends Chair {
    public void stressTest(){
        System.out.println("Stress Test Passed");
    }
    public void fireTest(){
        System.out.println("Fire Test Passed");
    }

    @Override
    public String chairtype() {
        String s="Metal Chair";
        return s;
    }

}
