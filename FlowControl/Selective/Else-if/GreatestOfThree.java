
    public class GreatestOfThree {
    public static void main(String[] args) {

        int a = 10;
        int b = 25;
        int c = 15;

        if (a > b && a > c) {
            System.out.println("Greatest number is " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Greatest number is " + b);
        }
        else {
            System.out.println("Greatest number is " + c);
        }
    }
}

