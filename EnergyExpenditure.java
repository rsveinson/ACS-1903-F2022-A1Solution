import java.util.Scanner;
/** 
 * ACS-1903 Assignment 1 Question 2
 * @Key 
*/

public class EnergyExpenditure{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // variables
        double weight = 0.0;
        int age = 0;
        int height = 0;
        char gender = 'm';
        char activityLevel = 'A';
        
        double bmr = 0.0;               // basal medabolic rate
        double tdee = 0.0;              // total daily energy expenditure
        double activityFactor = 0.0;    // based on input code   
        
        // get personal info
        System.out.println("Enter your weight (in kg), height (in cm), age (in years),and gender (m/f):");
        weight = scanner.nextDouble();
        height = scanner.nextInt();
        age = scanner.nextInt();
        gender = scanner.next().toLowerCase().charAt(0);  // have to extract the required char from the input string
        
        /*the following print lines are used to 
         * verify that the input is being read 
         * corrctly
         */
        // System.out.println(weight);
        // System.out.println(height);
        // System.out.println(age);
        // System.out.println(gender);
        
        // get activity level
        System.out.println("Enter your activity level:");
        System.out.println("[A]  Sedentary");
        System.out.println("[B]  Lightly Active");
        System.out.println("[C]  Moderate exercise");
        System.out.println("[D]  Very Active");
        System.out.println("[E]  Extra Active");
        
        activityLevel = scanner.next().toUpperCase().charAt(0);  // have to extract the required char from the input string
        //System.out.println(activityLevel);
        
        /* calculate the bmr
         * based on the formula given in the 
         * assignment instructions
         */
        if(gender == 'm'){
            bmr = 66 + (13.7 * weight) + (5 * height) -(6.8 * age);
        }//end gender m
        else{
            bmr = 655 + (9.6 * weight) + (1.8 * height) -(4.7 * age);
        }// end gender not m
        
        /* now the activity factor
         * set the level based on the code input
         * from the keyboard and the scale 
         * given in the assignment instructions
         */
        if(activityLevel == 'A'){
            activityFactor = 1.2;
        }// end A
        else if(activityLevel == 'B'){
            activityFactor = 1.375;
        }// end B
        else if(activityLevel == 'C'){
            activityFactor = 1.55;
        }// end C
        else if(activityLevel == 'D'){
            activityFactor = 1.725;
        }// end D
        else{
            activityFactor = 1.9;
        }// end E
        
        // tdee
        tdee = bmr * activityFactor;
        
        // print summarty result
        System.out.format("BMR: %.2f\n",bmr);
        System.out.format("TDEE: %.2f\n",tdee);
        
        // closing message
        
        System.out.println("end of program");
    }
}
