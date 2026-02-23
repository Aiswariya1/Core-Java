//program
 //example of chained + compound assingnment.

class ChainedAndCompound{
    public static void main(String[]args){

    int a,b,c,d;
    a = b = c = d=20;
    a += b-= c*=d /= 2;
    
    System.out.println(a  + "" + b + "" + c + "" + d); //-160, -180, 200, 10
       }
    }

    //Evaluation from Right to Left :-
      // d/2 --> d=d/2 --> 10
      //c*=10 --> c=c*10 -->200
      //b-=200 --> b=b-200 --> -180
      //a+=(-180) --> a=a+(-180)= -160