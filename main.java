import java.util.*;

public class Main {
    public static void main(String[] args) {

        //For Loops
        System.out.println("For Loops");
        ForLoop forLoop = new ForLoop();
        forLoop.forwardLoop();
        System.out.println("**************************");
        forLoop.backwardLoop();
        System.out.println("**************************");
        forLoop.evenLoop();
        System.out.println("**************************");
        forLoop.oddLoop();
        System.out.println();

        //While Loops
        System.out.println("While Loops");
        WhileLoop whileLoop = new WhileLoop();
        whileLoop.forwardLoop();
        System.out.println("**************************");
        whileLoop.backwardLoop();
        System.out.println("**************************");
        whileLoop.oddLoop();
        System.out.println("**************************");
        whileLoop.evenLoop();
        System.out.println();

        System.out.println("**********************");
        System.out.println("The max of three");

        maxOfThree(3,3,1);
        System.out.println();
        validator(3,3,1);
    }
    public static void maxOfThree(int one, int two, int three){
        if(one > two && one > three){
            System.out.println(one + " is the maximum");
        }
        else if (two > one && two > three){
            System.out.println(two + " is the maximum");
        }
        else if (three > one && three > two){
            System.out.println(three + " is the maximum");
        }
        else if(one == three && one > two){
            System.out.println(one + " is the maximum, but the max is repeated in positions one and three");
        }
        else if(one == two && two > three){
            System.out.println(one + " is the maximum, but the max is repeated in positions one and two");
        }
        else if(three == two && two > one){
            System.out.println(two + " is the maximum, but the max is repeated in positions three and two");
        }
        else if(one == two && two == three){
            System.out.println(one + " is the maximum, but all numbers are the same ");
        }
    }

    public static void validator(int one, int two, int three){
        int max = Math.max(one, two);
        if(three > max){
            max = three;
        }
        System.out.println(max + " is verified as the maximum ");
    }

}
