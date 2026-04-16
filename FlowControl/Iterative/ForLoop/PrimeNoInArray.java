public class PrimeNoInArray {

    public static void main(String[] args) {
        int[] arr={2,5,8,3,9,74,24,1};
    for(int i=0; i< arr.length; i++)
        {
        int num=arr[i];
        int count=0;
    
    for(int j=1; j<=num; j++){
        if(num%j==0){
            count++;
        }
    }
if(count==2){
    System.out.println(arr[i]);
           }
        }
    }
}