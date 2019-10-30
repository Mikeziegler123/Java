/* Author: Michael Ziegler, John Ziegler
 * Purpose: To understand a simple file encryption by adjusting ASCII values upon reading in file characters.
 */

import java.io.*;
  public class fileEncryption
{ 
    public static void main(String args[] ) throws Exception
    {  
      File file = new File("D:\\testAverage.java");
      File newFile = new File("D:\\newFile.txt");
 
       BufferedReader br = new BufferedReader(new FileReader(file)); 
       BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
      int n;
      while ((n = br.read()) != -1)
      {
       //Encryption
       n = n + 1;
       char ch = (char)n;
       int x = (int)ch;
       x = x - 1;
       char y = (char)x;
       System.out.println("Encrypting Character: " + y);
       bw.write(ch);  
      } 
      System.out.println("\nEncryption Complete"); 
      bw.close();
      br.close();
  }
}