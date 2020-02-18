public class DayHourMinuteSec {
    public static void main(String[] args) {
        int t=90080;
        int d=0,day=86400,hour=3600,minute=60;
        int h=0;
        int m=0;
        int s=0;
        d=t/day;
        t=t%day;
        h=t/hour;
        t=t%hour;
        m=t/minute;
        t=t%minute;
        s=t;
        //System.out.println(t);
        System.out.println("Day:"+d+" Hour:"+h+" Minute:"+m+" Second:"+s);
    }
}
