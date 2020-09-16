package String;

import java.util.Scanner;

/*
Here is the exact algorithm to check if a given String is a rotation of another:

1) check the length of two strings, if the length is not same then return false
2) concatenate given string to itself
3) check if the rotated version of String exists in this concatenated string
4) if yes, then the second String is rotated version of the first string

 */

public class StringRotation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter original string");
        String input = scanner.nextLine();

        System.out.println("Please enter rotation of String");
        String rotation = scanner.nextLine();

        if (checkRotatation(input,rotation)){
            System.out.println(input + "and" + rotation + "are rotation of each other");

        }else{
            System.out.println("Sorry! they are not rotation of another");
        }

        scanner.close();

    }

    private static boolean checkRotatation(String original, String rotation) {
        if (original.length() != rotation.length()) {
            return false;
        }

        String concatenated = original + original;

        if(concatenated.indexOf(rotation) !=-1) {
            return true;
        }
        return false;

            }
        }



