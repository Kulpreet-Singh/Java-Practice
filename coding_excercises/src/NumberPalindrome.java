public class NumberPalindrome {
    public static int reverse(int number){
        int flag  = 0;
        if(number<0){
            flag = 1;
            number*=-1;
        }
        int reverse = 0;
        while(number>0){
            int digit = number%10;
            number /= 10;
            reverse = reverse*10 + digit;
        }
        if(flag == 1){
            reverse*=-1;
        }
        return reverse;
    }
    public static boolean isPalindrome(int number){
        int reverseNumber = reverse(number);
        if(reverseNumber == number){
            return true;
        }
        return false;
    }
}
