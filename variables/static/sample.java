  // it can be declared inside the class, outside any method, block or constructor.

class A {
     static int x=10; // static variable
    public static void main(String[]args){
         System.out.println(A.x); //10
         System.out.println(A.y); //20
    }
    static int y=20;
}                           