/* Author: Michael Ziegler, John Ziegler
 * Purpose: To understand a simple file decryption by adjusting ASCII values upon reading in file characters.
 */

import java.io.*;
  public class fileDecryption
{ 
    public static void main(String args[] ) throws Exception
    {  
      File file = new File("D:\\newFile.txt");
      File newFile = new File("D:\\newFile2.txt");
 
       BufferedReader br = new BufferedReader(new FileReader(file)); 
       BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
      
       int n;
      
      while ((n = br.read()) != -1)
      {
       //Decryption
       n = n - 1;
       char ch = (char)n;
       int x = (int)ch;
       x = x - 1;
       char y = (char)x;
       System.out.println("Decrypting Character: " + y);
       bw.write(ch);  
      } 
      System.out.println("\nDecryption Complete"); 
      bw.close();
      br.close();
  }
}