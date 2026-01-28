// 1. Logical AND(&&)
// All conditions must be true

public class Logical{
    public static void main(String[] args) {
        int a =10;
        int b =20;
    
    if(a < b && b > 15 ){
        System.out.println(1);
    } else{
        System.out.println(0);
     }
  } 
    }
  

// 2. Logical OR(||)
// At least one condition must be true

public class LogicalOr {
    public static void main(String[] args) {
        int a =10;
        int b =5;
    
    if(a > b || b > 10 ){
        System.out.println(1);
    } else{
        System.out.println(0);
     }
  } 
    }