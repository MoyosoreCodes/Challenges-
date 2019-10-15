import java.util.*; 
import java.io.*;

class FirstFactorial {

  public static int FirstFactor(int num) {
    
    if (num <= 1){ 
    return 1;
    }
    else 
      return num * FirstFactor(num-1);
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactor(s.nextInt())); 
  }

}