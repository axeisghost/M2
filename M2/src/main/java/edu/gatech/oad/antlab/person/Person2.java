package edu.gatech.oad.antlab.person;
import java.util.Random;
import java.util.ArrayList;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Bob
 * @author Yuhui Zhao
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
        /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
     public Person2(String pname) {
       name = pname;
     }
    /**
     * This method should take the string
     * input and return its characters in
     * random order.
     * given "gtg123b" it should return
     * something like "g3tb1g2".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private static String calc(String input) {
        int length = input.length();
        char[] charArray = new char[length];
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arr.add(Character.toString(input.charAt(i)));
        }
        Random rand = new Random();
        StringBuilder res = new StringBuilder();
        while(!arr.isEmpty()) {
            res = res.append(arr.remove(rand.nextInt(arr.size())));
        }

      return res.toString();
    }
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }
}

