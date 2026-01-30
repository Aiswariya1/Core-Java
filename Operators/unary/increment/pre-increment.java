//Example-01

class PreIncrement{
    public static void main(String[] args) {
    int x=10;
    ++x;
    System.out.println(x); //11
    }
}

//Example-02
   
class PreIncrement1{
    public static void main(String[] args) {
    int x=10;
    int y=++x;
    System.out.println(x);  //11
    System.out.println(y);  //11
    }
}

//Example-03

class PreIncrement2{
    public static void main(String[] args) {
    int x=3;
    int y=++x + ++x;
    System.out.println(x);  //5
    System.out.println(y);  //9
    }
}

//Example-04

class PreIncrement3{
    public static void main(String[] args) {
    double d=1.5;
    ++d;
    System.out.println(d); //2.5
    }
}

//Example-05

class PreIncrement4{
    public static void main(String[] args) {
    byte b=127;
    ++b;
    System.out.println(b); //-128
    ++b;
    System.out.println(b); //-127
    }
}