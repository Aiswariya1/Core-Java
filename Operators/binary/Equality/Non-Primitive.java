// example-1

package binary.Equality;

class Test{
    public static void main(String[]args){

        Test t1= new Test();
        Test t2= new Test();

        System.out.println(t1==t2); //false

        Test t3 =t2;
        System.out.println(t3==t2); //true

    }
}