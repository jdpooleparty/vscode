
import java.util.Scanner;
import java.lang.Math;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        
        int number = scanner.nextInt();
        while (number != -1) {
            statistics.addNumber(number);
            number = scanner.nextInt();
        }

        //sum all numbers
        System.out.println("Sum: " + statistics.sum());

        //sum all even numbers
        System.out.println("Sum of even numbers: " + statistics.sumEven());

        //sum all odd numbers
        System.out.println("Sum of odd numbers: " + statistics.sumOdd());
        


    }
}
