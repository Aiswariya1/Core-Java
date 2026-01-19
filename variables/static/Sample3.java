   // it shares same copy to every objects.

   class A1 {
      static int x=10;
        public static void main(String[]args){
          A1 a1=new A1();
          A1 a2=new A1();

          System.out.println(a1.x); //10
          System.out.println(a2.x); //10

            a1.x=20;
          System.out.println(a1.x); //20
          System.out.println(a2.x); //20
    }
   }