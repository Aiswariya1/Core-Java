// It is like &, | or ^

// 1. (a & b)- it returns true if both  the operands are true.

//program

class Test{
    public static void main(String[] args) {
        System.out.println(true & true); //true
        System.out.println(true & false); //false
        System.out.println(false & false); //false
        System.out.println(false & true); //false
    }
}

// 2. (a | b)- it returns true if any one of the operands is true.

//program

class Test{
    public static void main(String[] args) {
        System.out.println(true | true); //true
        System.out.println(true | false); // true
        System.out.println(false | false); //false
        System.out.println(false | true); //true
    }
}

// 3. (a ^ b)- it returns true if any both  the operands are different.

//program

class Test{
    public static void main(String[] args) {
        System.out.println(true ^ true); //false
        System.out.println(true ^ false); //true
        System.out.println(false ^ false); //false
        System.out.println(false ^ true); //true
    }
}