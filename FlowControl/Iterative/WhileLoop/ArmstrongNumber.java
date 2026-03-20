// Write a java program to find the number is a Armstrong number or not? 

import java.util.Scanner;
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();

        int temp=n;
        int sum=0;
        int count=0;
        int rem=0;
    while(n>0){
         count++;
        n=n/10;
    }
    n=temp;
    while(n>0){
        rem=n%10;
        sum=sum +(int) Math.pow(rem,count);
         n=n/10;
    }
    n=temp;
    if(sum==n){
        System.out.println("Armstrong Number");
    }
    else{
        System.out.println("Not an Armstrong Number");
    }
 }    
}
