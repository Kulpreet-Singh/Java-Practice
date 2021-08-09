public class NumberToWords {
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

    public static int getDigitCount(int number){
        int count = 0;
        if(number<0){
            return -1;
        }
        if(number==0){
            return 1;
        }
        while(number>0){
            count++;
            number/=10;
        }
        return count;
    }

    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        int count = getDigitCount(number);
        int reverseNum = reverse(number);
        while (reverseNum>0 || count > 0){
            int digit = reverseNum%10;
            reverseNum = reverseNum/10;
            count--;
            switch (digit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Other");
                    break;
            }
        }


    }
}
