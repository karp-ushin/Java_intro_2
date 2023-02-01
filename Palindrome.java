import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        sc.close();
        boolean isPalindrome = true;
        int i = 0;
        while(isPalindrome && (i < str.length() / 2) ){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                isPalindrome = false;
            }
            i++;
        }
        if (isPalindrome){
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
    
}