//Example-01

class Test{
    public static void main(String[] args) {
    int x=10;
    x++;
    System.out.println(x); //11
    }
}

//Example-02
   
class Test1{
    public static void main(String[] args) {
    int x=10;
    int y=x++;
    System.out.println(x);  //11
    System.out.println(y);  //10
    }
}

//Example-03

class Test2{
    public static void main(String[] args) {
    int x=3;
    int y=x++ + x++;
    System.out.println(x);  //5
    System.out.println(y);  //7 
    }
}

//Example-04

class Test3{
    public static void main(String[] args) {
    char ch='a';
    ch++;
    System.out.println(ch); //b , 98
    }
}

