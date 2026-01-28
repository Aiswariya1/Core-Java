    // Access it in 3 common ways:-

    class Sample2{
    static int y=10;
    public static void main(String[]args){

      //by directly
         System.out.println(y); //10

      //by classname
         System.out.println(Sample2.y); //10

      //by object reference
         Sample s1=new Sample();
         System.out.println(s1.y); //10

    }
}

