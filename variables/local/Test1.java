 // In between local and static variable priority always goes to local variable 

public  class Test1 {
    static int num=10;
    public static void main(String[]args){
        int num=20;

        System.out.println(num); //20  (local variable)

        System.out.println(Test1.num); //10  (static variable)
    }
 }