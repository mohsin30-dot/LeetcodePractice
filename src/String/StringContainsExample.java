package String;

/**
 * How to check string for substring?
 * This program
 * demonstrate two ways to find if One String contains a particular word or not in Java.
 * contains() and indexOf() method of String class is used to check SubString
 */



public class StringContainsExample {

    public static void main(String[] args) {

        String word = "Hello World";


        //indexOf return -1 if String does not contain specified word
        if(word.indexOf("World") != -1){
            System.err.printf("Yes 'Hello World' contains word 'World'");
        }else{
            System.err.printf("Sorry 'Hello World' does not contains word 'World'" );
        }


    }
}
