/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;
import jdk.internal.org.jline.utils.DiffHelper;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
 public enum Operation {PLUS,MINUS,DIVIDE,TIMES}
 
 private Operation c;
 

 public double x,y;
 double calculate(double x, double y) {
   
             
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: ");
        System.out.println("PLUS, MINUS, DIVIDE ,TIMES");
        String s= sc.next();
        Operation c=Operation.valueOf(s);
        c=Operation.PLUS;
        c=Operation.MINUS;
        c=Operation.DIVIDE;
        c=Operation.TIMES;
        switch (c) 
            
        {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
