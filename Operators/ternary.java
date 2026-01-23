
//<--  (Condition ? Statement 1: Statement 2;)  -->
// True- Statement 1.
// False- Statement 2.

//ex-

class Ternary{
    public static void main(String[]args){
        int x = (10<20)? 30:40;
        System.out.println(x); //30(true)

        int y = (10>20)? 30:40;
        System.out.println(y); //40(false)

        int z =(10>20)? 
                     ((30>40)? 50:60): 
                     ((70<80)? 90:100 );

        System.out.println(z); //90
    }
}


//ex-2
class Ternary1 {
    public static void main(String[]args){
        int a = 10, b = 20, c = 15;

          int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

             System.out.println(largest); //20
    }
}

