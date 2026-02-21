// WAP to implement a simple calculator using else-if ladder?
public class Calculator {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        char op = '+';

        if(op == '+'){
            System.out.println("Sum is" + (x+y)); //sum is 30
        }
            else if(op == '-'){
                System.out.println("Sub is" + (x-y));
            }

            else if(op == '*'){
                System.out.println("Prod is" + (x*y));
            }

            else{
                 System.out.println("Invalid op"); 
           }

         }
     }


    
    

