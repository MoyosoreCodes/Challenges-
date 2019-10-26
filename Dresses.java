public class Dresses{

    Dresses(){System.out.println("This is the blue print for dresses");}
}
public class designer1 extends Dresses{
    designer1(){System.out.println("Customized version one");}
}
public class designer2 extends designer1{
    designer2(){System.out.println("Customized verion two");}

    public static void main (String[] args){
        designer2 st = new designer2();
    }
}