// Java String matches() method
package com.strings;

// MyStrings class
public class MyStrings {

    // Main method to run java program
    public static void main(String [] args){

        // Regex to compare if string consists these words
        String regex = "cat|fish|dog";

        System.out.println("cat".matches(regex));
        System.out.println(("jellyfish".matches(regex)));
        System.out.println(("fish".matches(regex)));
        System.out.println(("dogfish".matches(regex)));
        System.out.println(("dog".matches(regex)));
    }
}
