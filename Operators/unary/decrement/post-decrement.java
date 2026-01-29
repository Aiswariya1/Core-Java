//Example-01

class PostDecrement{
    public static void main(String[] args) {
    int x=13;
    x--;
    System.out.println(x); //12
    }
}

//Example-02
   
class PostDecrement1{
    public static void main(String[] args) {
    int x=15;
    int y=x--;
    System.out.println(x);  //14
    System.out.println(y);  //15
    }
}

//Example-03

class PostDecrement2{
    public static void main(String[] args) {
    int x=8;
    int y=x-- + x--;
    System.out.println(x);  //6
    System.out.println(y);  //15
    }
}

//Example-04

class PostDecrement3{
    public static void main(String[] args) {
    char ch='d';
    ch--;
    System.out.println(ch); //c 99
    }
}

