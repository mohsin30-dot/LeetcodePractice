package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
*Here is the exact algorithm to solve this problem:

1) Create a Set like HashSet
2) Get all characters of String using the chars() method.
3) loop over all characters and insert into Set one at a time
4) If add() method return false then terminate the program because not all characters are unique.
5) If all characters are successfully inserted then return true because all characters of String is unique

*
*
*
 */

public class AllUniqueCharacters {

    public static void main(String[] args) throws Exception {

        // create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a String");
        String input = scanner.nextLine();

        if (isUnique(input)){
            System.out.println("All characters are string is unique");

        }else{
            System.out.println("all characters are string is not unique");
        }

        scanner.close();


    }
    public static boolean isUnique(String input) {

        //Create a set to insert characters
        Set<Character> set = new HashSet<>();


        //Get all characters from string
        char[]characters = input.toCharArray();
        for (Character c : characters){
            if (!set.add(c)){
                return false;
            }
        }
        return true;

    }
}
