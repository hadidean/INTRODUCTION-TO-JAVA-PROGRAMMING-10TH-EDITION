package chapter1;

public class exercise1_6 {
    public static void main(String[] args) {
        // int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
        // System.out.println(sum);

        
        int sum = 0;

        for (int y = 1; y <= 9; y++) {
            sum += y;
            // kenapa x boleh letak print di dalam for?
            //sbb sum declare di luar loop for
        }

        System.out.print(sum);

       
    
        
    }    
}
