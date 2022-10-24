import java.util.Scanner;
import javax.swing.JOptionPane;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class InitialismGenerator{
    public static void main(String[] args) {
        // ** Variables constants and objects **
        //Scanner scanner = new Scanner(System.in);
        
        String prompt;
        String movieTitle;
        String initials = "";        // the first letter of each wrod in the title
        
        char init = 'a';            // first character of each input token
        
        // ** get input **
        prompt = "Enter a movie title:";
        movieTitle = JOptionPane.showInputDialog(prompt);
        System.out.println(movieTitle);
               
        // ** processing **
        //create a scanner using the movie title
        Scanner scanner = new Scanner(movieTitle);
        
        // loop through the tokens in the movie titel
        while(scanner.hasNext()){
            // get the next token
            init = scanner.next().charAt(0);
            
            // see if the first letter is not lower case
            if(!(init >= 'a' && init <= 'z')){
                //System.out.println("upper");
                initials += init;
            }// end not lower case        
        }// end while more token s
        
        //use println to test development along the way
        //System.out.println(initials);
        
        
        // ** output
        JOptionPane.showMessageDialog(null, initials);
        
        // ** closing message **
        System.out.println("end of program");
    }
}
