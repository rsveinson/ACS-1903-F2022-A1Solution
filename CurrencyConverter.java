import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class CurrencyConverter{
    public static void main(String[] args) {
    // *** constants and variables ***
    
        // conversion rates for usd, japanese yen and bg pound
        final double USDRATE = 0.73;
        final double JPYRATE = 105.42;
        final double GBPRATE = 0.68;
        
        int cdn = 0;                    // amount in Canadian dollars
        double exchangeAmount = 0.0;    // exchanged amout
        double exchangeFactor = 0.0;    // exchange factor
        
        String foriegnCurrency;         // foreign currency selected
        
        Scanner scanner = new Scanner(System.in);
        
        // ** get foreign currency type **
        System.out.println("Select a currency.");
        System.out.println("[USD] Unisted States Dollars.");
        System.out.println("[JPY] Japanese Yen.");
        System.out.println("[GBP] British Pound Sterling.");
        foriegnCurrency = scanner.next();
        
        // make sure it's upper case
        foriegnCurrency = foriegnCurrency.toUpperCase();
        System.out.println();
        
        // ** set the currency exchange rate
        if(foriegnCurrency.equalsIgnoreCase("USD")){
            exchangeFactor = USDRATE;
        }// end usd exchange rate
        else if(foriegnCurrency.equalsIgnoreCase("JPY")){
            exchangeFactor = JPYRATE;
        }// end JPY rate
        else{
            exchangeFactor = GBPRATE;
        }// end BGP rate
                
        // print the column headings
        System.out.println("CAD\t" + foriegnCurrency);
        System.out.println("-------------------");
        
        // ** calculate and print the exchange table **
        
        cdn = 10;               // explicit inital value for control variable
        
        while(cdn <= 1000){
            System.out.print(cdn + "\t");
            
            // calculate exchange amount
            exchangeAmount = cdn * exchangeFactor;
            
            // print the foreign currency amount
            System.out.format("%.2f\n", exchangeAmount);
                
            
            // print the $100 dividing line
            if(cdn % 100 == 0)
                System.out.println("-------------------");
                
            // update control variable
            cdn += 10;          // increase cdb dollar amount by 10
        }// end exch table
        

        System.out.println("end of program");
    }
}
