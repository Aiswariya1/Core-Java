// WAP to count the digit of a number?

 public class CountTheDigit {
    public static void main(String[] args) {

        int count = 0;

        for( int num = 8092; num>0; num = num / 10){
             count++;
        }

        System.out.println(count);
    }
}
