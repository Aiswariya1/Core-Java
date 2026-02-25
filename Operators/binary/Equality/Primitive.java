 class Primitive{

    public static void main(String[]args){
        int x =10;
        int y =20;
       
        System.out.println(x==y); //false
        int z =20;
        
        System.out.println(y==z); //true
    }
}

//ex-2

class Primitive2{
    
    public static void main(String[]args){
        double d1 =1.5;
        double d2 =1.5;
        System.out.println(d1==d2); //true
        
    }
}

//ex-3

class Primitive3{

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1==b2); //false
    }
}

//ex-4
class Primitive4{
    public static void main(String[] args) {
        char ch1 ='a';
        char ch2 ='A';
        System.out.println(ch1==ch2); //false
        char ch3 ='a';
        System.out.println(ch1==ch3); //true
    }
}