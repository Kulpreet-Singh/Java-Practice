import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;
        long avgLong = 0;
        while(true){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int num = scanner.nextInt();
                sum += num;
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        avg = (double) sum / count;
        avgLong = Math.round(avg);
        System.out.println("SUM = " + sum + " AVG = " + avgLong);
        scanner.close();
    }
}
