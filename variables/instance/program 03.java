// it is not mandatory to initialise the non-static variable, the default value is given by JVM according to the datatypes.

package variables.instance;
 class Test{
    int num1; //instance variable(not initialized)
    public static void main(String[]args){
        Test t1 = new Test();
        System.out.println(t1.num1); //0 (int)
    }
 }