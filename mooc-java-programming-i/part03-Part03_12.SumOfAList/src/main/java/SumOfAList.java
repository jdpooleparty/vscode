
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne

        //sum the inputs

       // int sum = 0;
       // for (int i = 0; i < list.size(); i++) {
       //     sum += list.get(i);
       // }
       // System.out.println("Sum of the list: " + sum);
        
        int sum = 0;
        for (int i : list) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
