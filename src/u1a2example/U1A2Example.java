/*
 * The purpose of this program is to pratics the example of the Unit1 Activity 2.
 */

package u1a2example;

/**
 *
 * @author Gloria Song
 * Data : 2018/9/10
 */
public class U1A2Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Example 1 : Length Property
        String country;
        country = "Canada";
        System.out.println("The number of letters in the string country"
        +" is: " + country.length());
        
        //Example 2 : charAt() Method
        String AWords = "TeddyBear";
        for(int i = 0; i < AWords.length(); i++) {
          System.out.println(AWords.charAt(i));
        }
        
        //Example 3 : charCodeAt() Method
        //Unicode : https://unicode-table.com/en/#latin-1-supplement
        String str = "Dengyunjing!";
        for(int i = 0; i < str.length(); i++) {
          System.out.println(str.charAt(i) +" - " + 
           (int)str.charAt(i));
        }
        
        //Example 4 : 
        
    }
    
}
