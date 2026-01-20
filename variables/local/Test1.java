 // In between local and static variable priority always goes to local variable 

 class Test2 {
    static int num=10;
    public static void main(String[]args){
        int num=20;

        System.out.println(num); //20  (local variable)

        System.out.println(Test2.num); //10  (static variable)
    }
 }