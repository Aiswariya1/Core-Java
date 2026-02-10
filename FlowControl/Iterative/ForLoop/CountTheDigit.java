// WAP to count the digit of a number?

 public class CountTheDigit {
    public static void main(String[] args) {
        int num = 8092;
        int count = 0;

        for( int i = 0; i <= num; i++){
             num = num / 10;
             count++;
        }
        System.out.println(count);
    }
}
