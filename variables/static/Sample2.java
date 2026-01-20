    // Access it in 3 common ways:-

    class Test{
    static int y=10;
    public static void main(String[]args){

      //by directly
         System.out.println(y); //10

      //by classname
         System.out.println(Test.y); //10

      //by object reference
         Test t1=new Test();
         System.out.println(t1.y); //10

    }
}

