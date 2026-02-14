   // it shares same copy to every objects.

   public class Testt1 {
    
      static int x = 10;
    public static void main(String[]args){
        
          System.out.println(Testt1.x); //10
          System.out.println(Testt1.x); //10

            Testt1.x=20;

          System.out.println(Testt1.x); //20
          System.out.println(Testt1.x); //20
    }
   }
   
        