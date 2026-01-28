  // it can be declared inside the class, outside any method, block or constructor.

class Sample{
     static int x=10; // static variable
    public static void main(String[]args){
         System.out.println(Sample.x); //10
         System.out.println(Sample.y); //20
    }
    static int y=20;
}                           