// WAP to print the grade of a student according to the percentage?

public class StudentPercentage{
    
    public static void main(String[]args){

        int per=85;

        if(per <= 100 && per >= 91){
            System.out.println("A+");
        }
        else if(per <= 90 && per >= 81){
            System.out.println("A"); //A
        }
        else if(per <= 80 && per >= 71){
            System.out.println("B+");
        }
        else if(per <= 70 && per >= 61){
            System.out.println("B");
        }
        else if(per <= 60 && per >= 51){
            System.out.println("C");
        }
        else if(per <= 50 && per >= 33){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }

    }

}