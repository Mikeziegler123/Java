/*Author(s): Michael Ziegler, John Ziegler
 * Purpose: To simply represent the Fetch, Decode, and Execute processes of a simple computer.
 */

import java.util.*;
import java.io.*;

public class BasicComputer3 {
  
   static int[] memory = new int[100];
   static int x = 0;
   static int opcode = 0;
   static int operand = 0;
   static boolean flag = false;
   static int instruct_register = 0000;
   static int Counter = 00;
   static int accumulator = 03;
 
    public static void main(String args[])throws IOException
    {
      //Main Function Calls:
      
      
      loadMemory();
      instruct_register = fetch(Counter);
      decode(instruct_register);
      System.out.println("opcode:" + opcode + "operand:" + operand);
      dump();
    }
     

    //********************************** END MAIN

    //Function Definitions
  public static void loadMemory() throws IOException
      {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Please enter File Name: ");
      String fileName = userInput.nextLine();  
      userInput.close();
      
      File file = new File(fileName);
      Scanner readFile = new Scanner(file);  
    
      for(int i = 0; i < memory.length;i++)
      {
          if(readFile.hasNext())
          {
              int x = readFile.nextInt();
              memory[i] = x;
          }
       }
  }
    //*********************** END OF LOAD MEMORY METHOD 

      public static void dump() throws IOException
      {
         for(int i = 0; i < memory.length;i++)
         {
           if((i%10) == 0)
            { 
            System.out.println();   
            }
           System.out.printf("+%04d \t", memory[i]);
         }
      }

      public static int fetch(int counter) throws IOException
      {
        int location = memory[counter];
        ++Counter;
        return location;
      }
      public static void decode(int InstructReg)
      {  
        opcode = (InstructReg / 100);
    operand = (InstructReg % 100);  
      }
       public static void execute() throws IOException
  {
    Scanner keyboard = new Scanner(System.in);
    String data = "";
    int number;
    char ascii;
    switch(opcode)
    {
     case 43: // write value
     {
       
     }
       break;                    
      case 35: // write ascii
      {
       //*********
      }
      break;
      case 33: // Read
      {                                    
      }
      break;
      case 32:  // Write
      {
        System.out.println(memory[operand]);
      } 
      break;
      case 31: // Load
      {
        accumulator = (memory[operand]);
      } 
      break;
      case 30: // Store
      {
        (memory[operand]) = accumulator;
      } 
      break;
      case 21: // Add
      {
      } 
      break;
     } 
    } 
}