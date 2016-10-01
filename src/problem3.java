import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dane on 9/30/16.
 */
public class problem3 {

    //one line of input consisting of a row of colors (either red/orange/yellow/green/blue/purple/blank)
        //output according to specified pattern
        //output consists of red/yellow/blue/blank
        //output can not have 2 consecutive blanks and can not end with a blank

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        String rawInput = scanner.nextLine();
        String [] arr = rawInput.split(" ");

        output(arr);

    }

    public static void output (String [] arr) {


        List<String> output = new ArrayList<String>();
        if (isPrimaryColor(arr[0])) {
            output.add(arr[0]);
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }

        for (int i = 1; i < arr.length; i++) {
            output.add(colorToAdd(getLastElement(output), arr[i]));
        }

        if (output.get(output.size() - 1).equals("blank")) {
            output.remove(output.size() - 1);
        }

        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i) + " ");
        }
        System.out.println();
    }

    public static String getLastElement (List <String> list) {
        return list.get(list.size() - 1);
    }

    public static String colorToAdd (String outted, String next) {
        if (next.equals("purple")) {
            if (outted.equals("blue")) {
                return "red";
            } else if (outted.equals("red")) {
                return "blue";
            }
        } else if (next.equals("orange")) {
            if (outted.equals("yellow")) {
                return "red";
            } else if (outted.equals("red")) {
                return "yellow";
            }
        } else if (next.equals("green")) {
            if (outted.equals("blue")) {
                return "yellow";
            } else if (outted.equals("yellow")) {
                return "blue";
            }
        } else if (next.equals("red")) {
            if (outted.equals("blank")) {
                return "red";
            } else if (outted.equals("red")) {
                return "blank";
            } else {
                return "red";
            }
        } else if (next.equals("blue")) {
            if (outted.equals("blank")) {
                return "blue";
            } else if (outted.equals("blue")) {
                return "blank";
            } else {
                return "blue";
            }
        } else if (next.equals("yellow")) {
            if (outted.equals("blank")) {
                return "yellow";
            } else if (outted.equals("yellow")) {
                return "blank";
            } else {
                return "yellow";
            }
        } else if (next.equals("blank")) {
            if (outted.equals("blank")) {
                return "";
            } else {
                return outted;
            }
        }


        return "";
    }

    public static boolean isPrimaryColor(String in) {
        if (in.equals("red") || in.equals("blue") || in.equals("yellow")) {
            return true;
        }

        return false;
    }
}
