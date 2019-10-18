import java.util.*; 
import java.io.*;

class Main {

  public static String LongestWord(String sen) {
    String[] word = sen.split(" ");
     int max = 0;
    for (int i = 1; i < word.length; i++){
      if (word[i].length() > word[max].length()){
        max = i;
      }
    }
    return word[max];
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }

}