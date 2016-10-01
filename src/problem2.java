import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dane on 9/30/16.
 */
public class problem2 {

    //first line of indicates # of integer arrays (one array per line of input)
        //arrays are already ordered
        //output the missing numbers for each array

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int numArrays = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numArrays; i++) {
            String in = scanner.nextLine();
            String input [] = in.split(" ");
            int arr [] = new int [input.length];

            for (int z = 0; z < input.length; z++) {
                arr[z] = Integer.parseInt(input[z]);
            }

            printMissing(arr);
        }
    }

    public static void printMissing (int [] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] != array[i] + 1 ) {
                int diff = array[i + 1] - array[i];
                for (int z = array[i] + 1; z < array[i + 1]; z++) {
                    System.out.print(z);
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}
