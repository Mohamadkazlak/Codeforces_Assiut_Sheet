package problem_19;

import java.util.Scanner;

public class problem19 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float x = in.nextFloat();

        if(x >= 0 && x <= 25){
            System.out.println("Interval" + " [0,25]");
        } else if (x > 25 && x <= 50){
            System.out.println("Interval" + " (25,50]");
        } else if (x > 50 && x <= 75) {
            System.out.println("Interval" + " (50,75]");
        }else if (x > 75 && x <= 100){
            System.out.println("Interval" + " (75,100]");
        }else {
            System.out.println("Out of Intervals");
        }
    }
}
