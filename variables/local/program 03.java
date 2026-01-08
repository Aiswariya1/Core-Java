   //Case-01   (Temporary variable-Destroyed after print)
    
class Test{
    public static void main(String[]args){
        if (true){
            int x=10;
            System.out.println(x); //10
        }
    }
}


    //Case-2  (Destroyed before print)

class Test{
    public static void main(String[]args){
        if (true){
            int x=10;
        }
        System.out.println(x); //compile-time error
    }
}
