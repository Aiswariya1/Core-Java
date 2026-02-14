    // Access it in 3 common ways:-

    public class Testt2 {
      
    static int y=10;
    public static void main(String[]args){

      //by directly
         System.out.println(y); //10

      //by classname
         System.out.println(Testt2.y); //10

      //by object reference
         Testt2 t1=new Testt2();
         System.out.println(t1.y); //10

    }
}

