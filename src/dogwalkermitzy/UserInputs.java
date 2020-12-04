package dogwalkermitzy;

//  * * *  U t i l i t i e s    C L A S S  * * * 

/*
    + File created to storage 2 methods to validate 2 kind of data input:
        * ValidUserText: to check if the String input is valid: no numbers, only letters entered.
        * ValidUserNum: to check if the integer input is valid: no letters, only numbers entered.
        @param prompt - the message to display on the screen, parameter given by the user
        @param userInput - string variable which returns the valid text or integer according to the method called.
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author MitzyMacias
 */
public class UserInputs {


// Method to validate if the user input is letters only    
    public static String ValidUserText(String prompt){
        BufferedReader myKB=new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        do{
            System.out.println(prompt);
            try{
                userInput=myKB.readLine();
                if(!userInput.matches("[A-Za-z]+")){
                    System.out.println("<< Please, write letters only  >>\n");
                }
            }
            catch(Exception e){
                System.out.println("Input error!");
                userInput="";
            }
        }while(!userInput.matches("[A-Za-z]+"));                                //Repeat it while the data input is not only letters
        return userInput;                                                       //it returns the valid data input
    }


//Method to validate if the user input is numbers only
    public static int ValidUserNum(String prompt,int MinVal){       //receive the parameters MinVal and MaxVal to define the range in which the number must be
        BufferedReader myKB=new BufferedReader(new InputStreamReader(System.in));
        int userInput=0;
        boolean valid=false;
        do{
            System.out.println(prompt);
            System.out.println("You must enter a value greater than "+MinVal+":");
            try{
                userInput=Integer.parseInt(myKB.readLine());
                valid=true;
            }
            catch(Exception e){
                System.out.println("That is not a number. Please, try again...");
            }
        }while((!valid)||(userInput<MinVal));               //Repeat it while the data input is not valid ant between the values entered as parameters
        return userInput;
    }

    
    
}

