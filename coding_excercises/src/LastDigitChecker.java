public class LastDigitChecker {

    public static boolean isValid(int a){
        if(a<10 || a>1000){
            return false;
        }
        return true;
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(!(isValid(a) && isValid(b) && isValid(c))){
            return false;
        }
        int a0 = a%10;
        int b0 = b%10;
        int c0 = c%10;
        if(a0 == b0 || b0 == c0 || a0 == c0){
            return true;
        }
        return false;
    }
}
