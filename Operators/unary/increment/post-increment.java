//Example-01

class PostIncrement{
    public static void main(String[] args) {
    int x=10;
    x++;
    System.out.println(x); //11
    }
}

//Example-02
   
class PostIncrement1{
    public static void main(String[] args) {
    int x=10;
    int y=x++;
    System.out.println(x);  //11
    System.out.println(y);  //10
    }
}

//Example-03

class PostIncrement2{
    public static void main(String[] args) {
    int x=3;
    int y=x++ + x++;
    System.out.println(x);  //5
    System.out.println(y);  //7 
    }
}

//Example-04

class PostIncrement3{
    public static void main(String[] args) {
    char ch='a';
    ch++;
    System.out.println(ch); //b , 98
    }
}

