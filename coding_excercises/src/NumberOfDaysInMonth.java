public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        if((year%100 == 0 && year%400 == 0) || (year%4==0 && year%100!=0)){
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if(year < 1 || year > 9999){
            return -1;
        }
        boolean isLeap = isLeapYear(year);
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if(isLeap){
                    return 29;
                } else {
                    return 28;
                }
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;
        }
    }
}
