import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Ax Qy
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class RocketReturnKey {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int bHour;
        int bMinute;
        int bSecond;
        
        int flightSeconds;
        int totalSeconds;
        
        int rHour;
        int rMinute;
        int rSecond;
    
    // ***** objects *****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Rocket return calculator" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        System.out.println("enter the blast off time in the format hh mm ss.");
        bHour = scanner.nextInt();
        bMinute = scanner.nextInt();
        bSecond = scanner.nextInt();
        
        System.out.println("Now enter the flight time in seconds.");
        flightSeconds = scanner.nextInt();
     
    
    // ***** Main Processing *****
    
        totalSeconds = flightSeconds + (bHour * 3600) + (bMinute * 60) + bSecond;
        //System.out.println(totalSeconds);
        
        rHour = totalSeconds / 3600;
        rHour = rHour % 24;
        
        totalSeconds %= 3600;
        rMinute = totalSeconds / 60;
        rSecond = totalSeconds % 60;
        
    
    // ***** Print Formatted Output *****
        System.out.println(nl + "-------- Blast Off Time --------");
        System.out.println("Blast off time: " + bHour + ":" + bMinute + ":" + bSecond);
        System.out.println("Flight time: " + flightSeconds);
        System.out.println();
        System.out.println("-------- Return Time ---------");
        System.out.println("Return time: " + rHour + ":" + rMinute + ":" + rSecond);
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
