
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        //ask which item in the list to search for
        System.out.println("Search For?");
        String searchFor = scanner.nextLine();

        //create a boolean variable to test ArrayList for value
        boolean existsInArray = list.contains(searchFor);

        if (existsInArray){
            System.out.println(searchFor + " was found!");

        }

        else{
            System.out.println(searchFor + " was not found!");

        }

                 

    }
}
