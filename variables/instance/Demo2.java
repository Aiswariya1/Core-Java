// it is not mandatory to initialise the non-static variable, the default value is given by JVM according to the datatypes.


 class Demo2 {
    int num1; //instance variable(not initialized)
    public static void main(String[]args){
        Demo2 t1 = new Demo2();
        System.out.println(t1.num1); //0 (int)
    }
 }