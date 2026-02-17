//WAP to reverse a number?

public class ReverseANumber {

    public static void main(String[] args) {

        int reverse = 0;

        for(int num = 1234; num > 0; num = num / 10){
            int rem= num % 10;
             reverse = reverse * 10 + rem;
        }
        System.out.println(reverse); //4321
    }
    
}
