// it shares different copy to different objects.


   class Demo3 {
    int num=10;
    public static void main(String[]args){
        Demo3 t1=new Demo3();
        System.out.println(t1.num); //10

        Demo3 t2=new Demo3();
        System.out.println(t2.num); //10
          t1.num=20;
          System.out.println(t1.num); //20
          System.out.println(t2.num); //10
    }
   }