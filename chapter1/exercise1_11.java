package chapter1;

public class exercise1_11 {
    public static void main(String[] args) {

        //Seconds in a year
        double secondinYear = 365 * 24 * 60 * 60;
        
        System.out.println(secondinYear);

        //birth, death, immigrant in year
        double birthSec = 7.0;
        double deathSec = 13.0;
        double ImmigSec = 45.0;

        double birthperYear = secondinYear / birthSec;
        double deathperYear = secondinYear / deathSec;
        double immigperYear = secondinYear / ImmigSec;

        //population in 5 years
        double population = 312032486.0;
        
        for (int i = 1; i <= 5; i++) {
            population += birthperYear - deathperYear + immigperYear;
                System.out.print("year " + i + ": ");
                System.out.printf("%1.0f", population);
                System.out.println();
            }
    
    }

}
    

