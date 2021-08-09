public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b){
        if(a<10 || a>99 || b<10 || b>99){
            return false;
        }
        int a0 = a%10;
        int a1 = a/10;
        int b0 = b%10;
        int b1 = b/10;
        if(a0 == b0 || a0 == b1 || a1 == b0 || a1 == b1){
            return true;
        }
        return false;
    }
}
