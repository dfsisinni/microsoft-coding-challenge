import java.util.*;

public class problem1 {

    public static void main(String[] args) {

        //first input indicates number of subsequent input lines
        //each line contains a number of strings
            //find all the characters repeating in each string
            //output characters in order from 0-9, A-Z, a-z


        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLines; i++) {
            String in = scanner.nextLine();
            String [] strs = in.split(" ");
            printUniqueCharsInOrder(strs);
        }


    }

    public static void printUniqueCharsInOrder (String [] strs) {
        HashSet <Character> unique = new HashSet<Character>();
        for (int i = 0; i < strs.length; i++) {
            HashSet <Character> second = new HashSet<Character>();
            for (int z = 0; z < strs[i].length(); z++) {
                if (i == 0) {
                    if (!unique.contains(strs[i].charAt(z))) {
                        unique.add(strs[i].charAt(z));
                    }
                } else {
                    if (unique.contains(strs[i].charAt(z))) {
                        second.add(strs[i].charAt(z));
                    }
                }
            }
            if (i > 0) {
                unique = second;
            }
        }

        int [] array = new int [unique.size()];
        int i = 0;
        for (Character ch : unique) {
            array[i] = (int) ch;
            i++;
        }

        Arrays.sort(array);
        for (int z = 0; z < array.length; z++) {
            System.out.print((char) array[z]);
        }
        System.out.println();
    }
}
