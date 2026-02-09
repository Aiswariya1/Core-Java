// WAP to check whether a number is a buzz no or not.
    //Buzz- Number is divisible by 7 or ends with 7.

public class BuzzNo {
    public static void main(String[] args) {
        
        int num = 27;
        if(num % 10 == 7 || num % 7 == 0  ){
             System.out.println("Divisible by 7 or ends with 7");
        }
        else{
            System.out.println(" Not divisible by 7 or ends with 7");
        }
    }
 }
    

