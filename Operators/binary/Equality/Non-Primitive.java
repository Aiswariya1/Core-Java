// example-1

class EqualityNonPrimitiv{
    public static void main(String[]args){

        EqualityNonPrimitiv e1= new EqualityNonPrimitiv();
        EqualityNonPrimitiv e2= new EqualityNonPrimitiv();

        System.out.println(e1==e2); //false

        EqualityNonPrimitiv e3 =e2;
        System.out.println(e3==e2); //true

    }
}