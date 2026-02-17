// WAP to count the sum of each digit of a number?

public class CountSumOfEachDigit {

public static void main(String[] args) {
    
    int sum = 0;
    int rem = 0;

    for(int num = 1292; num > 0; num = num/10){
        rem = num % 10;
        sum = sum + rem;
    }

   System.out.println(sum); //14

   }  
}