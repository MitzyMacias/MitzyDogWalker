/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* First file in GitHub 04/12/2020
*/
package dogwalkermitzy;

import static dogwalkermitzy.UserInputs.ValidUserNum;
import static dogwalkermitzy.UserInputs.ValidUserText;
import java.util.regex.Pattern;

/**
 *
 * @author MitzyMacias
 * 
 *     - - D O G    W A L K E R  P R O G R A M - --
 */
public class DogWalkerMitzy {

    /**
     * @param args the command line arguments
     * @DogsN       variable to storage the number of dogs
     * @dogNames    array which storages the name of the dogs
     * @fDogs       variable with the number of dogs which name starts with "F"
     * @sixLet      variable with the number of dogs which name has 6 or more letters
     * @dogX        array which storage the name of the dogs with an "x" on its name
     * @matches     boolean variable which determines if the string has a "x" or "X"
     */
    public static void main(String[] args) {
        
        int DogsN=0;
        String[] dogNames;
        int fDogs=0;
        int SixLet=0;
        String[] dogX;
        String eachDog="";
        
        
        System.out.println(" * * *  D O G    W A L K E R   P R O G R A M  * * *\n");
        
        DogsN=ValidUserNum("How many dogs are you walking today? (Please, enter only a Number): ",0);
        
        dogNames=new String[DogsN];             //declaration of the variables
        dogX=new String[DogsN];
        
        int cont=0;
                
        for (int i=0;i<DogsN;i++)               //Loop to ask for the name of the dogs
        {
            System.out.println("------------------------ \n");
            dogNames[i]=ValidUserText("Please, write the name of the dog number "+(i+1)+": ");  //I called the method ValidUserText which is in the file USerInputs.java to validate it is only text
            eachDog=dogNames[i];                                                                //I storage the name of the dog in the variable eachDog to analise it
            if(eachDog.startsWith("f")||eachDog.startsWith("F")){                               //if the name starts with "f" or "F" 
                fDogs++;                                                                        // then add 1 to the counter fDogs
            }
            if(eachDog.length()>=6){                                                            //if the size of the name is equal or more than 6 letters
                SixLet++;                                                                       //add 1 to the counter SixLet
            }
            
            boolean matches=(Pattern.matches(".*x.*",eachDog)||Pattern.matches(".*X.*",eachDog));   
            //this variable check if inside the name(eachDog) there is an "x" or an "X"
            
            if(matches){                    //if it found an x or X put it in an array called dogX 
                dogX[cont]=eachDog;
                cont++;                     //to count how many registers there are in total
            }
            
        }
        System.out.println("------------------------ \n");
        System.out.println("There are "+fDogs+" dogs which name starts with 'F' ");
        System.out.println("There are "+SixLet+" dogs which name have 6 or more letters");
        
        if (dogX[0]==null)                                                              //if the array is null it means it is empty
                {
                System.out.println("There are NO dogs with letter 'x' on its name");     //so print there are no registers
                }
        else{
                System.out.println("These are the dogs with 'x' on its name: ");        //if there are registers, print a list of them.
                for(int i=0;i<dogX.length;i++){ 
                        if(dogX[i]!=null){
                            System.out.println((i+1)+". "+dogX[i]);
                        }
                        }
            }
        
        
                
        
        System.out.println("It is Diren");
        
    }
    
           
            
        
    
}
