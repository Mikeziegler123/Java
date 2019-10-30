/* Author: Michael Ziegler
 * Purpose: Array Manipulation Practice
*/

import java.util.*;
import java.io.*;

public class ArrayManip
{
  static int AR_SIZE = 100;
  public static void main(String args[])
  {
    int count = 0;
    int itemI, itemD, itemF;
    int choice;
    int index;
    Scanner userInput = new Scanner(System.in);
    int[] ar = new int[AR_SIZE];
    
    for (int i = 0; i<ar.length; i++)
      ar[i] = 0;
    do{
    System.out.println("What would you like to do?\n");
    System.out.println("\tOption 1: Insert an Item");
    System.out.println("\tOption 2: Delete an Item");
    System.out.print("\tOption 3: Find an Item\n");
    System.out.print("\tOption 4: Print current list\n");
    System.out.print("\tOption 5: Exit\n\n");
    System.out.print("Enter Choice: " );
    choice = userInput.nextInt();
    
    switch(choice)
    {
      case 1:{
        System.out.print("Please enter item to Insert: ");
        itemI = userInput.nextInt();
        insertItem(itemI, ar);
      }
        break;
      case 2:{
        System.out.print("Please enter index of item to Delete: ");
        index = userInput.nextInt();
        deleteItem(index, ar);
      }
        break;
      case 3:{
        System.out.print("Please enter item to Find: ");
        itemF = userInput.nextInt(); 
        index = findItem(itemF, ar, count);
        System.out.print("\n" + itemF + " was successfully found at position " + index + "!\n\n");
      }
        break;
      case 4:{
        System.out.print("Here is your current list: \n");
        printArray(ar);
      }
        break;
   }
}while((choice<5) && (choice>0));
 System.out.print("\n\nGoodBye!\n\n");
  }//endMain
  
//Function Definition "Stubs"(To be completed):
  //INSERT_ITEM: inserts an item(A Last Name) into the array(STRING) in alphabetical Order.
  //Input: The Item, The Array, and a count of the items in the array.
  //Output: None
  public static void insertItem(int item, int[] ar)
  {
    int j= 98;
    int i = 0;
    if(ar[0] == 0)
    {
      ar[0] = item;
      System.out.println("Item successfully inserted!\n");
    }
    else
    {
      while((item>=ar[i])&&(ar[i] !=0))
      {
        i++;
      }
      while (j >= i)
      {
        ar[j+1] = ar[j];
        j--;
      }
      ar[i] = item;       
      
      System.out.println("Item successfully inserted!\n");
      
    }
  }
  //DELETE_ITEM: Removes an item(A Last Name) from the array(STRING).
  //Input: The Item, The Array, and a count of the items in the array.
  //Output: None
 public static void deleteItem(int index, int[]ar)
  {
   int x = index;
   System.out.print(ar[x] + " was successfully Deleted!\n");
   while (index < 98)
   {
        ar[index] = ar[index+1];
        index++;
   }
  }
  //FIND_ITEM: Finds an existing item(A Last Name) in the array, and returns it's index(position) to main.
  //Input: The Item, The Array, and a count of the items in the array.
  //Output: Returns an Integer(index) to main.
 public static int findItem(int item, int[]ar, int count)
  {
    int index = 0;
    while(!(ar[index]== item) && !(ar[index]==0))
    {
      index++;
    }
    if(ar[index]!=item)
        System.out.print("\nItem was not found\n");
    return index;
  }
 public static void printArray(int[] ar)
 {
   for(int i = 0; i < ar.length;i++)
         {
           if((i%10) == 0)
            { 
            System.out.println();
            }
           System.out.printf("%5d \t", ar[i]);
         }
      }
}
