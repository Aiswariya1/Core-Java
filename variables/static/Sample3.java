   // it shares same copy to every objects.

   class Z1{
      static int x=10;
        public static void main(String[]args){
          Z1 z1=new Z1();
          Z1 z2=new Z1();

          System.out.println(z1.x); //10
          System.out.println(z2.x); //10

            z1.x=20;
          System.out.println(z1.x); //20
          System.out.println(z2.x); //20
    }
   }