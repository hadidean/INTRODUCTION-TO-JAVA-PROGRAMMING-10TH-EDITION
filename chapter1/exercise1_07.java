package chapter1;

public class exercise1_7 {
    public static void main(String[] args) {
        double x = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        double y = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);

        //kenapa guna 1.0 dlm per
        //sbb nak ambil nombor decimal di belakang
        //klu guna integer (1), dia x ambil decimal di blkg, hanya ambil no bulat
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(Math.PI);
        
        // int intResult = 1 / 3;       // Integer division
        // double floatResult = 1.0 / 3; // Floating-point division

        // System.out.println("Integer division (1 / 3): " + intResult);       // Output: 0
        // System.out.println("Floating-point division (1.0 / 3): " + floatResult); // Output: 0.3333333333333333

        
    }
    
}
