package algo_beginner;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class SetReview {
    public static void main(String[] args) {
        String st= "JJavvaDDevelloopperrg";
        System.out.println(firstRepeatingChar(st));
    }
    public static Character firstRepeatingChar(String str){
        // What is the time complexity of the following code? O(n)


        // create a hashSet
        Set<Character> chars=new HashSet<>(); // in here I have Space Complexity of O(n)
        // iterate over the char array and add chars into hashSet


        for(Character ch:str.toCharArray()) if (!chars.add(ch)) return ch;
        // if add ops is false return that char

        return null;
    }

}
