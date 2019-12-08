import java.util.Scanner; //util package's Scanner class imported

/**
 *  Author: Salman
 *
 *  This program asks user for weight and height, calculates bmi and outputs
 *  underweight, optimal or overweight
 */
public class Chap3Prob3 {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     */
    public static void main (String[] args){
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter Weight in pounds: "); //asks weight
        double wht = kbd.nextDouble();
        System.out.print("Enter Height in inches: "); //asks height
        double ht = kbd.nextDouble();
        double bmi = wht*703.0/Math.pow(ht, 2); // calculates bmi
        //selects output considering bmi
        if (bmi >= 18.5 && bmi <= 25){
            System.out.println("Optimal");
        } else if (bmi < 18.5){
            System.out.println("Underweight");
        } else {
            System.out.println("Overweight");
        }
        kbd.close();
    }
}
