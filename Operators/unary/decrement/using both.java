// program-01

class B {
public static void main(String[] args) {
int a = 10;
int b = --a + a-- + --a + a--;
System.out.println(a); //6
System.out.println(b); //32
  }
}

// program-02

class B1{
public static void main(String[] args) {
int x = 20;
int y = --x + x-- + --x + x-- + --x;
System.out.println(x); //15
System.out.println(y); //87
  }
}

// program-03

class B3{
public static void main(String[] args) {
int x = 6;
int y = 5;
int z = 4;
int result = x-- + --y + z-- + --x + y-- + --z;
System.out.println(x); //4
System.out.println(y); //3
System.out.println(z); //2
System.out.println(result); //24
  }
}

// program-04

class B4{
public static void main(String[] args) {
int a = 14;
int b = a-- + --a + a-- + --a + a-- + --a;
System.out.println(a); //8
System.out.println(b); //66
  }
}

// program-05

class B5{
public static void main(String[] args) {
int x = 10;
int y = 5;
int z = x-- + --x + y-- + --y + x-- + y-- + --x;
System.out.println(x); //6
System.out.println(y); //2
System.out.println(z); //43
  }
}