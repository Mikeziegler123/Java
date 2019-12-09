//Java Program: Recursive Binary Search of String Array. | Author: Michael Ziegler
public class BinarySearch
{
  public static int search(String[] ar, String item, int first, int last)
  {
    int middle = (first+last)/2;
    
    if(last < first){
      return -1;
    }
    if (item.compareTo(ar[middle]) < 0){
      return search(ar, item, first, (middle-1));
    }
     if (item.compareTo(ar[middle]) > 0){
       return search(ar, item, (middle+1), last);
     }
     if(item.compareTo(ar[middle]) == 0){
       return middle;
     }
   return -1;
  }
  public static void main(String[] args)
  {
    String item = "everest";
    String[] ar = {"apple", "banana", "cantelope", "diver", "everest"};
    System.out.println("Item found at position: " + ((search(ar, item, 0, ar.length-1))+1));
  }
}