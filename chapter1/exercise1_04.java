package chapter1;

public class exercise1_4 {
    public static void main(String[] args) {
    //     System.out.println( "a\t a^2\t a^3\t" +
    //                         "\n1\t 1\t 1\t" + 
    //                         "\n2\t 4\t 8\t" +
    //                         "\n3\t 9\t 27\t" +
    //                         "\n4\t 16\t 64\t");

            int num = 4;
            System.out.println("a a^2 a^3");
            for (int row = 1; row <= num; row++){
                System.out.println(row + " " + row*row + " " + row*row*row);
            }
    }
  
        
    
    
}
