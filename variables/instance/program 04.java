// it shares different copy to different objects.

package variables.instance;
   class Test {
    int num=10;
    public static void main(String[]args){
        Test t1=new Test();
        System.out.println(t1.num); //10

        Test t2=new Test();
        System.out.println(t2.num); //10
          t1.num=20;
          System.out.println(t1.num); //20
          System.out.println(t2.num); //10
    }
   }