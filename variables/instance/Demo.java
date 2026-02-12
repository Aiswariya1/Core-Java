// it is declared inside the class, outside any method ,block or constructor.

public class Demo{
    int x=10; // instance variable
    public static void main(String[]args){
         Demo d=new Demo();
         System.out.println(d.x); //10
    }
}