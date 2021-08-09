public class LargestPrime {
    public static int getLargestPrime(int num){
        if(num<2){
            return -1;
        }
        int lastPrime = num;
        for(int i=2;i<= num/2; i++){
            if(num%i == 0){
                boolean flag = true;
                for(int j=2;j<=(double) Math.sqrt(i);j++){
                    if(i%j==0){
                        flag = false;
                    }
                }
                if(flag){
                    lastPrime = i;
                }
            }
        }
        return lastPrime;
    }
}
