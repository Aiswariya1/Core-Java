public class PalindromeInString {
    
     public static void main(String[] args) {
        
        String str="Mom";
        String rev=" ";

        for(int i=str.length()-1;  i>=0; i++ ){
            rev= rev+str.charAt(i);
        }
        if(str.equals(rev)){
            
        }
    }
}
