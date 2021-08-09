public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        int a = goal/5;
        int b = goal%5;
        if(a<=bigCount){
            if(b<=smallCount){
                return true;
            } else {
                return false;
            }
        } else{
            goal -= (bigCount*5);
            if(goal <= smallCount){
                return true;
            }else{
                return false;
            }
        }
    }
}
