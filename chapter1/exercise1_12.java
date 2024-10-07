package chapter1;

public class exercise1_12 {
    public static void main(String[] args) {

        //convert mile to km
        double km = 24.0 * 1.6;

        //convert min,second to hour
        double hour = 1 + 40.0/60 + 35.0/3600;
        
        double speed = km / hour;
        System.out.printf("%.1f", speed);
        
    }
}
