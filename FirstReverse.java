import java.util.*; 
import java.io.*;

class FirstReverse {

  public static String FirstRevers(String str) {
      StringBuffer buf = new StringBuffer(str);
      buf.reverse();
       
    return buf.toString();
       
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstRevers(s.nextLine())); 
    s.close();
  }

}