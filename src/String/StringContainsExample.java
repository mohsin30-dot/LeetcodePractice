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
            System.err.printf("Yes '%s' contains word 'World' %n" , word);


        }else{
            System.err.printf("Sorry '%s' does not contains word 'World' %n" );
        }

        //contains method return boolean true if String contains specified word



        if(word.contains("Hello")){
            System.err.printf("Yes 'Hello World' contains word 'Hello'");
        }else{
            System.err.printf("Sorry 'Hello World' does not contains word 'Hello'" );
        }


    }
}
