import java.util.*;
class Greater{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the Third number: ");
        int c = sc.nextInt();
        sc.close();
        int max;
        
        if ((a<b) & (a<c)){
        max = b;
        }
        else if ((b<a) & (b<c))
        max = c;
        else 
        max = a;
    
        
            System.out.println("The greater number is  " + max );
        
         
    }
}