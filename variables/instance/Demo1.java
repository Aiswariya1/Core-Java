// Multiple instance variables

 public class Demo1 {
  int num1=10;
  int num2=20;
  int num3=30;    
    public static void main(String[]args){
       Demo1 t1=new Demo1();
          System.out.println(t1.num1); //10
          System.out.println(t1.num2); //20
          System.out.println(t1.num3); //30
    }
}