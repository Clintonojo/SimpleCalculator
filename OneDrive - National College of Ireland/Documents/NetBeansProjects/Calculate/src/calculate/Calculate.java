/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculate;
import java.util.Scanner;



/**
 *
 * @author Clinton
 */
public class Calculate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //delcare cariables
        double number1;
        double number2;
        double sum;
        
        //declare objects
       Scanner Keyboard;
        
        //create object
        Keyboard= new Scanner(System.in);
        //input
        System.out.println("please enter number 1");
        number1=Keyboard.nextDouble();
        System.out.println("Please enter number 2");
        number2=Keyboard.nextDouble();//next integer The Next Int can be used for next datatype
        //Process
        sum= number2+number2;
        //output
        System.out.println("the sum of "+number1+"and "+number2+"is"+sum);
        
        
        
        
        
        
        
    }}
    

