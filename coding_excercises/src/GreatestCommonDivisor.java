public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second < 10){
            return -1;
        }
        int min = (first < second)? first : second;
        int gcd = 1;
        for(int i=2;i<=min;i++){
            if((first%i == 0) && (second%i==0)){
                gcd = i;
            }
        }
        return gcd;
    }
}
