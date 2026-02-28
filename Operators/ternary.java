
//<--  (Condition ? Statement 1: Statement 2;)  -->
// True- Statement 1.
// False- Statement 2.

//ex-
 class Ternary{
    public static void main(String[]args){
        int a = 10;
        int b = 20;

        int x = (a<b)? 30:40;
        System.out.println(x); //30 (true)

        int y = (a>b) ? 30:40;
        System.out.println(y); //40 (false)

        int c = 70;
        int d = 80;

        int z =(a>b)? 
                     ((c>d)? 50:60): 
                     ((c<d)? 90:100 );

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

