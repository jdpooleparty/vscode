
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2, 0};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int i = 0; i < array.length; i++) {
            while (array[i] > 0) {
                System.out.print("*");
                array[i]--;
                
            }
            if (array[i] == 0) {
                System.out.print(" ");
            }
                System.out.println();
            

        }
    }

}
