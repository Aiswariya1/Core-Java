//Example-01

class PreDecrement{
    public static void main(String[] args) {
    int x=10;
    --x;
    System.out.println(x); //9
    }
}

//Example-02
   
class PreDecrement1{
    public static void main(String[] args) {
    int x=15;
    int y=--x;
    System.out.println(x);  //14
    System.out.println(y);  //14
    }
}

//Example-03

class PreDecrement2{
    public static void main(String[] args) {
    int x=8;
    int y=--x + --x;
    System.out.println(x);  //6
    System.out.println(y);  //13
    }
}

//Example-04

class PreDecrement3{
    public static void main(String[] args) {
    double d=3.5;
    --d;
    System.out.println(d); //2.5
    }
}